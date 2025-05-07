# SparkExecutorPlugins for Spark 2.4 and 3.x

This repository provides examples of Spark Executor Plugins for both Spark 2.4.x and 3.x. Executor plugins allow for the execution of custom code at the startup of Spark executors, making them useful for extending monitoring, configuration, and other functionalities.

## Overview

* **Spark 2.4.x**: The plugins in this repository are primarily designed for Spark 2.4.x, using the `org.apache.spark.ExecutorPlugin` interface. They can be used to run code at executor startup.
* **Spark 3.x**: Spark 3.x introduces an extended and potentially incompatible plugin API. For examples compatible with Spark 3.x, see the [Spark 3.x examples](https://github.com/cerndb/SparkPlugins).

### Contact

For questions or further information, please contact: [Luca.Canali@cern.ch](mailto:Luca.Canali@cern.ch)

## Build Instructions

To build the project, use the following command:

```bash
sbt +package
```

## Using the Executor Plugins

Executor plugins implement the `org.apache.spark.ExecutorPlugin` interface and can be configured to run custom code at the startup of Spark executors. This can be useful for:

* Extending monitoring (e.g., collecting system metrics)
* Customizing executor environments
* Running system commands

### Usage Example

To use an executor plugin with Spark, use the following command:

```bash
/bin/spark-shell --master yarn --jars <path>/sparkexecutorplugins_2.11-0.1.jar \
--conf spark.executor.plugins=ch.cern.ExecutorPluginJava.RunOSCommandPlugin
```

### Available Plugin Code Examples

This repository provides several example plugins written in both Scala and Java:

#### Scala

* **DemoPlugin**: A basic plugin demonstrating the use of the `ExecutorPlugin` interface for simple actions at executor startup.

#### Java

* **DemoPlugin**: A basic plugin for testing purposes.
* **RunOSCommandPlugin**: A plugin that demonstrates how to run OS commands at executor startup.

## Compatibility

* Spark 2.4.x: Fully compatible with the examples in this repository.
* Spark 3.x: The plugin API has been extended and may not be directly compatible. For updated examples, see [Spark 3.x examples](https://github.com/cerndb/SparkPlugins)

## License

This project is licensed under the CERN Open Source License. See the LICENSE file for details.

