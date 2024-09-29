fun main() {
    println("тут собраны все задания 6 лабы!!!")
    println("собрано Валерой с душой!")
    println("выберите задание (1-30): ")

    while (true) {
        print("введите номер задания: ")
        val nomerZadaniya = readLine()!!.toIntOrNull()

        if (nomerZadaniya != null && nomerZadaniya in 1..30) {
            when (nomerZadaniya) {
                1 -> zadanie1()
                2 -> zadanie2()
                3 -> zadanie3()
                4 -> zadanie4()
                5 -> zadanie5()
                6 -> zadanie6()
                7 -> zadanie7()
                8 -> zadanie8()
                9 -> zadanie9()
                10 -> zadanie10()
                11 -> zadanie11()
                12 -> zadanie12()
                13 -> zadanie13()
                14 -> zadanie14()
                15 -> zadanie15()
                16 -> zadanie16()
                17 -> zadanie17()
                18 -> zadanie18()
                19 -> zadanie19()
                20 -> zadanie20()
                21 -> zadanie21()
                22 -> zadanie22()
                23 -> zadanie23()
                24 -> zadanie24()
                25 -> zadanie25()
                26 -> zadanie26()
                27 -> zadanie27()
                28 -> zadanie28()
                29 -> zadanie29()
                30 -> zadanie30()
            }
            println("хотите выполнить другое задание? (указать да иили нет)")
            val otvet = readLine()!!.lowercase()
            if (otvet == "нет") {
                break
            }
        } else {
            println("увы такого задания нету и не будет попробуйте снова")
        }
    }
    println("спасибо за пользование:)")
}

// создание и вывод элементов
fun zadanie1() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    println("Создание и вывод элементов")
    for (chislo in chisla) {
        println(chislo)
    }
}

// сумма элементов массива
fun zadanie2() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    var summa = 0
    for (chislo in chisla) {
        summa += chislo
    }
    println("Сумма элементов массива: $summa")
}

// максимальное и минимальное значение
fun zadanie3() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    var maxZnachenie = chisla[0]
    var minZnachenie = chisla[0]
    for (chislo in chisla) {
        if (chislo > maxZnachenie) maxZnachenie = chislo
        if (chislo < minZnachenie) minZnachenie = chislo
    }
    println("Максимальное значение: $maxZnachenie")
    println("Минимальное значение: $minZnachenie")
}

// сортировка массива
fun zadanie4() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    for (i in chisla.indices) {
        for (j in i + 1 until chisla.size) {
            if (chisla[i] > chisla[j]) {
                val temp = chisla[i]
                chisla[i] = chisla[j]
                chisla[j] = temp
            }
        }
    }
    println("Отсортированный массив")
    for (chislo in chisla) {
        println(chislo)
    }
}

// уникальные элементы
fun zadanie5() {
    val chislaPovtor = arrayOf(1, 2, 2, 3, 4, 5, 5)
    val unikalnyeElementy = chislaPovtor.distinct()
    println("уникальные элементы")
    for (chislo in unikalnyeElementy) {
        println(chislo)
    }
}

// четные и нечетные числа
fun zadanie6() {
    val chisla10 = arrayOf(3, 5, 2, 8, 9, 12, 4, 1, 7, 6)
    println("четные числа")
    for (chislo in chisla10) {
        if (chislo % 2 == 0) println(chislo)
    }
    println("нечетные числа")
    for (chislo in chisla10) {
        if (chislo % 2 != 0) println(chislo)
    }
}

// реверс массива
fun zadanie7() {
    val chisla10 = arrayOf(3, 5, 2, 8, 9, 12, 4, 1, 7, 6)
    val reversMassiv = Array(chisla10.size) { chisla10[chisla10.size - 1 - it] }
    println("реверс массива")
    for (chislo in reversMassiv) {
        println(chislo)
    }
}

