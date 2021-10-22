package academy.learnprogramming.challenge3

import academy.learnprogramming.challenge3.Bicycle.Companion as Bicicle

fun main() {
//    val bike = Bicycle(1, 2, 3)
//    bike.printDescription()
//
//    val mountainBike = MountainBike(3, 5, 7, 34)
//    mountainBike.printDescription()
//
//    val roadBike = RoadBike(34, 56, 76, 4)
//    roadBike.printDescription()
//
//    val bike2 = Bicycle(1, 3)
//    bike2.printDescription()
//
//    val mountainBike2 = MountainBike(3, 4, 6)
//    mountainBike2.printDescription()
//
//    val roadBike2 = RoadBike(2, 5, 3)
//    roadBike2.printDescription()

    val bike3 = Bicycle("Blue", 1, 2)
    bike3.printDescription()

    Bicycle.availableColors.forEach { print("$it ") }
}

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    constructor( color: String, cadence: Int, speed: Int, gear: Int = 10) : this(cadence, speed, gear) {
        println("Color: $color")
    }

    companion object {
        var availableColors = arrayOf("blue", "red", "white", "black", "green", "brown")
    }

    fun applyBrake(decrement: Int) = speed.minus(decrement).also { speed = it }
    fun speedUp(increment: Int) = speed.plus(increment).also { speed = it }

    open fun printDescription() = println("Bike is in gear $gear, with a cadence of $cadence, travlling at speed of $speed.")
}

class MountainBike(var seatHeight: Int,
                   cadence: Int,
                   speed: Int,
                   gear: Int = 10): Bicycle(cadence, speed, gear) {

   override fun printDescription() {
       super.printDescription()
       println("The mountain bke has a seat height of $seatHeight inches")
       println("")
   }
}

class RoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10): Bicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth millimeters")
    }
}
