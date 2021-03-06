package kategory.instances

import io.kotlintest.KTestJUnitRunner
import io.kotlintest.matchers.shouldNotBe
import kategory.*
import kategory.laws.EqLaws
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
class StringInstancesTest : UnitSpec() {
    init {
        "instances can be resolved implicitly" {
            semigroup<String>() shouldNotBe null
            monoid<String>() shouldNotBe null
            eq<String>() shouldNotBe null
        }

        testLaws(EqLaws.laws { it.toString() })
    }
}
