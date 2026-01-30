package FunctionalManipulation

//En esta práctica, escribirás la primera parte de un juego de funciones de orden superior. Implementarás todo, excepto las funciones de orden superior. Comencemos.
//
//Crea un nuevo archivo.
//Crea una clase de enumeración, Directions, que contenga las direcciones NORTE, SUR, ESTE y OESTE, así como INICIO y FIN.
//Crea una clase Game.
//Dentro de Game, declara una variable, path, que es una lista mutable de Direction. Inicialízala con un elemento, START.
//Crea cuatro lambdas, north, south, east y west, que añadan la dirección respectiva a la ruta.
//Añade otra lambda, end, que:
//Añade END a path
//Imprime "Game Over"
//Imprime la ruta
//Borra la ruta
//Devuelve falso
//Crea una función main.
//Dentro de main(), crea una instancia de Game.
//Para probar tu código hasta ahora, en main() imprime la ruta y luego invoca north, east, south, west y end. Por último, imprime la ruta nuevamente.

/**fun main() {
    val game = Game()

    println(game.path)

    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    println(game.path)
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {

    var path = mutableListOf(Direction.START)

    val north = {
        path.add(Direction.NORTH)
    }

    val south = {
        path.add(Direction.SOUTH)
    }

    val east = {
        path.add(Direction.EAST)
    }

    val west = {
        path.add(Direction.WEST)
    }

    val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}**/