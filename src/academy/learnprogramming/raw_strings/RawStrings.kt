package academy.learnprogramming.raw_strings

fun main() {
    val dirPath = "c:\\some_dir\\another_dir"
    val filePath = """c:\some_dir\another_dir"""

    val jaTxiga = "Ja txiga"
    val cancaoDeNinar = """$jaTxiga na hora di ba durmi
        *$jaTxiga na hora di ba descansá""".trimMargin("*")

    print(cancaoDeNinar)
}