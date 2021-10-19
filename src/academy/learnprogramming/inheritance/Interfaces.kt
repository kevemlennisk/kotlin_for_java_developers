package academy.learnprogramming.inheritance

interface MyInterface {
    fun myFunction(text: String)
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): Int
}

class Something: MySubInterface {
    override fun mySubFunction(num: Int): Int {
        TODO("Not yet implemented")
    }

    override fun myFunction(text: String) {
        TODO("Not yet implemented")
    }

}