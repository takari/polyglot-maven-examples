import org.sonatype.maven.polyglot.scala.model._

implicit val scalaVersion = ScalaVersion("2.10.2")

Model(
  "com.example" % "minimal-scala" % "0.0.1-SNAPSHOT",
  dependencies = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  ),
  build = Build(
    tasks = Seq(Task("someTaskId", "verify") {
      ec => println("I'm Scala running during the verify phase. The ec passed in allows me to access the project")
    })
  ),  
  modelVersion = "4.0.0"
)