fun getGreeting(): String {
    val msg = "Hello"
    return "$msg, world";
}

// It does not return anything.
fun sayHello(): Unit {
    println("Sad, sad test!");
}

fun main(args: Array<String>) {
    println(getGreeting());
    sayHello();

    // It can not be changed.
    val name: String = "Rfontt";

    // It can change.
    var name2: String = "Jfontt";
    name2 = "LFontt";

    // It means that the variable can be null.
    val number: Int? = null;

    if (number == null) {
        println(true)
    } else {
        println("Hi")
    }

    when(number) {
        null -> println("Hi 1")
        else -> println("Test")
    }

    println("Hello, Kotlin");
}