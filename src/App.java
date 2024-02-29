public class App {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book(author,"Война и мир",  1867);
        System.out.println(book);
        book.setYear(1583);
        System.out.println("Год публикации был изменен");
        System.out.println(book);


        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book(author1, "Евгений Онегин",  1833);
        System.out.println(book1);
        System.out.println("Год публикации был изменен");
        book1.setYear(1600);
        System.out.println(book1);








    }
}