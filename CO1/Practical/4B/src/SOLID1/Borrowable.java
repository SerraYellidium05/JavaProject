package SOLID1;

public interface Borrowable {
	 void borrowBook(Member member, Book book);
	 void returnBook(Member member, Book book);
}
