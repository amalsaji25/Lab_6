ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "Akka_Simple_Task",
    libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % "2.6.20"
    )
  )
