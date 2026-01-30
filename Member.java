package LMS;
import java.util.ArrayList;
import java.util.List;

class Member {
    private int id;
    private String name;
    private List <Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List <Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is currently not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }

    @Override
    public String toString() {
        return "Member [ID=" + id + ", Name=" + name + ", BorrowedBooks=" + borrowedBooks + "]";
    }
}
