class Iterators {
}

fun main(args: Array<String>) {
    val myArray2 = listOf<String>("value 1", "value 2", "value 3");

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { (key, value) -> println("$key -> $value") }

    // It allows to add or subtract items.

    val myArray3 = mutableListOf<String>("value 4", "value 5", "value 6")

    myArray3.add("value 7")

    myArray3.forEach { item -> println("$item")}
}