// поиск элемента
fun zadanie8() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    print("Введите элемент для поиска: ")
    val element = readLine()!!.toIntOrNull()
    var found = false
    for (index in chisla.indices) {
        if (chisla[index] == element) {
            println("Элемент найден на индексе: $index")
            found = true
            break
        }
    }
    if (!found) {
        println("Элемент не найден")
    }
}

// копирование массива
fun zadanie9() {
    val chisla = arrayOf(1, 2, 3, 4, 5)
    val novyiMassiv = Array(chisla.size) { chisla[it] }
    println("исходный массив")
    for (chislo in chisla) {
        println(chislo)
    }
    println("скопированный массив")
    for (chislo in novyiMassiv) {
        println(chislo)
    }
}

// сумма четных чисел
fun zadanie10() {
    val chisla10 = arrayOf(3, 5, 2, 8, 9, 12, 4, 1, 7, 6)
    var summaChetnykh = 0
    for (chislo in chisla10) {
        if (chislo % 2 == 0) summaChetnykh += chislo
    }
    println("сумма четных чисел: $summaChetnykh")
}

// пересечение массивов
fun zadanie11() {
    val massiv1 = arrayOf(1, 2, 3, 4, 5)
    val massiv2 = arrayOf(3, 4, 5, 6, 7)
    println("пересечение массивов")
    for (chislo in massiv1) {
        if (massiv2.contains(chislo)) {
            println(chislo)
        }
    }
}

// перестановка элементов
fun zadanie12() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    print("Введите индекс первого элемента: ")
    val index1 = readLine()!!.toInt()
    print("Введите индекс второго элемента: ")
    val index2 = readLine()!!.toInt()

    val temp = chisla[index1]
    chisla[index1] = chisla[index2]
    chisla[index2] = temp

    println("Массив после перестановки")
    for (chislo in chisla) {
        println(chislo)
    }
}

// заполнение случайными числами
fun zadanie13() {
    val chislaSluchainye = Array(20) { (1..100).random() }
    println("массив случайных чисел")
    for (chislo in chislaSluchainye) {
        println(chislo)
    }
}

// числа Прокопенко (Parashenko) делящиеся на 3
fun zadanie14() {
    val chisla = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("числа делящиеся на 3")
    for (chislo in chisla) {
        if (chislo % 3 == 0) println(chislo)
    }
}

// проверка на палиндром
fun zadanie15() {
    val chisla = arrayOf(1, 2, 3, 2, 1)
    var isPalindrome = true
    for (i in chisla.indices) {
        if (chisla[i] != chisla[chisla.size - 1 - i]) {
            isPalindrome = false
            break
        }
    }
    if (isPalindrome) {
        println("массив является палиндромом")
    } else {
        println("массив не является палиндромом")
    }
}

// конкатенация двух массивов
fun zadanie16() {
    val massiv1 = arrayOf(1, 2, 3)
    val massiv2 = arrayOf(4, 5, 6)
    println("объединенный массив")
    for (chislo in massiv1) println(chislo)
    for (chislo in massiv2) println(chislo)
}

// сумма и произведение
fun zadanie17() {
    val chisla = arrayOf(1, 2, 3, 4, 5)
    var summa = 0
    var proizvedenie = 1
    for (chislo in chisla) {
        summa += chislo
        proizvedenie *= chislo
    }
    println("сумма элементов: $summa")
    println("произведение элементов: $proizvedenie")
}

// группировка чисел по 5 элементов
fun zadanie18() {
    val chisla20 = Array(20) { it + 1 }
    println("группы по 5 элементов")
    for (i in chisla20.indices step 5) {
        for (j in i until (i + 5).coerceAtMost(chisla20.size)) {
            print("${chisla20[j]} ")
        }
        println()
    }
}

// слияние двух отсортированных массивов
fun zadanie19() {
    val massiv1 = arrayOf(1, 3, 5)
    val massiv2 = arrayOf(2, 4, 6)
    val slityiMassiv = Array(massiv1.size + massiv2.size) { 0 }
    var index = 0
    for (chislo in massiv1) {
        slityiMassiv[index++] = chislo
    }
    for (chislo in massiv2) {
        slityiMassiv[index++] = chislo
    }
    slityiMassiv.sort()
    println("слияние двух массивов")
    for (chislo in slityiMassiv) {
        println(chislo)
    }
}


