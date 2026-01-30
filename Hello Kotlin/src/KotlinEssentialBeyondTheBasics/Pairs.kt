package KotlinEssentialBeyondTheBasics

//Veamos un ejemplo de cómo obtener información sobre un libro en formato de par. Generalmente, se busca información sobre el título y el autor, y quizás también el año.
//
//Creemos una clase básica de libro, con título, autor y año. Por supuesto, se podría obtener cada propiedad por separado.
//Cree un método que devuelva tanto el título como el autor como par.
//Cree un método que devuelva el título, el autor y el año como triple. Consulte la documentación (se abre en una nueva pestaña) para saber cómo usar triple.
//Cree una instancia de libro.
//Imprima la información sobre el libro en una oración, como: "Aquí está su libro X escrito por Y en Z".

/**fun main() {
    val book = Book("Romeo and Juliet", "William Shakespeare", 1597)

    val bookTitleAuthor = book.getTitleAuthor()

    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    val (title, author) = book.getTitleAuthor()
    println("Here is your book $title by $author")

    val (title2, author2, year2) = book.getTitleAuthorYear()
    println("Here is your book $title2 by $author2 written in $year2")
}

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)  // Using 'to' infix function
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}**/