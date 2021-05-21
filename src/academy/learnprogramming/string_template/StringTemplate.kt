package academy.learnprogramming.string_template

import academy.learnprogramming.Employee

fun main() {

    val employee = Employee("Helena", 1)

    println(employee)
    println("The id of employee is ${employee.id} \n")

    val change = 4.22

    println("The value of the change is \$$change")
    println("To use the $ sign we use scape character \$change\n")

    val numerator = 10.90
    val denominator = 20.00

    println("The value of $numerator divided by $denominator is ${numerator / denominator}")
}