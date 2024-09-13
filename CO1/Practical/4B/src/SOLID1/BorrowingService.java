package SOLID1;

public class BorrowingService implements Borrowable {
	public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
    }
    public void returnBook(Member member, Book book) {
        member.returnBook(book);

}
}
