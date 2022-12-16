package classes

import interfaces.VehicleI

fun main(args: Array<String>) {
    val vehicle: VehicleI = Vehicle(
        "honda",
        "moto",
        "test"
    )

    vehicle.printInfo()
}