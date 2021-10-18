package academy.learnprogramming.functions

fun main() {
    val text = "love"
    println(text.upperCaseTheFirstAndLast())
}

fun String.upperCaseTheFirstAndLast() : String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(upperFirst.length - 1).toUpperCase()
}