import kotlin.math.pow

fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()

    if (n != null && x != null && n > 0 && x > 0) {
        val y = findIntegerExponent(n, x)
        if (y != null) {
            println("Целочисленный показатель степени y: $y")
        } else {
            println("Целочисленный показатель не существует")
        }
    } else {
        println("Пожалуйста, введите положительные целые числа.")
    }
}

fun findIntegerExponent(n: Int, x: Int): Int? {
    for (y in 1..n) {
        if (x.toDouble().pow(y) == n.toDouble()) {
            return y
        }
    }
    return null
}
