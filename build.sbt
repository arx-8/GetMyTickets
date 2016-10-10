name := "GetMyTickets"

version := "1.0"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-htmlunit-driver
libraryDependencies += "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.52.0"

// https://mvnrepository.com/artifact/com.google.api-client/google-api-client
libraryDependencies += "com.google.api-client" % "google-api-client" % "1.22.0"

// https://mvnrepository.com/artifact/com.google.gdata/core
libraryDependencies += "com.google.gdata" % "core" % "1.47.1"

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "example",
  scalaVersion := "2.11.8",
  test in assembly := {}
)

lazy val app = (project in file("src")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("example.App")
  )
//
//assemblyMergeStrategy in assembly := {
//  case PathList("javax", "servlet", xs@_*) => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".properties" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".xml" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".types" => MergeStrategy.first
//  case PathList(ps@_*) if ps.last endsWith ".class" => MergeStrategy.first
//  case "application.conf" => MergeStrategy.concat
//  case "unwanted.txt" => MergeStrategy.discard
//  case x =>
//    val oldStrategy = (assemblyMergeStrategy in assembly).value
//    oldStrategy(x)
//}