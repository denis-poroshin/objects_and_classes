public class Book {
    private  Author name;
    private Author surname;

    private String bookTitle;
    private int year;
    public Book(Author name, Author surname, String bookTitle, int year){
        this.name = name;
        this.surname = surname;
        this.bookTitle = bookTitle;
        this.year = year;
    }

    public Author getName() {
        return this.name;
    }
    public Author getSurname(){
        return this.surname;
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
