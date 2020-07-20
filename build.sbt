import Dependencies._

ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = project.in(file("."))
  .settings(
    name := "jsoniter-example",
    crossScalaVersions := List("2.12.10", "2.13.3"),

    libraryDependencies ++= Seq(
      "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core"   % "2.5.0",
      "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.5.0" % Provided
    )
  )
