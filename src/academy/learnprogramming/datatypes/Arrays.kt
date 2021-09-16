package academy.learnprogramming.datatypes

import academy.learnprogramming.java_code.DummyClass
import java.math.BigDecimal

fun main() {
    val arraysOfInt = arrayOf(1, 2, 3, 4)
    println("Is the variable arryas an array of Int? ${arraysOfInt is Array<Int>}")

    val arraysOfLongs = arrayOf(1L, 2L, 3L, 4L)
    println("Is the variable arraysOfLongs an array of Long? ${arraysOfLongs is Array<Long>}")

    val arraysOfLongs2 = arrayOf<Long>(1, 2, 3, 4)
    println("Is the variable arraysOfLongs2 an array of Long? ${arraysOfLongs2 is Array<Long>}")

    val names = arrayOf("Juliana", "Guto", "Maira", "Thiago")
    for(name in names) print("$name ")

    //INITIALIZING ARRAYS
    val arrays1 = Array(10){i -> i+1}
    var array2 = Array(100) { 0 }

    var someArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    for (element in someArray) print("$element ")

    println("")

    val arrayOfMixedElements = arrayOf("Hello", 12, BigDecimal(10.5), 'X')
    for (element in arrayOfMixedElements) print("$element ")

    println("")

    println("Is the arrayOfMixedElements is an Array<Any>? ${arrayOfMixedElements is Array<*>}")

    //Arrays interoperability with Java
    val intArray = intArrayOf(12,45,667,87,34,67)
    val longArray = longArrayOf(1, 2, 3, 4, 4)
    val charArray = charArrayOf('q')

    val dummyClass = DummyClass()
    dummyClass.printNumbers(intArray)

    //or you can convert an array of Int to intArray (primitive int)

    dummyClass.printNumbers(arraysOfInt.toIntArray())

    val primitiveIntArray = IntArray(10)
    for (element in primitiveIntArray) print("$element ")


}