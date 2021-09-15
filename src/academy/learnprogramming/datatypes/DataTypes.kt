package academy.learnprogramming.datatypes

import academy.learnprogramming.java_code.DummyClass

fun main() {
    val myInt = 10
    println("Integer value: $myInt")

    var myLong = 10000L
    println("Long Value: $myLong")

    myLong = myInt.toLong()
    println("Long Value: $myLong")

    val myByte: Byte = 111
    println("Byte Value: $myByte")

    var myShort: Short
    myShort = myByte.toShort()
    println("Short value: $myShort")

    var myDouble = 65.345
    println("Double value $myDouble")
    println("Is the number $myDouble a Double? ${myDouble is Double}")

    val myFloat = 65.78f
    println("Float value: $myFloat")
    println("Is the number $myFloat a Floar number? ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    var anything:Any

}