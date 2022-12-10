fun sayHello(greeting: String, vararg itemsToGreet: String): Unit {
    itemsToGreet.forEach {itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}
fun main(args: Array<String>) {
    sayHello("Hi", "Hello", "World")
}