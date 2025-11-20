import kotlin.system.exitProcess

fun main() {

    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val currentPizzaCity: PizzaCity

    println("Добрый день! Выберите город")
    println("1. Москва\n2. Санкт-Петербург\n")
    currentPizzaCity = when (readln()){
        "1" -> pizzaMoscow
        "2" -> pizzaPeter
        else -> {
            println("ERROR")
            exitProcess(status = 1)
            }
        }
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3.Сицилийская пицца\n4.Тирольская пицца")
        val pizza = readln()
        if (pizza == "1")
            currentPizzaCity.neapolitanPizzaSale()
        else if (pizza == "2")
            currentPizzaCity.romanPizzaSale()
        else if (pizza == "3")
            currentPizzaCity.sicilianPizzaSale()
        else if (pizza == "4")
            currentPizzaCity.tyroleanPizzaSale()
        else {
            println("ERROR")
            exitProcess(status = 1)
        }
    } else if (city == "2") {
        currentPizzaCity = pizzaPeter
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3.Сицилийская пицца\n4.Тирольская пицца")
        when (readln()) {
            "1" -> currentPizzaCity.neapolitanPizzaSale()
            "2" -> currentPizzaCity.romanPizzaSale()
            "3" -> currentPizzaCity.sicilianPizzaSale()
            "4" -> currentPizzaCity.tyroleanPizzaSale() }
        else -> {
            println("ERROR")
            exitProcess(status = 1)
    }
}









