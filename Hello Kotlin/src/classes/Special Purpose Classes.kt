package classes

// Usaste un objeto en la lección y el cuestionario anteriores.
//Ahora que conoces las enumeraciones, aquí tienes el código para Color como enumeración:
//enum class Color(val rgb: Int) {
//    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
//}
//En SpiceColor, cambia el tipo de color de String a la clase Color y establece el color apropiado en YellowSpiceColor.
/**¿Cuál es el efecto de esto?
 * Efectos de sealed class:
 *
 * Jerarquía cerrada: Solo las clases definidas en el mismo archivo pueden heredar de Spice
 * Exhaustividad en when: El compilador puede verificar que se manejen todos los casos
 * Sin clase else necesaria: En expresiones when, si cubres todos los subtipos conocidos
 */
/**¿Por qué es útil?
 * Seguridad en tiempo de compilación: El compilador conoce todos los posibles subtipos
 * Mejor mantenimiento: Si agregas un nuevo tipo, el compilador te indica dónde actualizar el código
 * Expresiones when exhaustivas: No necesitas casos else genéricos
 * Modelado de jerarquías conocidas: Perfecto para estados, tipos de datos, etc.
 */


fun main() {
    val curry = Curry("Thai Curry", "spicy")
    println("Spice: ${curry.name}")
    println("Color: ${curry.color}")
    println("Color RGB: ${curry.color.rgb}")
    curry.prepareSpice()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

interface Grinder {
    fun grind() {
        println("Grinding spice into powder")
    }
}

sealed class Spice(
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
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}