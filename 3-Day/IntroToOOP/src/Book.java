public class Book {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    //Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){

        this.year = year;
    }

    // Display
    public void display(){
        System.out.println("Book: "+title+" , Author: "+author+" , Year:"+year);

    }


}
