name := "SparkExecutorPlugins"

version := "0.1"
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.12"
crossScalaVersions := Seq("2.11.12", "2.12.8")

libraryDependencies += "io.dropwizard.metrics" % "metrics-core" % "3.1.5"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4"

//libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.4"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.2.0"
