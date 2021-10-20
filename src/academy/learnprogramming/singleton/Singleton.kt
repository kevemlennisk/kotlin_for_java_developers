package academy.learnprogramming.singleton

import java.time.Year

fun main() {
    println(CompanyInfo.getTagLine())
    println(CompanyInfo.getCopyRightLine())

    println(SomeClass.Companion.accessingPrivateVar())
    println(SomeClass.accessingPrivateVar())

    val someClass = SomeClass.build("Bla bla bla", true)
    println(someClass.someString)
}

object CompanyInfo {

    private val currentYear = Year.now().value

    fun getTagLine() = "Bla company"

    fun getCopyRightLine() = "Copyright \u00A9 $currentYear ${getTagLine()}. All rights reserved"
}

class SomeClass private constructor(val someString: String) {

    companion object {
        private var privateVar = 6
        fun accessingPrivateVar() = "I'm accesssing the privateVar: $privateVar"

        fun build(str: String, upperCased: Boolean): SomeClass {
            return if (upperCased) {
                SomeClass(str.toUpperCase())
            } else {
                SomeClass(str.toLowerCase())
            }
        }
    }
}