package FunctionalManipulation

//Cree una extensión de List usando una función de orden superior que devuelva todos los números de la lista que sean divisibles por 3. Comience creando una función de extensión de List que tome una lambda de Int y la aplique a cada elemento de la lista. Cuando la lambda devuelva cero, incluya el elemento en la salida. Por ejemplo, esta lista:
//
//val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    println("Divisible by 3:")
    println(numbers.divisibleBy { it.rem(3) })

    println("\nDivisible by 2:")
    println(numbers.divisibleBy { it.rem(2) })

    println("\nDivisible by 5:")
    println(numbers.divisibleBy { it.rem(5) })
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}