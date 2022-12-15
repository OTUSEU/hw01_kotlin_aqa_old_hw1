class Steps {


    fun afterTest() {
        println()
        println("After test...")
        println()
    }

    fun beforeTest() {
        println()
        println("Before test...")
        println()
    }
}

fun test(){
    println()
    println("Test run...")
    println()
}

fun main() {
    TestRun().runTest(steps = Steps(), test =  { test() })
}
