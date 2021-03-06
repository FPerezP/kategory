package kategory.fromkotlin

import io.kotlintest.KTestJUnitRunner
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import kategory.kindedj.KJDataclassKategoryShow
import kategory.kindedj.fromKindedJ
import kategory.kindedj.fromkindedj.KJDataclassHK.KJDataclass1
import kategory.kindedj.fromkindedj.KJDataclassKindedJShow
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
class KJDataclassTestsKotlin : StringSpec() {

    private val kinded = KJDataclass1(0)

    init {
        "Values should be convertible" {
            KJDataclassKindedJShow.INSTANCE.show(kinded) shouldBe KJDataclassKategoryShow.show(kinded.fromKindedJ())
        }
    }
}