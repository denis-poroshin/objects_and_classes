public class App {
    public static Book[] book = new Book[10];
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Александр", "Пушкин");
        addBook(author, "Война и мир",  1867);
        addBook(author1,  "Евгений Онегин",  1833);
        printAllBook();
    }
    public static void addBook(Author author, String bookTitle, int year){
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
               Book newBook = new Book(author,bookTitle, year);
               book[i] = newBook;
               break;
            }
        }
    }
    public static void printAllBook(){
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                break;
            }
            System.out.println(book[i].getAuthor() + ": " + book[i].getBookTitle() + ": " + book[i].getYear());

        }
    }
}