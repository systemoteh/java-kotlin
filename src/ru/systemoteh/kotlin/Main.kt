package ru.systemoteh.kotlin

fun main() {
    dataTypes()            // типы данных
    controlStructures()    // управляющие конструкции
    loops()                // циклы
    arrays()               // массивы
    collections()          // коллекции
//    maps()                 // карты
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

fun loops() {

    for (i in 1..5) {
        // logic here
    }

    for (i in 10 downTo 1 step 2) {
        // logic here
    }

    repeat(3) {
        // logic here
    }

    var i = 0
    while (i < 10) {
        // logic here
        i++
    }

    do {
        // logic here
        i++
    } while (i < 10)
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
    for (index in stringArray.indices) {
        intArray[index] = index * 3
    }

    var stringArrayOfNull = arrayOfNulls<String>(3) // [null, null, null]

    val letters = Array(26) { i -> ('A' + i).toString() }
    var printArray = letters.contentToString()

    var emptyArrayString = emptyArray<String>() // size can never change
}

fun collections() {

    val immutableList = listOf(1, 2, 3)     // never can change
    val mutableList = mutableListOf("one", "two", "three")  // can change
    mutableList.add("four")
    val readOnlyList = mutableList.toList() // never can change
    val stringArrayList = arrayListOf("One", "Two")

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val intList: List<Int> = intArray.toList()

    val num00 = intList.get(0)                       // 1
    val num01 = intList.indexOf(1)                   // 2
    val num02 = intList.lastIndexOf(3)       // 2
    val num03 = intList.first()                      // 1
    val num04 = intList.last()                       // 5
    val num05 = intList.size                         // 5
    val num06 = intList.contains(4)              // true
    val num07 = intList.elementAt(1)           // 2
    val num08 = intList.elementAtOrElse(8) { 0 } // 0
    val num09 = intList.elementAtOrNull(9)    // null

    for (elem in intList) {
//        print(elem)
    }

    val stringHashSet = hashSetOf("a", "b", "c")

    val emptyList: List<String> = emptyList()
}