fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.getValue("maxTank")

    // TODO 3
    println (type, maxSpeed, maxTank)
}
fun println (type: String, maxSpeed: String, maxTank: String){
    println("Vehicle\nType: $type\nMaximal Speed: $maxSpeed\nMaximal Tank: $maxTank")
}