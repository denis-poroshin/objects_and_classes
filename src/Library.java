public class Library {
    private Book[] book;

    public Library(int mas){
        this.book = new Book[mas];

    }
    public void addBook(Book newBook){

        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                book[i] = newBook;
                break;
            }
        }
    }
    public void printAllBook(){
        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                break;
            }
            System.out.println(book[i].getAuthor() + ": " + book[i].getBookTitle() + ": " + book[i].getYear());
        }
    }
    public void printBookByTitle(String bookTitle){
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null){
                break;
            }
            if (book[i].getBookTitle().equals(bookTitle)){
                System.out.println("Стенд: " + book[i].getAuthor() + " год публикации: " + book[i].getYear());
            }

        }


    }
    public void changeInBookPublicationYear(String bookTitle, int year){
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null){
                break;
            }
            if(book[i].getBookTitle().equals(bookTitle)){
                book[i].setYear(year);
                break;

            }

        }

    }

}
