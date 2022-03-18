package ru.netology

fun main() {
    val amount = 10034654
    val minСommission = 3500
    val commission = amount / 100 * 0.75
    val result = if (commission < minСommission) minСommission else commission.toInt()
    println("Сумма перевода: $amount копеек")
    println("Комисся: $result копеек")
}