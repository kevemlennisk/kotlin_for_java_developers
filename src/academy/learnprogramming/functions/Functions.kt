package academy.learnprogramming.functions

fun main() {
    println(labelMultiply(3, 89))

    val employee = Employee("Juliana")

    println(employee.upperCaseFirstName())

    val car1 = Car("Volvo", "Blue", 2012)
    val car2 = Car("Ford", "Red", 2019)
    val car3 = Car("Tesla", "White", 2020)

    printCarColors("Bla", car1, car2, car3)

   val arrayOfCars = arrayOf(car1, car2, car3)

   val morecCars = arrayOf(*arrayOfCars, car3)                                      //use of the spread operator

   for(c in morecCars) {
       println(c)
   }
}

fun printCarColors(str: String, vararg cars: Car) {
    for(car in cars) {
        println("${car.model} : ${car.color}")
    }
}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "Result") = "$label : ${operand1 * operand2}"

class Employee(val firstName: String){

    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val model: String, val color: String, val year: Int) {

}