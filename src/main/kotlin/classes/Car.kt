package classes

class Car(name: String, type: String, providerInfo: String) : Vehicle(name, type, providerInfo) {
    override val providerInfo: String
        get() = super.providerInfo
}

fun main(args: Array<String>) {
    val vahicle: Vehicle = Car("test", "test", "test")

    println(vahicle.getInitialYear())
}