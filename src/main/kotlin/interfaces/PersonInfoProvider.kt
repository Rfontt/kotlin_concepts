package interfaces

interface PersonInfoProvider {
    fun printInfo(): Unit
}

interface SessionInfoProvider {
    fun getSessionID(): String
}