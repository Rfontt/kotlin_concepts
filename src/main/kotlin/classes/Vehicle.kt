package classes

import interfaces.VehicleI

open class Vehicle(val name: String, val type: String, override val providerInfo: String): VehicleI {
    val initalYear: Int = 1990
    override fun ride(): Boolean {
        this.printInfo()

        return true
    }

    override fun getInitialYear(): Int {
        return initalYear;
    }
}