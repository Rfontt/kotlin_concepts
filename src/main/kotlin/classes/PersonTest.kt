package classes

import interfaces.SessionInfoProvider

fun main(args: Array<String>) {
    val person = Person("Rfontt", 20);

//    person.nickName = "New nickName"

    checkTypes(person)
    person.printInfo()
    println( person.getSessionID())
}

fun checkTypes(infoProvider: SessionInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("Its is a session provider")
    } else {
        println("It is not a session provider")
    }
}