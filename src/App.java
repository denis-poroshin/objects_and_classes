public class App {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book(author, author,"Война и мир",  1867);
        System.out.println("Название книги: " + book.getBookTitle() + "\n" + "Автор: " + author.getName() + " " + author.getSurneame() + "\n" + "Год публикации: " + book.getYear());
        book.setYear(1583);
        System.out.println("Год публикации книги изменен: " + book.getYear());


        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book(author1,author1, "Евгений Онегин",  1833);
        System.out.println("Название книги: " + book1.getBookTitle() + "\n" + "Автор: " + author1.getName() + " " + author1.getSurneame() + "\n" + "Год публикации: " + book1.getYear());
        book1.setYear(1600);
        System.out.println("Год публикации книги изменен: " + book1.getYear());






    }
}