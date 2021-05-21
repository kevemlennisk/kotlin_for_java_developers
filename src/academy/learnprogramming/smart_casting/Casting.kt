package academy.learnprogramming.smart_casting

import academy.learnprogramming.Employee

fun main() {
    val employee = Employee("Mary", 1)

    val something: Any = employee

    if(something is Employee) {                             // kotlin has smart casting implementation,which means that */
        //val newEmployee = something as Employee           // after performing an 'is' operation, it is possible to treat
        println(something.name)                           // the variable as if it is casted. The compiler does the cast
    }                                                       // underneath

}