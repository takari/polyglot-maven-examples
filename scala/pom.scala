import org.sonatype.maven.polyglot.scala.model._
import scala.collection.immutable.Seq

implicit val scalaVersion = ScalaVersion("2.11.6")

ScalaModel(
  "com.example" % "minimal-scala" % "0.0.1-SNAPSHOT",
  dependencies = Seq(
    "junit" % "junit" % "4.12" % "test",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  ),
  build = Build(
    tasks = Seq(Task("someTaskId", "verify") { ec =>
      println("I'm Scala running during the verify phase. The ec passed in allows me to access the project")
    })
  ),  
  modelVersion = "4.0.0"
)