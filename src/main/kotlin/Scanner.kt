import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import java.util.concurrent.TimeUnit


fun main(){
    val read = Scanner(System.`in`)
    println("Please write your name : ")
    var userName1 = read.nextLine()
    println("When is your birthdate : ")
    var birthdate1 = read.nextInt()
    println("You are $userName1 and you are ${2021-birthdate1}")


    val sdf = SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH)
    val currentDate = sdf.parse("12/01/2021")
    println("Please write your name : ")
    var userName = read.nextLine()
    println("When is your birthdate with the format of MM/dd/yyyy : ")
    var birthdate = read.nextLine()
    val formattedBirthdate = sdf.parse(birthdate)
    val diffInMillies = Math.abs(currentDate.time - formattedBirthdate.time)
    val diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)
    val age = diff / 365
    println("You are $userName and you are $age")


}
