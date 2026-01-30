package LMS;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Adding Members
        library.addMember(new Member(1, "Alice"));
        library.addMember(new Member(2, "Bob"));

        // Issue and Return Books
        library.issueBook(1, 1); // Alice borrows "The Great Gatsby"
        library.issueBook(2, 1); // Bob tries to borrow "The Great Gatsby"
        library.returnBook(1, 1); // Alice returns "The Great Gatsby"
        library.issueBook(2, 1); // Bob borrows "The Great Gatsby"

        // Display Books
        library.displayBooks();
    }
}



