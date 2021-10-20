package academy.learnprogramming.singleton

fun main() {
    wantsSomeInterface(object: SomeInterface{
        override fun mustImplement(num: Int): String {
           return "This is from implementation ${num * 12000}"
        }
    })
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from SomeInterface: ${si.mustImplement(22)}")
}