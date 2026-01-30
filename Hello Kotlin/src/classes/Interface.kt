package classes

//Volvamos a las especias. Convierte Spice en una clase abstracta y luego crea subclases que sean especias reales.
//
//Es más fácil (organizativamente) si creas un nuevo paquete, Spices, con un archivo, Spice, que tenga una función main().
//Copia y pega el código de la clase Spice en ese nuevo archivo.
//Haz que Spice sea abstracta.
//Crea una subclase, Curry. Curry puede tener distintos niveles de picante, por lo que no queremos usar el valor predeterminado, sino pasar el valor de picante.
//Las especias se procesan de diferentes maneras antes de poder usarse. Agrega un método abstracto, prepareSpice, a Spice e impleméntalo en Curry.
//El curry se muele hasta convertirlo en polvo, así que llamaremos al método grind(). Sin embargo, moler no es algo exclusivo del curry, ni siquiera de las especias, y siempre se hace en un molinillo. Así que podemos crear una interfaz, Grinder, que implemente el método grind(). Hazlo ahora. Luego agregue la interfaz Grinder a la clase Curry.
//Cree una interfaz, SpiceColor, que tenga una propiedad de color. Puede usar una cadena para el color.
//Cree una subclase singleton, YellowSpiceColor, usando la palabra clave object, ya que todas las instancias de Curry y otras especias pueden usar la misma instancia de YellowSpiceColor.
//Agregue una propiedad de color a Curry de tipo SpiceColor y establezca el valor predeterminado en YellowSpiceColor.
//Agregue SpiceColor como interfaz y deje que sea por color.
//Cree una instancia de Curry e imprima su color. Sin embargo, el color es una propiedad común a todas las especias, por lo que puede moverlo a la clase padre.
//Modifique el código para que la interfaz SpiceColor se agregue a la clase Spice y Curry la herede.

/**fun main() {
    // Test Curry
    val curry = Curry("Thai Curry", "spicy")
    println("Spice: ${curry.name}")
    println("Spiciness: ${curry.spiciness}")
    println("Heat: ${curry.heat}")
    println("Color: ${curry.color}")
    curry.prepareSpice()
    curry.grind()
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
) : SpiceColor by spiceColor {  // Task 6: Delegation here

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

    // Task 5: Abstract method
    abstract fun prepareSpice()
}

// Task 4 & 7: Curry subclass with Grinder interface
class Curry(
    name: String,
    spiciness: String,
    spiceColor: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, spiceColor), Grinder {

    override fun prepareSpice() {
        println("Preparing curry: grinding spices and mixing with base")
    }
}**/