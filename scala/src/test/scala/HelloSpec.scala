import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.scalatest.Matchers

@RunWith(classOf[JUnitRunner])
class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "have tests" in {
    true shouldBe true
  }
}
