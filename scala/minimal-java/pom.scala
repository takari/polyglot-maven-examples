import org.sonatype.maven.polyglot.scala.model._
import scala.collection.immutable.Seq

Model(
  "com.example" % "minimal-java" % "0.0.1-SNAPSHOT",
  properties = Map(
    "maven.compiler.source" -> "1.7",
    "maven.compiler.target" -> "1.7",
    "project.build.sourceEncoding" -> "UTF-8"
  ),
  dependencies = Seq(
    "org.testng" % "testng" % "6.8.8" % "test"
  ),
  build = Build(
    tasks = Seq(Task("someTaskId", "verify") { ec =>
      println(s"I'm Scala running during the verify phase. The ec passed in allows me to access the project, e.g. the baseDir: ${ec.basedir}")
    })
  ),
  modelVersion = "4.0.0"
)
