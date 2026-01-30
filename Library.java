package LMS;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void issueBook(int memberId, int bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Invalid Member ID or Book ID.");
        }
    }

    public void returnBook(int memberId, int bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Invalid Member ID or Book ID.");
        }
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}

