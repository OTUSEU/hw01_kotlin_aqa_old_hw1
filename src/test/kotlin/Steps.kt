class Steps {

    fun afterTest() {
        println("After test...")
    }

    fun beforeTest() {
        println("Before test...")
    }
}
class Steps2 {
    fun beforeTest2() {
        println("Before test2...")
    }

    fun afterTest1() {
        println("After test1...")
    }

    fun beforeTest1() {
        println("Before test1...")
    }
    fun afterTest2() {
        println("After test...")
    }
}
class Steps3 {

}

fun test(){
    println("Test run...")
}

/**
 * Не применен DSL - стоит обычный вызов
 *
 */
fun main() {
    println("=======================================")
    TestRun().runTest(steps = Steps(), test =  { test() })
    // Можно так - вынести за скобки последний аргумент - будет более Котлин
    println("=======================================")
    TestRun().runTest(steps = Steps())   { test() }
    println("=======================================")
    TestRun().runTest(steps = Steps2())   { test() }
    println("=======================================")
    TestRun().runTest(steps = Steps3())   { test() }
}
