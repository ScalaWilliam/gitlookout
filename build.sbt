
// https://groups.google.com/d/msg/play-framework/div4xgSVsjo/1btWIv9fAwAJ
resolvers in ThisBuild += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

lazy val web = project
  .enablePlugins(PlayScala)
  .settings(
    name := "web"
  )

name := "gitlookout"
scalaVersion in ThisBuild := "2.12.2"
libraryDependencies in ThisBuild += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// JGit to manipulate Git repositories
// https://mvnrepository.com/artifact/org.eclipse.jgit/org.eclipse.jgit
libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "4.8.0.201705170830-rc1"