// числовая последовательность (арифметическая прогрессия)
fun zadanie20() {
    val firstElement = 1
    val step = 2
    val n = 10
    println("арифметическая прогрессия")
    for (i in 0 until n) {
        println(firstElement + i * step)
    }
}

// удаление элемента
fun zadanie21() {
    print("Введите количество элементов: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    print("Введите элемент для удаления: ")
    val element = readLine()!!.toIntOrNull()
    println("Массив после удаления элемента")
    for (chislo in chisla) {
        if (chislo != element) {
            println(chislo)
        }
    }
}

// поиск второго максимального
fun zadanie22() {
    val chisla = arrayOf(1, 3, 5, 7, 9, 11, 11)
    val sortedChisla = chisla.sortedDescending()
    val secondMax = sortedChisla.distinct().getOrNull(1)
    println("второй по величине элемент: $secondMax")
}

// объединение нескольких массивов
fun zadanie23() {
    val massiv1 = arrayOf(1, 2, 3)
    val massiv2 = arrayOf(4, 5)
    val massiv3 = arrayOf(6, 7, 8)
    println("объединенный массив")
    for (chislo in massiv1) println(chislo)
    for (chislo in massiv2) println(chislo)
    for (chislo in massiv3) println(chislo)
}

// транспонирование матрицы
fun zadanie24() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println("транспонированная матрица")
    for (i in matrix[0].indices) {
        for (j in matrix.indices) {
            print("${matrix[j][i]} ")
        }
        println()
    }
}

// линейный поиск bool значения
fun zadanie25() {
    val chisla = arrayOf(1, 2, 3, 4, 5)
    print("введите элемент для поиска: ")
    val element = readLine()!!.toIntOrNull()
    val isFound = chisla.contains(element)
    println("элемент найден: $isFound")
}

// среднее арифметическое
fun zadanie26() {
    val chisla = arrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (chislo in chisla) {
        sum += chislo
    }
    val sredneeArifm = sum / chisla.size.toDouble()
    println("среднее арифметическое: $sredneeArifm")
}

// максимальная последовательность одинаковых элементов
fun zadanie27() {
    val chisla = arrayOf(1, 2, 2, 2, 3, 4, 4, 5)
    var maxSeqLength = 1
    var currentSeqLength = 1

    for (i in 1 until chisla.size) {
        if (chisla[i] == chisla[i - 1]) {
            currentSeqLength++
        } else {
            if (currentSeqLength > maxSeqLength) {
                maxSeqLength = currentSeqLength
            }
            currentSeqLength = 1
        }
    }
    if (currentSeqLength > maxSeqLength) {
        maxSeqLength = currentSeqLength
    }
    println("максимальная последовательность одинаковых элементов: $maxSeqLength")
}

// ввод и вывод массива
fun zadanie28() {
    print("Введите количество элементов массива: ")
    val n = readLine()!!.toIntOrNull() ?: 0
    val chisla = Array(n) {
        print("Введите элемент $it: ")
        readLine()!!.toInt()
    }
    println("Введенный массив")
    for (chislo in chisla) {
        println(chislo)
    }
}


// нахождение медианы
fun zadanie29() {
    val chisla = arrayOf(1, 3, 3, 6, 7, 8, 9) // заранее отсортированный массив
    val n = chisla.size
    val median = chisla[n / 2] // просто берём средний элемент так как массив нечётный
    println("медиана массива: $median")
}


// массив из 100 целых чисел и разделить их на 10 групп по 10 элементов
fun zadanie30() {
    val chisla100 = Array(100) { it + 1 }
    println("распределение по группам")

    for (i in 0 until 100) {
        print("${chisla100[i]} ")
        if ((i + 1) % 10 == 0) {
            println() // переходим на новую строку после каждых 10 чисел
        }
    }
}