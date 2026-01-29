package KotlinFunctions//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//codigo de main
/**fun main(args: Array<String>) {
    println("Hello, world!")
}
*/

/**
fun main() {
    val fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}
**/

/**import java.util.Calendar

fun main() {
    println("Hello World")
    dayOfWeek()
}
//Practicas de funcion dia de la semana
fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}
**/

/**fun main() {
    val fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}
**/

/**fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}**/

/**fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    val currentTotal = currentFish.sum()

    val capacity = if (hasDecorations) tankSize * 0.8 else tankSize

    return (currentTotal + fishSize) <= capacity
}

fun main() {
    // Test cases
    println(canAddFish(10.0, listOf(3, 3, 3)))  // false
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))  // true
    println(canAddFish(9.0, listOf(1, 1, 3), 3))  // false
    println(canAddFish(10.0, listOf(), 7, true))  // true
}**/


//Crear un programa que sugiera una actividad en función de varios parámetros.
/**
fun main() {

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("tired", "sunny", 30))
    println(whatShouldIDoToday("energetic", "cloudy", 15))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" -> "stay home and watch a movie"
        mood == "sad" -> "stay home and read"
        mood == "happy" && weather == "rainy" -> "go to a cafe"
        temperature > 30 -> "go swimming"
        temperature < 10 -> "stay inside and have hot chocolate"
        mood == "tired" -> "take a nap"
        mood == "energetic" -> "go for a run"
        mood == "bored" -> "learn something new"
        else -> "stay home and read"
    }
}**/

//Mejore su programa whatShouldIDoToday() con los nuevos conocimientos de este segmento.
/**
fun main() {
    print("Enter your mood: ")
    val userMood = readLine()!!

    print("Enter the weather (default: sunny): ")
    val userWeather = readLine()?.takeIf { it.isNotEmpty() } ?: "sunny"

    print("Enter the temperature (default: 24): ")
    val userTemp = readLine()?.toIntOrNull() ?: 24

    val activity = whatShouldIDoToday(userMood, userWeather, userTemp)
    println("\nYou should: $activity")
}

fun isVerySad(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isTooCold(temperature: Int) = temperature < 10

fun isTooHot(temperature: Int) = temperature > 35

fun isNiceDay(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"

fun isRainyDay(weather: String) = weather == "rainy"

fun isFeelingActive(mood: String, temperature: Int) =
    mood == "energetic" && temperature in 15..30

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isVerySad(mood, weather, temperature) -> "stay in bed"
        isTooHot(temperature) -> "go swimming"
        isTooCold(temperature) -> "stay inside and have hot chocolate"
        isNiceDay(mood, weather) -> "go for a walk"
        isFeelingActive(mood, temperature) -> "go for a run"
        mood == "sad" && isRainyDay(weather) -> "stay home and watch a movie"
        mood == "sad" -> "stay home and read"
        mood == "happy" && isRainyDay(weather) -> "go to a cafe"
        mood == "tired" -> "take a nap"
        mood == "bored" -> "learn something new"
        else -> "stay home and read"
    }
}**/

//Practice Time
/**
import java.util.Random

fun main() {
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    // Pass the function itself and the number of sides
    gamePlay(rollDice2)
}

fun gamePlay(dice: (Int) -> Int) {
    // Generate and print dice rolls
    println("Rolling 6-sided die: ${dice(6)}")
    println("Rolling 12-sided die: ${dice(12)}")
    println("Rolling 20-sided die: ${dice(20)}")
}**/

//kotlin Filters
import java.util.Random

fun main() {
    // Solución 1: Quitar "bound ="
    val rollDice = { Random().nextInt(12) + 1 }
    println("Basic: ${rollDice()}")

    // Solución 2
    val rollDiceWithSides = { sides: Int ->
        Random().nextInt(sides) + 1  // Sin "bound ="
    }
    println("6-sided: ${rollDiceWithSides(6)}")

    // Solución 3
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1  // Sin "bound ="
    }
    println("0-sided: ${rollDice0(0)}")

    // Solución 4
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1  // Sin "bound ="
    }
    println("20-sided: ${rollDice2(20)}")
}


