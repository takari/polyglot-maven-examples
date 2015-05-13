import org.sonatype.maven.polyglot.scala.model._
import scala.collection.immutable.Seq

implicit val scalaVersion = ScalaVersion("2.11.6")

Model(
  "com.example" % "parent" % "0.0.1-SNAPSHOT",
  packaging = "pom",
  modelVersion = "4.0.0",
  modules = Seq("minimal-scala")
)
