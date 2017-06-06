import Dependencies._

name := "profiling-annotation"

version := "0.0.1"

// scalaVersion := "2.11.8"

// lazy val root = (project in file(".")).
//   settings(
//     inThisBuild(List(
//       organization := "com.example",
//       scalaVersion := "2.12.1",
//       version      := "0.1.0-SNAPSHOT"
//     )),
//     name := "Hello",
//     libraryDependencies += scalaTest % Test
//   )

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % "2.11.7"
)

val paradiseVersion = "2.1.0-M5"

addCompilerPlugin("org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full)

