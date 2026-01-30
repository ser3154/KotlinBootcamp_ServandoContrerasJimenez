package classes

//Hablemos un momento de libros, esos pesados ​​tomos de papel con letras impresas.
//
//Crea una clase, Book, con título y autor.
//Añade un método, readPage(), que incrementa el valor de la variable privada currentPage en 1.
//Crea una subclase de Book; llámala eBook.
//eBook también acepta un formato, que por defecto es "texto".
//En los eBooks, contar palabras tiene más sentido que contar páginas. Anula el método readPage() para aumentar el recuento de palabras en 250, el promedio de palabras por página de la época de la máquina de escribir.

fun main() {
    // Test Book class
    val book = Book("The Hobbit", "J.R.R. Tolkien")
    println("Reading '${book.title}' by ${book.author}")
    book.readPage()
    book.readPage()
    book.readPage()
    println("Current page: ${book.currentPage}")

    // Test eBook class
    val ebook = eBook("Digital Fortress", "Dan Brown", "PDF")
    println("\nReading '${ebook.title}' by ${ebook.author} (${ebook.format})")
    ebook.readPage()
    ebook.readPage()
    println("Words read: ${ebook.wordCount}")
}

open class Book(val title: String, val author: String) {
    var currentPage = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}

