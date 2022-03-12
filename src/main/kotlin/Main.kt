fun main() {
    val count = 4_700_000
    val paymentCommission = 0.0075
    val minPaymentCommission = 35_000

    val totalPrice = (count * paymentCommission).toInt()
    val result = if (totalPrice < minPaymentCommission) count - minPaymentCommission else count - totalPrice

    if (totalPrice < minPaymentCommission)
        println("Комиссия составляет: $minPaymentCommission коп.")
    else println("Комиссия составляет: $totalPrice коп.")

    println("Итог: $result коп.")
}