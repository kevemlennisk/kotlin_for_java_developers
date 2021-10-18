package academy.learnprogramming.access_modifiers

private class Employee(val firstName: String, fullTime: Boolean = true){
    var fullTime: Boolean = fullTime
    get() {
        println("Running the custom get method")
        return field
    }
    set(value) {
        println("Running the custom set method")
        field = value
    }
}

fun main() {
//    val employee = Employee("Juliana")
//    println("First name: ${employee.firstName}")
//    println("Full time: ${employee.fullTime}")
//    employee.fullTime = false
//    println("Full time: ${employee.fullTime}")
//
//    val employee2 = Employee("Juliana", false)
//    println("First name: ${employee2.firstName}")
//    println("Full time: ${employee2.fullTime}")
    val car = Car("Blue", "Volvo", 2012)
    println(car)
    val car2 = Car("Blue", "Volvo", 2012)
    println("Is car and car2 instances are structurally equals? ${car == car2}")
    println("Is car and car2 instances are referentially equals? ${car === car2}")
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2018, model = "Toyota")
    println(car4)

}

data class Car(val color: String, val model: String, val year: Int){

}