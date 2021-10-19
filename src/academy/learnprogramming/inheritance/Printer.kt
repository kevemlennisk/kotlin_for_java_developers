package academy.learnprogramming.inheritance

fun main() {
    val laserPrinter = LaserPrinter("LaserJet Bla Bla Bla", 150)
    laserPrinter.printModelName()
    println(laserPrinter.bestSellingPrice())

    val specialLaserPrinter = SpecialLaserPrinter("Special LaserPrinter 7273")
    specialLaserPrinter.printModelName()
}

abstract class Printer(val modelName: String) {

    open fun printModelName() = println("This printer model is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    final override fun printModelName() = println("This LaserPrinter model name is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName : String ): LaserPrinter(modelName) {

}