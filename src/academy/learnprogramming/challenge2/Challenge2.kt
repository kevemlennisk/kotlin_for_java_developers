package academy.learnprogramming.challenge2

import academy.learnprogramming.java_code.DummyClass

fun main() {
    //1. Declare a non-nullable float variable two ays
    //and assign it the value -3847.384f
    val float = -3847.384f
    val float2: Float = -3847.384f

    //2. Now change both of those variables into nullable variables
    val float3: Float? = -3847.384f
    val float4: Float? = -3847.384f

    //3. Now declare an array of type non-nullable Short. Make it size 5,
    //and assign it the values 1, 2, 3, 4 and 5.
    val arrayOfShorts: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)

    //4. Now, declare an array of nullable Ints and initialize it the values
    //5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc all the way up to 200.
    val nullableIntArray = Array<Int?>(40){i -> (i+1) * 5 }

    //5. You have to call  a Java method with the following signature from Kotlin:
    // public void method(char[] charArray). Declare an array that you could
    //pass to the method and initialize it with the values 'a', 'b', and 'c'
    val charArray = charArrayOf('a', 'b', 'c')
    val anotherCharArray: Array<Char> = arrayOf<Char>('a', 'b', 'c')

    val dummy = DummyClass()
    dummy.printChars(charArray)
    dummy.printChars(anotherCharArray.toCharArray())

    //6. Given  the following code:
    val x: String? = "I'M IN UPPERCASE"
    // Using one line of code, declare another string variable
    // and assign it x.toLowerCase() when x isn't null
    // and the string "I gave up!" when x is null
    val newVariable: String = x?.toLowerCase() ?: "I gave up!"

    //7. Now use the let function to (a) lowercase the string and then,
    // (b) replace "I'm" to "I'm not" int the result
    x?.let { println(it.toLowerCase().replace("i'm", "I'm not")) }

    //8. You're really, really confident that the variable myNonNullVariable can't contain null
    // Change the following code to assert that myNonNunVariable isn't null
    // (and shoot yourself in the food)

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}