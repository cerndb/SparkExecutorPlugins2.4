# SparkExecutorPlugins for Spark 2.4
Code with examples of Spark Executor Plugins for Spark 2.4.x  
Spark 3.0.0 is expected to have an extended and incompatible API, [see Spark 3.0.0 examples](https://github.com/SparkExecutorPlugins)  
Contact: Luca.Canali@cern.ch

**Build** with: `sbt +package`  

- **Executor plugins** implement the org.apache.spark.ExecutorPlugin interface and can be
used to run code at the startup of Spark executors. 
This feature is available in Spark 2.4.x. It can be useful for extending monitoring and configuration. Use as in the following example:
  ```
  /bin/spark-shell --master yarn --jars <path>/sparkexecutorplugins_2.11-0.1.jar \
  --conf spark.executor.plugins=ch.cern.ExecutorPluginJava.RunOSCommandPlugin 
  ```

### Plugin code examples
This repo contains a list of example plugin classes, written in Scala and Java. 
Both languages work for this task, it is mostly a matter of taste.

- **Scala**
  - DemoPlugin -> basic plugin for testing
   
- **Java** 
  - DemoPlugin -> basic plugin for testing
  - RunOSCommandPlugin -> plugin demonstrating how to run OS commands at executor startup
    