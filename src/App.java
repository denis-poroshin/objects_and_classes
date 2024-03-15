public class App {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Стивин", "Кинг");
        Library library = new Library(10);

        library.addBook(new Book(author, "Война и мир",  1867));
        library.addBook(new Book(author1,  "Евгений Онегин",  1833));
        library.addBook(new Book(author2, "Сияние", 1980));


        library.printAllBook(); // печать всех книг
        library.printBookByTitle("Война и мир"); // поиск по названию киного
        library.changeInBookPublicationYear("Война и мир", 2005); // изменение года публикации книги

    }


}