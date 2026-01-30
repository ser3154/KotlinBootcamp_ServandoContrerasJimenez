package KotlinEssentialBeyondTheBasics

//El uso de jerarquías de tipos con clases genéricas sigue un patrón bastante básico que presentamos en el segmento anterior. Se presentó mucho material sobre genéricos, pero básicamente, al crearlos, se reduce a los siguientes pasos:
//
//Crear una jerarquía de tipos/clases. El padre no es específico y los subtipos/subclases son especializaciones.
//Existe al menos una propiedad compartida entre las clases/tipos, y su valor varía según el subtipo (de lo contrario, no tendría sentido tener subtipos).
//Entonces, tenemos una clase que usa todos los subtipos y realiza diferentes acciones según los valores de las propiedades de cada subtipo.
//Pongamos esto en práctica utilizando materiales de construcción y un edificio que necesita ciertas cantidades de esos materiales.
//
//Crear un nuevo paquete y archivo, y llamarlos Buildings.
//Crear una clase BaseBuildingMaterial con la propiedad numberNeeded establecida en 1. Siempre se necesita 1 del material base.
//Crear dos subclases: Wood y Brick. Para BaseBuildingMaterial necesitas 4 unidades de madera u 8 unidades de ladrillo. Ahora tienes una jerarquía de tipos.
//Crea una clase genérica Building que pueda tomar cualquier material de construcción como argumento, y solo materiales de construcción.
//Un edificio siempre requiere 100 materiales base. Agrega la propiedad baseMaterialsNeeded y establécela en 100.
//Agrega otra propiedad, actualMaterialsNeeded, y usa una función de una línea para calcularla a partir de numberNeeded del material pasado.
//Agrega el método build() que imprime el tipo y la cantidad de materiales necesarios.
//Consejo: Usa la reflexión para obtener la clase y el nombre simple: instance::class.simpleName.
//Crea una función principal y crea un edificio usando Wood.
//Si lo hiciste correctamente, al ejecutar main() se imprimirá algo como "Se requieren 400 Wood".

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    val brickBuilding = Building(Brick())
    brickBuilding.build()

    val baseBuilding = Building(BaseBuildingMaterial())
    baseBuilding.build()
}

//Función genérica para comprobar el tamaño del edificio
//Practic Time
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

//IntelliJ sugiere out porque la clase Building:
//Solo produce/retorna valores de tipo T
class Building<out T : BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}