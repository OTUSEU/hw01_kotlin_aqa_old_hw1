import kotlin.reflect.full.declaredFunctions

interface TestRunner {

    fun <T> runTest(steps: T, test: () -> Unit)
}


class TestRun : TestRunner {

    override fun <T> runTest(steps: T, test: () -> Unit) {
      steps!!::class.declaredFunctions.filter { it.name.contains("before") }.forEach{
            println("Call before methods ${it.name}")
            it.call(steps)
        }

        test()

      steps!!::class.declaredFunctions.filter { it.name.contains("after") }.forEach{
           println("Call after methods ${it.name}")
           it.call(steps)
       }

    }


}