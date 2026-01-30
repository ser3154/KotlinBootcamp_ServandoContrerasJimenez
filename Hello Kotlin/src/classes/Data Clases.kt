package classes

// Cree una clase de datos simple, SpiceContainer, que contenga una especia.
//Asigne a SpiceContainer una propiedad, etiqueta, derivada del nombre de la especia.
//Cree varios contenedores con especias e imprima sus etiquetas.

/**fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy"))
    )

    for (container in spiceCabinet) {
        println(container.label)
    }
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

interface Grinder {
    fun grind() {
        println("Grinding spice into powder")
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild",
    val spiceColor: SpiceColor = YellowSpiceColor
) : SpiceColor by spiceColor {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(
    name: String,
    spiciness: String,
    spiceColor: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, spiceColor), Grinder {

    override fun prepareSpice() {
        println("Preparing curry: grinding and mixing")
    }
}**/