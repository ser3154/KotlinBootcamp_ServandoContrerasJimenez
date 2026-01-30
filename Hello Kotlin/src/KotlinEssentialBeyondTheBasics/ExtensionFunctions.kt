package KotlinEssentialBeyondTheBasics

//Puede ser útil saber el peso de un libro, por ejemplo, para su envío. El peso de un libro puede cambiar porque a veces las páginas se rompen y el número de páginas cambia. Si bien calcular el peso podría definirse como un método, es más bien una función auxiliar. Además, sería perjudicial para un libro tener un método que rompa sus páginas.
//
//Añade la propiedad mutable "pages" a "Book".
//Crea una función de extensión en "Book" que devuelva el peso de un libro como el número de páginas multiplicado por 1,5 gramos.
//Crea otra extensión, "tornPages()", que tome el número de páginas rotas como argumento y cambie el número de páginas del libro.
//Escribe una clase "Cachorro" con el método "playWithBook()" que tome un libro como argumento y elimine un número aleatorio de páginas del libro.
//Crea un cachorro y dale un libro para que juegue hasta que no queden más páginas.

import java.util.Random

fun main() {

    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    println("Initial book weight: ${book.weight()} grams")
    println("Starting pages: ${book.pages}\n")

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} pages left in ${book.title}")
    }

    println("\nSad puppy, no more pages in ${book.title}.")
    println("Final book weight: ${book.weight()} grams")
}

// Updated Book class with pages property
class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return hasBooks < MAX_NUMBER_BOOKS
    }

    fun printUrl() {
        println("$BASE_URL$title.html")
    }
}

fun Book.weight(): Double {
    return (pages * 1.5)
}

// Task 3: Extension function to tear pages
fun Book.tornPages(torn: Int) {
    if (pages >= torn) {
        pages -= torn
    } else {
        pages = 0
    }
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

const val MAX_NUMBER_BOOKS = 20