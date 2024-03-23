public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("PythonDeepDive","WinHtut",2020);
        Book book2 = new Book("DDSA","WinHtut",2023);

        Library library= new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

    }
}