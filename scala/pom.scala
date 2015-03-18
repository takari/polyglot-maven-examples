import org.sonatype.maven.polyglot.scala.model._

implicit val scalaVersion = ScalaVersion("2.10.2")

Model(
  "com.example" % "minimal-scala" % "0.0.1-SNAPSHOT",
  dependencies = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  ),
  modelVersion = "4.0.0"
)