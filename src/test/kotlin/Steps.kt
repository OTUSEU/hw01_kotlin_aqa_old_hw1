class Steps {


    fun afterTest() {
        println("After Test")
    }

    fun beforeTest() {
        println("Before Test")
    }
}

fun testRun(){
    println("Test run")
}

fun main() {
    TestRun().runTest(steps = Steps(), test =  { testRun() })
}
