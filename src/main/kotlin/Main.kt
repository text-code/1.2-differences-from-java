fun main() {
    val count = 111

    if (count % 10 == 1 && count % 100 != 11)
        println("Понравилось $count человеку")
    else println("Понравилось $count людям")
}