public class Book {
    private  Author author;


    private String bookTitle;
    private int year;
    public Book(Author author, String bookTitle, int year){

        this.author = author;
        this.bookTitle = bookTitle;
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;

    }
}
