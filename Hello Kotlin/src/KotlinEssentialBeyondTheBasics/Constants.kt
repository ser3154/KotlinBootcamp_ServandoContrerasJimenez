package KotlinEssentialBeyondTheBasics

//Cree una constante de nivel superior para el número máximo de libros que una persona puede pedir prestados.
//Dentro de la clase Book, cree un método canBorrow() que devuelva verdadero o falso según si un usuario ya ha pedido prestado el número máximo de libros.
//Cree un objeto Constants que proporcione constantes al libro. Para este ejemplo, proporcione la URL BASE_URL para todos los libros del catálogo de la biblioteca. Dentro de Book, agregue un método printUrl que cree e imprima una URL compuesta por la URL BASE_URL, el título del libro y ".html".
//La URL base es realmente relevante para la clase Book. Por lo tanto, es lógico limitar su alcance a la clase Book. Utilice un objeto complementario para definir la constante en Book.

/**fun main() {
    val book1 = Book("Romeo and Juliet", "William Shakespeare", 1597)
    val book2 = Book("The Hobbit", "J.R.R. Tolkien", 1937)

    println("Can borrow with 5 books? ${book1.canBorrow(5)}")
    println("Can borrow with 20 books? ${book1.canBorrow(20)}")

    book1.printUrl()
    book2.printUrl()
}

const val MAX_NUMBER_BOOKS = 20

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

class Book(val title: String, val author: String, val year: Int) {

    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrlWithConstants() {
        println(Constants.BASE_URL + title + ".html")
    }

    fun printUrl() {
        println(BASE_URL + title + ".html")
    }
}**/