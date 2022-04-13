fun main(){
    println(agoToText())
}
fun agoToText(){
    val second = 25000
    val minutes = second.toDouble()/60
    val hour = minutes.toDouble()/60
    val days = hour.toDouble()/24

    when(second){
        in 0..59 -> println("только что")
        in 60..60*60-> if(minutes.toInt()%10==1){
            println("${minutes.toInt()} минуту назад")}
        else if(minutes.toInt() in 2..4){
            println("${minutes.toInt()} минуты назад")
            }
        else println("${minutes.toInt()} минут назад")
        in 60*60+1..24*60*60 -> if(hour.toInt()%10==1){
            println("${hour.toInt()} час назад")}
        else if(hour.toInt() in 5..20){
            println("${hour.toInt()} часов назад")
        }
        else println("${hour.toInt()} часа назад")
        in 24*60*60..24*60*60*2 -> println("сегодня")
        in 24*60*60*2..24*60*60*3 -> println("вчера")
        else -> println("давно")
    }
}