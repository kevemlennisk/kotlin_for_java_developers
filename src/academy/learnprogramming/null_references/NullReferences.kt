package academy.learnprogramming.null_references

fun main() {
    val nullStringReference: String? = null
    println("What will happen when access interfaces from a nullable reference? ${nullStringReference?.toUpperCase()}")

    val nonNullStringReference: String? = "This is not null"
    println("What will happen when access interfaces from a nullable reference? ${nonNullStringReference?.toUpperCase()}")

    //SAFE ACCESS OPERATOR / SAFE CALL OPERATOR
    val value = nullStringReference?.decapitalize()

    //USING ELVIS OPERATOR
    val str = nullStringReference ?: "This is a default value"
    println(str)

    //SAFE CASTING OPERATOR
    val array = arrayOf(1, 2, 3, 4, 5)
    val str2 = array as? String
    println(str2)
    println(str2?.toUpperCase())

    //SAFE ASSERTION
    val nullVariable: String? = null
//    val newVariable = nullVariable!!
//    val string = newVariable.toUpperCase()

    //LET FUNTION
    nullVariable?.let { println(it) }

    //ARRAY OF NULLS
    val nullableInts = arrayOfNulls<Int?>(5)
    for(item in nullableInts) println(item)

}