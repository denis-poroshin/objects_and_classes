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


    public boolean equals(Author other){
        if (this.getName() == other.getName() && this.getSurneame() == other.getSurneame()){
            return true;
        } else{
            return false;
        }

    }
    public int hashCode(){
        return java.util.Objects.hash(name, surneame);

    }


}
