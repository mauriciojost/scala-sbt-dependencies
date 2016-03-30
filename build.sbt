import AssemblyKeys._

assemblySettings

name := "pack"

organization := "eu.pepot.eu"

version := "0.1"

libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-nodemanager" % "2.2.0"

mergeStrategy in assembly <<= (mergeStrategy in assembly) { mergeStrategy => {
    case entry => {
      val strategy = mergeStrategy(entry)
      if (strategy == MergeStrategy.deduplicate) MergeStrategy.first
      else strategy
    }
  }
}

packageArchetype.java_application

