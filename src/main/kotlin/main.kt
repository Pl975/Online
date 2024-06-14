package ru.netology


fun main() {
    println(agoToText(68)) // минуту назад
    println(agoToText(720)) // 12 минут назад
    println(agoToText(1_320)) // 22 минуты назад
    println(agoToText(2_220)) // 37 минут назад
    println(agoToText(39_600)) // 11 часов назад
    println(agoToText(75_600)) // 21 час назад
    println(agoToText(79_200)) // 22  часа назад
    println(agoToText(72_000)) // 20  часов назад
    println(agoToText(170_000)) // вчера
    println(agoToText(172_802)) // позавчера
    println(agoToText(300_802)) // давно
}

fun agoToText(time: Int) = when (time) {
    in 0..60 -> "только что"
    in 61..3600 -> "был(а) " + "${minutes(time)} " + "${minutesStringEnd(time)} назад"
    in 3601..86400 -> "был(а) " + "${hours(time)} " + "${hourstringEnd(time)} назад"
    in 86401..172800 -> "был(а) вчера"
    in 172801..259200 -> "был(а) позавчера"
    else -> "был(а) давно"
}
fun minutes(time: Int) = time / 60

fun minutesStringEnd(time: Int) : String {
    return if (time / 60 in 11..14) "минут"
    else when (time / 60 % 10) {
        1 -> "минуту"
        2, 3, 4 -> "минуты"
        else -> "минут"
    }
}

fun hours(time: Int) = time / 3600

fun hourstringEnd(time: Int) : String {
    return if (time / 3600 in 11..14) "часов"
    else when (time / 3600 % 10) {
        1 -> "час"
        2, 3, 4 -> "часа"
        else -> "часов"
    }
}

//fun hourstringEnd(time: Int) = when (time / 3600 % 10) {
//    1 -> "час"
//    2, 3, 4 -> "часа"
//    else -> "часов"
//}




