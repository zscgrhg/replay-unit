package com.etz.replay.unit.bm;

import com.etz.replay.unit.context.JsonUtil;
import com.sun.tools.attach.AgentInitializationException;
import lombok.SneakyThrows;
import org.jboss.byteman.agent.install.Install;
import org.jboss.byteman.agent.install.VMInfo;
import org.jboss.byteman.agent.submit.ScriptText;
import org.jboss.byteman.agent.submit.Submit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BMUtil {
    public final static String AGENT_VERSION = "org.jboss.byteman.agent.version";

    public static String getHost() {
        // agentHost can be overridden so don't look up previous
        return "localhost";
    }

    /**
     * getter for currently configured agent port setting
     *
     * @return the current port setting
     */
    public static int getPort() {
        // agentPort can be overridden so don't look up previous
        // unlesss current port is 0
        return 9999;
    }

    public static int getPid() {
        File file = new File("/proc/self/stat");
        if (!file.exists() || !file.canRead()) {
            return 0;
        }

        FileInputStream fis = null;
        int pid = 0;

        try {
            fis = new FileInputStream(file);
            byte[] bytes = new byte[10];
            StringBuilder builder = new StringBuilder();
            fis.read(bytes);
            for (int i = 0; i < 10; i++) {
                char c = (char) bytes[i];
                if (Character.isDigit(c)) {
                    builder.append(c);
                } else {
                    break;
                }
            }
            pid = Integer.valueOf(builder.toString());
        } catch (Exception e) {
            // ignore
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e1) {
                    // ignore
                }
            }
        }
        return pid;
    }

    public static void loadAgent() throws Exception {
        String id = null;

        // if we can get a proper pid on Linux  we use it
        int pid = getPid();
        // uncomment to force lookup by name even on Linux
        // pid = 0;

        if (pid > 0) {
            id = Integer.toString(pid);
        } else {
            /*
            VMInfo[] vmInfo = Install.availableVMs();
            // search for a JVM which looks like it is running a JUnit test
            // and install the agent into that JVM
            // it could be run from ant or maven or some other process!!
            for (int i = 0; i < vmInfo.length; i++) {
                String displayName = vmInfo[i].getDisplayName();
                if (displayName.startsWith("org.apache.tools.ant.taskdefs.optional.junit.JUnitTestRunner ")) {
                    // a JUnit test forked by ant
                    id = vmInfo[i].getId();
                    break;
                } else if (displayName.startsWith("org.apache.tools.ant.launch.Launcher ")) {
                    // a JUnit test run directly by ant
                    id = vmInfo[i].getId();
                    break;
                } else {
                    // TODO -- identify a forked maven test and then a test run directly or any other mode of running
                }
                */
            // alternative strategy which will  work everywhere
            // set a unique system property and then check each available VM until we find it
            String prop = "org.jboss.byteman.contrib.bmunit.agent.unique";
            String unique = Long.toHexString(System.currentTimeMillis());
            System.setProperty(prop, unique);
            VMInfo[] vmInfo = Install.availableVMs();
            for (int i = 0; i < vmInfo.length; i++) {
                String nextId = vmInfo[i].getId();
                String value = Install.getSystemProperty(nextId, prop);
                if (unique.equals(value)) {
                    id = nextId;
                    break;
                }
            }
            // last ditch effort to obtain pid on Windows where the availableVMs list may be empty
            if (id == null) {
                String processName = ManagementFactory.getRuntimeMXBean().getName();
                if (processName != null && processName.contains("@")) {
                    id = processName.substring(0, processName.indexOf("@"));
                    // check we actually have an integer
                    try {
                        Integer.parseInt(id);
                        // well, it's a number so now check it identifies the current VM
                        String value = Install.getSystemProperty(id, prop);
                        if (!unique.equals(value)) {
                            // nope, not the right process
                            id = null;
                        }
                    } catch (NumberFormatException e) {
                        // nope, not a number
                        id = null;
                    }
                }
            }
            // make sure we found a process
            if (id == null) {
                throw new Exception("BMUnit : Unable to identify test JVM process during agent load");
            }
        }

        try {
            System.out.println("BMUnit : loading agent id = " + id);
            Properties properties = new Properties();
            properties.setProperty("org.jboss.byteman.transform.all", "true");
            properties.setProperty("org.jboss.byteman.debug", "true");
            Submit submit = new Submit(getHost(), getPort());
            int size = properties.size();
            String[] proparray = new String[size];
            int i = 0;
            for (String key : properties.stringPropertyNames()) {
                proparray[i++] = key + "=" + properties.getProperty(key);
            }
            Install.install(id, true, false, getHost(), getPort(), proparray);
            submit.setSystemProperties(properties);
        } catch (AgentInitializationException e) {
            // this probably indicates that the agent is already installed
        }


    }

    @SneakyThrows
    public static void submitFile(String btm) {
        Submit submit = new Submit(getHost(), getPort());
        List<String> files = new ArrayList<String>();
        files.add(btm);
        System.out.println("BMUnit : loading file script = " + btm);
        submit.addRulesFromFiles(files);
    }

    @SneakyThrows
    public static void unload(String btm) {
        Submit submit = new Submit(getHost(), getPort());
        List<String> files = new ArrayList<String>();
        files.add(btm);
        System.out.println("BMUnit : unloading file script = " + btm);
        submit.deleteRulesFromFiles(files);
    }


    @SneakyThrows
    public static void submitText(List<ScriptText> scripts) {
        Submit submit = new Submit(getHost(), getPort());
        System.out.println(JsonUtil.toJsonString(scripts));
        submit.addScripts(scripts);
    }

    @SneakyThrows
    public static void unloadText(List<ScriptText> scripts) {
        Submit submit = new Submit(getHost(), getPort());

        submit.deleteScripts(scripts);
    }


}
