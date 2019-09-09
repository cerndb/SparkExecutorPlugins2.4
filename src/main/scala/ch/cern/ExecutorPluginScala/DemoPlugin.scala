package ch.cern.ExecutorPluginScala

// Basic example of Spark Executor Plugin in Scala
// code adapted from [SPARK-24918]

class DemoPlugin extends org.apache.spark.ExecutorPlugin {

  override def init() : Unit = {
    DemoPlugin.numSuccessfulPlugins += 1
  }

  override def shutdown() : Unit = {
    DemoPlugin.numSuccessfulTerminations += 1
  }
}

object DemoPlugin {
  var numSuccessfulPlugins : Int = 0
  var numSuccessfulTerminations: Int = 0
}
