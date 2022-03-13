fun main() {
    var previousPurchaseAmount = 10_001

    val itemPrice = 100
    val itemCount = 11

    var totalPrice = itemPrice * itemCount

    val standardDiscount = 100
    val standardDiscountStart = 1_000

    val maxDiscount = 0.05
    val maxDiscountStart = 10_000

    val vip = true
    val vipDiscount = 0.01

    if (previousPurchaseAmount > standardDiscountStart && previousPurchaseAmount < maxDiscountStart) {
        totalPrice -= standardDiscount
        println("Цена со скидкой: $totalPrice рублей.")
    } else if (previousPurchaseAmount > maxDiscountStart) {
        totalPrice -= (totalPrice * maxDiscount).toInt()
        println("Цена со скидкой: $totalPrice рублей.")
    }

    if (vip) {
        totalPrice -= (totalPrice * vipDiscount).toInt()
        println("Цена со скидкой vip: $totalPrice рублей.")
    } else {
        println("Цена без скидок: $totalPrice")
    }
}