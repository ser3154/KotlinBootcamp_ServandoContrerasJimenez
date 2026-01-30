package FunctionalManipulation

//En esta práctica, terminarás tu juego simple usando funciones de orden superior, es decir, una función que toma funciones como argumento.
//
//En la clase game, crea una función move() que tome un argumento llamado where, que es una lambda sin argumentos que devuelve Unit.
//Consejo: Declarar una función que tome una lambda como argumento:
//
//fun move(where: () -> Boolean )
//Dentro de move(), invoca la lambda pasada.
//En la clase Game, crea una función makeMove() que tome un argumento String que admita valores NULL y no devuelva nada.
//Dentro de makeMove, comprueba si la String corresponde a alguna de las 4 direcciones e invoca move() con la lambda correspondiente. De lo contrario, invoca move() con end.
//Consejo: Puedes llamar a la función así:
//
//move(north)
//En main(), añade un bucle while que siempre sea verdadero. Dentro del bucle, imprime instrucciones para el jugador:
//print("Introduce una dirección: n/s/e/o:")
//Llama a makeMove() con el contenido de la entrada del usuario mediante readLine()
//Elimina el código para probar la primera versión de tu juego.
//Ejecuta tu programa.
//Desafío:
//Crea un "mapa" simple para tu juego y, cuando el usuario se mueva, muestra una descripción de su ubicación. Considera lo siguiente:
//
//Usa una clase Location que tome un ancho y alto predeterminados para rastrear la ubicación. 4x4 es bastante manejable.
//Puedes crear una matriz como esta:
//val map = Array(width) { arrayOfNulls<String>(height) }
//Usa un bloque init para inicializar tu mapa con descripciones para cada ubicación.
//Cuando uses move(), también actualizaLocation(). Se requieren cálculos matemáticos para evitar excepciones de puntero nulo y evitar que el usuario se salga del mapa. rem() y absoluteValue son útiles. Cuando hayas terminado, comprime el código y envíaselo a un amigo para que pruebe tu primer juego Kotlin.

import kotlin.math.absoluteValue

fun main() {
    val game = Game()

    // Game loop
    while (true) {
        print("Enter a direction: n/s/e/w (or 'q' to quit): ")
        val input = readLine()

        if (input == "q") {
            game.end()
            break
        }

        game.makeMove(input)
    }
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Direction.START)
    private val location = Location()

    // Task 5: Lambdas for directions
    val north = {
        path.add(Direction.NORTH)
        location.updateLocation(Direction.NORTH)
        println("Moving north...")
        location.printLocation()
        true
    }

    val south = {
        path.add(Direction.SOUTH)
        location.updateLocation(Direction.SOUTH)
        println("Moving south...")
        location.printLocation()
        true
    }

    val east = {
        path.add(Direction.EAST)
        location.updateLocation(Direction.EAST)
        println("Moving east...")
        location.printLocation()
        true
    }

    val west = {
        path.add(Direction.WEST)
        location.updateLocation(Direction.WEST)
        println("Moving west...")
        location.printLocation()
        true
    }

    val end = {
        path.add(Direction.END)
        println("\n=== Game Over ===")
        println("Your path: $path")
        println("Total moves: ${path.size - 1}")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        // Task 2: Invoke the lambda
        where.invoke()
    }

    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

class Location(private val width: Int = 4, private val height: Int = 4) {
    private var x = 0
    private var y = 0
    private val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        // Initialize map with descriptions
        map[0][0] = "You are at the starting point. A forest lies ahead."
        map[0][1] = "You are in a dense forest. Trees surround you."
        map[0][2] = "You reached a clearing. The sun shines brightly."
        map[0][3] = "You see a mountain in the distance."

        map[1][0] = "You are near a river. Water flows gently."
        map[1][1] = "You crossed a wooden bridge."
        map[1][2] = "You are in a meadow full of flowers."
        map[1][3] = "You found an old abandoned cabin."

        map[2][0] = "You are at the edge of a cliff. Be careful!"
        map[2][1] = "You discovered a hidden cave entrance."
        map[2][2] = "You are in a mysterious fog."
        map[2][3] = "You reached a sacred temple."

        map[3][0] = "You are at a crossroads. Which way to go?"
        map[3][1] = "You found a treasure chest! (empty though)"
        map[3][2] = "You are in a dark forest. It's getting spooky."
        map[3][3] = "You reached the end of the world!"
    }

    fun updateLocation(direction: Direction) {
        when (direction) {
            Direction.NORTH -> y = (y - 1).absoluteValue.rem(height)
            Direction.SOUTH -> y = (y + 1).rem(height)
            Direction.EAST -> x = (x + 1).rem(width)
            Direction.WEST -> x = (x - 1).absoluteValue.rem(width)
            else -> {}
        }
    }

    fun printLocation() {
        println("Position: ($x, $y)")
        println(map[x][y] ?: "You are in an unknown location.")
        println()
    }
}