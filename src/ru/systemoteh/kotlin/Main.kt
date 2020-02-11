package ru.systemoteh.kotlin

fun main() {
    dataTypes();            // типы данных
    controlStructures();    // управляющие конструкции
//    arrays();               // массивы
//    loops();                // циклы
//    collections();          // коллекции
//    maps();                 // карты
}

fun dataTypes() {

}

fun controlStructures() {
    var num = 7
    if (num > 10) {
        val max = num
    }

    if (num > 10) {
        val max = num
    } else {
        val min = num
    }

    val string = "one"
    num = when (string) {
        "one" -> 1
        "two" -> 2
        else -> 3
    }

    when (num) {
        in 1..10 -> {
            val min = num
        }
        !in 10..20 -> {
            val max = num
        }
        else -> {
            val avg = num
        }
    }


}