package KotlinEssentialBeyondTheBasics

//Un libro rara vez está solo, y un autor rara vez escribe solo un libro.
//
//Crea un conjunto de títulos de libros llamado allBooks, por ejemplo, de William Shakespeare.
//Crea un mapa llamado library que asocie el conjunto de libros, allBooks, al autor.
//Usa la función de colección any() en library para ver si alguno de los libros es "Hamlet".
//Crea un mapa mutable llamado moreBooks y añádele un título/autor.
//Usa getOrPut() para ver si un título está en el mapa y, si no está, añádelo.
//Sugerencias:
//
//any() se aplica a una colección y toma una lambda como argumento, por ejemplo:
//myList.any {it.contains(“name”)}
//getOrPut() es una función práctica que comprueba si una clave está en un mapa y, si lo está, devuelve el valor. De lo contrario, añade la clave con el valor proporcionado al mapa.
//mapOf() puede ser útil.

fun main() {

    val allBooks = setOf(
        "Macbeth",
        "Romeo and Juliet",
        "Hamlet",
        "A Midsummer Night's Dream"
    )

    val library = mapOf("Shakespeare" to allBooks)

    println("Does library contain Hamlet? ${library.any { it.value.contains("Hamlet") }}")

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")

    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }

    println("More books: $moreBooks")

    println("\nAll Shakespeare books:")
    library["Shakespeare"]?.forEach { println("  - $it") }
}