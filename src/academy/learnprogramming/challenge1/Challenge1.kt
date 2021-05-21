package academy.learnprogramming.challenge1

fun main() {

    //Declare two immutable String variable called hello1 and hello2. Assign "Hello" to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    //Using one line of code, test whether hello1 and hello2  are referentially equal and print the result
    println("Variables hello1 and hello2 are referentially equal? ${hello1 === hello2}")                        //true
    //The JVM optimizes the use of same string value by making it static since they are immutable

    //Do the same thing as above , but test for structural equality
    println("Variables hello1 and hello2 are structural equality? ${hello1 == hello2}\n")                        //true
    //If two variable are referentially equal the they both are structural equal

    //Declare a mutable variable of type Int and assign it the value 2988
    var number = 2988                               //For number, the default type is Int

    //Declare a mutable variable of type Any and assign the string "The Any type is the root of the Kotlin class hierarchy"
    //The using smart cast, print out the upper case string

    var text: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println("${text.toUpperCase()}\n")
    }

    //Using one line of code, print out the following. Make sure your code is nicely indented
    //   1
    //  11
    // 111
    println("""   1
            |  11
            | 111""".trimMargin())

    println("")

    //Do the same using "1" as trim margin
    val separator = "1"
    println("""$separator   1
            $separator  11
            $separator 111""".trimMargin("1"))

}