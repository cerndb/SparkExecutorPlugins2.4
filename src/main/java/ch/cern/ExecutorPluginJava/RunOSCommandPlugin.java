package ch.cern.ExecutorPluginJava;

import java.lang.*;
import java.io.*;

// Basic example of Spark Executor Plugin in Scala
// code adapted from [SPARK-24918]
// This plugin runs an OS command at the start of each Spark executor
// Note, it is just intended as a demonstrator

public class RunOSCommandPlugin implements org.apache.spark.ExecutorPlugin {

    public static int numSuccessfulPlugins = 0;
    public static int numSuccessfulTerminations = 0;

    public void init() {
        numSuccessfulPlugins++;
        try {
            // Runs an OS command at the executor startup,
           // "sleep" is used as a demonstrator
            final Process pr = Runtime.getRuntime().exec("touch /tmp/testPlugin");
        } catch(IOException e) {
            e.printStackTrace();
        }

        // pr.waitFor();
    }
    public void shutdown() {
        numSuccessfulTerminations++;
    }
}
