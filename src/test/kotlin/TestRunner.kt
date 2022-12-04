interface TestRunner {

    fun <T> runTest(steps: T, test: () -> Unit)
}


class TestRun : TestRunner {
    override fun <T> runTest(steps: T, test: () -> Unit) {
        val testMethods = steps!!::class.members.sortedByDescending{it.name.contains ("test")}
        println(testMethods)

        testRun()
    }
}