import java.util.Objects;

import static java.util.Objects.hash;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return hash(bookTitle);
    }

    public String toString(){
        return "Название книги: " + this.bookTitle + "\n" + "Автор: " + this.author + "\n" + "Год публикации: " + this.year;
    }
}
