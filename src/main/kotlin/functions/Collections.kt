package functions

class Collections {
    fun sayHello(greeting: String, itemToGreet: String): Unit = println("$greeting $itemToGreet")
}

fun main(args: Array<String>) {
    val collections = Collections();

    collections.sayHello("Test", "Tes2")

    val myArray = arrayOf("Kotlin", "Programming", "Comic Books")

    println(myArray[0])

    for (items in myArray) {
        println(items)
    }

    myArray.forEach {item ->
        println(item);
    }

    myArray.forEachIndexed { index, item -> println("$item $index") }
}