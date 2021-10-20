package academy.learnprogramming.enums

fun main() {
    println(Department.PEOPLE.getInfo())
    println(Department.PEOPLE.calculateExpenses())
}

enum class Department(val description: String, val numberOfImployee: Int) {
    PEOPLE("People Support", 10) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    },
    MARKETING("Marketing", 10) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    },
    OPS("Operation", 50) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    },
    PS("Professional Services", 200) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    },
    LEGAL("Legal", 6) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    },
    FINANCES("Finance", 7) {
        override fun calculateExpenses(): Float {
            return 10.0f
        }
    };

    abstract fun calculateExpenses(): Float

    fun getInfo(): String = "Department $description has $numberOfImployee employees"
}