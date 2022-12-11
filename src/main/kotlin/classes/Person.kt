package classes

import interfaces.PersonInfoProvider

class Person(
    val name: String,
    val age: Int
): PersonInfoProvider {
    private var nickName: String? = null

        set(value) {
            field = value;
            println("The new nickName is $value")
        }
        get() {
            println("The new nickName is $field")
            return field

        }

    override fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"

        println("$name ($nickNameToPrint) $age")
    }
}