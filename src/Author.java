import java.util.Objects;

import static java.util.Objects.hash;

public class Author {
    private String name;
    private String surneame;

    public Author(String name, String surname){
        this.name = name;
        this.surneame = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurneame(){
        return this.surneame;
    }
    public String toString(){
        return this.name + " " + this.surneame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surneame, author.surneame);
    }


    @Override
    public int hashCode() {
        return hash(name, surneame);
    }
}
