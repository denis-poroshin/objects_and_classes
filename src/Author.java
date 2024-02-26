public class Author {
    private String name;
    private String name1;

    public Author(String name, String name1){
        this.name = name + " " +  name1; // Может сдесь нужно по другому
    }
    public String getAuthor(){
        return this.name;
    }



}
