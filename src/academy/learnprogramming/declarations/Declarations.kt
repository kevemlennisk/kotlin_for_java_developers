package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    var employees: EmployeeSet

    var number: Int = 45                                            //Mutable variable. It is underlined and it can be reassigned

    val employee = Employee("Julia Ma", 1)                //Immutable variable. It cannot be reassigned
    employee.name = "Ju Matos"

    val employee1: Employee                                         //Declares a immutable variable to be assigned
                                                                    //at some point
    if (number > 50) {
        employee1 = Employee("John Doe", 2)
    } else {
        employee1 = Employee("William Bonner", 2)
    }
}

class Employee(var name: String, val id: Int){

    override fun equals(other: Any?): Boolean {                     //Generic object that can hold any kotlin object
        if (other is Employee) {
            return (name == other.name) and (id == other.id)        //Kotlin can use spelled operator
        }

        return false
    }

}