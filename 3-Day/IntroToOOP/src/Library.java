import java.util.ArrayList;
public class Library {

    private ArrayList<Book> books;


    // Constructor
    public Library(){
        this.books = new ArrayList<>();
    }

    // Adding book
    public void addBook(Book book){
        books.add(book);
    }

    // Method to display all books

    public void displayBooks(){
        for(Book book : books){
            book.display();
        }
    }
}
