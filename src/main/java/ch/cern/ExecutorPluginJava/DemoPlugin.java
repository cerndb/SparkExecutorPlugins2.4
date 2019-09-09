package ch.cern.ExecutorPluginJava;

// Basic example of Spark Executor Plugin in Java
// This just shows how to write a plugin, it does not do any action besides incrementing a cuonter
// code from [SPARK-24918]

public class DemoPlugin implements org.apache.spark.ExecutorPlugin {

    public static int numSuccessfulPlugins = 0;
    public static int numSuccessfulTerminations = 0;

    public void init() {
        numSuccessfulPlugins++;
    }
    public void shutdown() {
        numSuccessfulTerminations++;
    }
}
