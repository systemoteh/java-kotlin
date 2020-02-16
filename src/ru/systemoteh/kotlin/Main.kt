package ru.systemoteh.kotlin

fun main() {
    dataTypes();            // типы данных
    controlStructures();    // управляющие конструкции
    arrays();               // массивы
//    loops();                // циклы
//    collections();          // коллекции
//    maps();                 // карты
}

fun dataTypes() {
    val constantNum = 7         // never can change
    var variableNum = 10        // can change

    val var01: Byte = 0         // 8 bit { -128 .. 127 }
    val var02: Short = 0        // 16 bit { -32768 .. 32767 }
    val var03: Int = 0          // 32 bit { -2147483648 .. 2147483647 }
    val var04: Long = 0L        // 64 bit { -9223372036854775808L .. 9223372036854775807L }
    val var05: Float = 0.0f
    val var06: Double = 0.0

    val var07: Boolean = false  // 8 bit { false/true }
    val var08: Char = '\u0000'  // 16 bit UTF-8 { '\u0000' .. '\uFFFF' } or { 0 .. 65535 }
    val anyNotNullObject: String = "Some string"
    val anyNullObject: String? = null
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

fun arrays() {

    val intArray = intArrayOf(1, 3, 5)
    val avg = intArray.average()
    val sum = intArray.sum()
    val max = intArray.max()
    val min = intArray.min()
    val isContains = intArray.contains(3) // true

    val stringArray = arrayOf("one", "two", "three")
    var i = 0
    stringArray.forEach { stringArray[i++] = it + "some" }

    var stringArrayOfNull = arrayOfNulls<String>(3) // [null, null, null]

    val letters = Array(26) { i -> ('A' + i).toString() }
    var printArray = letters.contentToString()

    var emptyArrayString = emptyArray<String>() // size can never change
}