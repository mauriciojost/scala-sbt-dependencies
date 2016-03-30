import AssemblyKeys._

assemblySettings

name := "pack"

organization := "eu.pepot.eu"

version := "0.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.2"

mergeStrategy in assembly <<= (mergeStrategy in assembly) { mergeStrategy => {
    case entry => {
      val strategy = mergeStrategy(entry)
      if (strategy == MergeStrategy.deduplicate) MergeStrategy.first
      else strategy
    }
  }
}


packageArchetype.java_application

