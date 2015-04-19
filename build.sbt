import sbt._
import sbt.Keys._
import play.core.PlayVersion.{current => playVersion}

name := """assets"""

version := "0.1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.6"

pipelineStages := Seq(rjs, uglify, digest, gzip)

UglifyKeys.uglifyOps := { js =>
  Seq((js.sortBy(_._2), "main.min.js"))
}

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" %  "jquery"       % "2.1.3"
)

logBuffered in Test := false
Keys.fork in Test := false
parallelExecution in Test := false
