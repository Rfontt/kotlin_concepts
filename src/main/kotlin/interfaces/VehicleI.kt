package interfaces

interface VehicleI {
    val providerInfo: String
    fun ride(): Boolean

    fun printInfo() {
        println(providerInfo)
    }

    fun getInitialYear(): Int
}