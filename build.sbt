name := "sbt"

version := "0.1"

scalaVersion := "2.12.12"

lazy val actor = project.in(file("actor"))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.6.15",
      "com.typesafe.akka" %% "akka-persistence" % "2.6.15",
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15"% Test,
      "com.typesafe.akka" %% "akka-persistence" % "2.6.15" % Test


    )
  )

lazy val http = project.in(file("http"))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.2.5",
      "com.typesafe.akka" %% "akka-stream" % "2.6.15",
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.5" % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % Test,
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % Test,
      "org.mockito" %% "mockito-scala" % "1.16.37" % Test,

    )
  )

lazy val root = project.in(file(".")).aggregate(actor, http)