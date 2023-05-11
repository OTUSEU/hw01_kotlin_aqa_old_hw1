import kotlin.reflect.full.declaredFunctions

/**
 * interface TestRunner { fun  runTest(steps: T, test: () -> Unit) }
 */

interface TestRunner {

    fun <T:Any> runTest(steps: T, test: () -> Unit)
}


class TestRun : TestRunner {
    // Нехорошо применять к steps !! - если придет null - все равно сломается
    // если не ожидаем null, то лучше ограничить Generic NotNull: T:Any и будет NotNull
    // !! применяется программистами временно, во время отладки. В окончательном коде !! должны быть убраны
    override fun <T: Any> runTest(steps: T, test: () -> Unit) {
        println("Вызов runTest для класса ${steps::class.simpleName}")

      steps::class.declaredFunctions.filter { it.name.contains("before") }.forEach{
            println("Call before methods ${it.name}")
            it.call(steps)
        }

        test()

      steps::class.declaredFunctions.filter { it.name.contains("after") }.forEach{
           println("Call after methods ${it.name}")
           it.call(steps)
       }

    }
}