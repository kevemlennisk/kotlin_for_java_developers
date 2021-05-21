package academy.learnprogramming.equality

import academy.learnprogramming.declarations.Employee

fun main() {
    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("John", 2)
    val employee3 = Employee("John", 2)

    val employee4 = employee2

    //Structural equality
    println(employee1 == employee2)
    println(employee2 == employee3)
    println(employee2 != employee1)

    //Referential equality
    println(employee2 === employee3)
    println(employee4 === employee2)
    println(employee4 !== employee3)
}