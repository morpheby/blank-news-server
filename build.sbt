name := "blank-news-server"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
