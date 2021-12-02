import java.util.*

fun main() {
    println("What is your name?")
    val yourName = readLine()
    println("Your name is: $yourName")
    println("What is your Birth Date?")
    val yourBirthYear = readLine()?.toInt()
    val today = Calendar.getInstance().get(Calendar.YEAR);

    var age = today - yourBirthYear!!
    println(age)
}