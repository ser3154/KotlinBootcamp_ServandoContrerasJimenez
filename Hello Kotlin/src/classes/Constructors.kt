package classes

//Mejoremos nuestra clase SimpleSpice para que podamos tener varias especias con diferentes niveles de picante.
//
//Crea una nueva clase, Spice.
//Pasa un argumento String obligatorio para el nombre y otro String para el nivel de picante. El valor predeterminado es suave para no picante.
//Añade una variable, heat, a tu clase, con un getter que devuelve un valor numérico para cada tipo de picante.
//En lugar de la lista de especias como Strings que usaste antes, crea una lista de objetos Spice y asigna a cada objeto un nombre y un nivel de picante.
//Añade un bloque init que muestre los valores del objeto una vez creado. Crea una especia.
//Crea una lista de especias picantes o poco picantes. Consejo: Usa un filtro y la propiedad heat.
//Como la sal es una especia muy común, crea una función auxiliar llamada makeSalt().

/**class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    init {
        println("Spice created: $name, spiciness: $spiciness, heat: $heat")
    }
}

fun main() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "very spicy")
    )

    val notTooSpicy = spices.filter { it.heat < 5 }
    println("\nSpices that aren't too spicy:")
    notTooSpicy.forEach { println(it.name) }
}

fun makeSalt() = Spice("salt")
        **/