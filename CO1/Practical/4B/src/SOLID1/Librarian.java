package SOLID1;

public class Librarian extends Member {
public Librarian(String name, String memberId) {
		  super(name, memberId);		
	}
public void borrowBook(Book book) {
    throw new UnsupportedOperationException("Librarians do not borrow books.");
}
public void returnBook(Book book) {
    throw new UnsupportedOperationException("Librarians do not return books.");
}
public void addBook(Book book) {
    System.out.println(book.getTitle() + " has been added to the library.");
}
public void removeBook(Book book) {
    System.out.println(book.getTitle() + " has been removed from the library.");
}

}
