fun main() {
    val amount = 4_700_000
    val paymentCommission = 0.0075
    val minPaymentCommission = 35_000

    val totalPrice = (amount * paymentCommission).toInt()
    val result = if (totalPrice < minPaymentCommission) amount - minPaymentCommission else amount - totalPrice

    println("Сумма перевода: $amount коп.")

    if (totalPrice < minPaymentCommission)
        println("Комиссия составляет: $minPaymentCommission коп.")
    else println("Комиссия составляет: $totalPrice коп.")

    println("Итог: $result коп.")
}