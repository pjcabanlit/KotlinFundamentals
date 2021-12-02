fun main() {
    val myMessage = "Happy Birthday, Macki!"
    val anotherMessage = "Happy Birthday, Macki!"
    val fName = "Paul"
    val mName = "Quinalayo"
    val lName = "Cabanlit"
    val myAge = 22
    println(myMessage.slice(16..20))
    println(myMessage.plus(" $anotherMessage"))
    println(myMessage.lowercase())
    println(myMessage.uppercase())
    println("$fName $mName $lName")
    println("My Name is $fName ${mName.first()}. $lName ")
    println("My age 10 years from now is ${myAge + 10}")

    val nickname = "Paul"
    val product = 100
    val amount = 10
    println("Hi $nickname. you must pay ${amount * product}")
}