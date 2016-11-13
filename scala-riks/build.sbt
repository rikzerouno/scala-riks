import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.rik",
      scalaVersion := "2.12.0"
    )),
    name := "scala-riks",
    libraryDependencies += scalaTest % Test
  )
