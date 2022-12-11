package functions

fun sayHello(greeting: String, vararg itemsToGreet: String): Unit {
    itemsToGreet.forEach {itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String, name: String) = println("$greeting, $name")

fun params(vararg names: String, age: Int): Unit {
    names.forEach { name ->
        println("$name $age")
    }
}

fun main(args: Array<String>) {
//    functions.sayHello("Hi", "Hello", "World")

    greetPerson(greeting = "Good morning", name = "Rfontt")

    params(names = arrayOf("Rfont", "Test01"), age = 10)
}