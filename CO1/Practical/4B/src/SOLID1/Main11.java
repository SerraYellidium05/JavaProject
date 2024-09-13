package SOLID1;

public class Main11 {

	public static void main(String[] args) {
		Librarian librarian = new Librarian("John Doe", "L001");
        Book book1 = new LendingBook("Java Programming", "James Gosling", "ISBN12345");
        Book book2 = new LendingBook("Design Patterns", "Erich Gamma", "ISBN67890");
        librarian.addBook(book1);
        librarian.addBook(book2);
        Member member1 = new RegularMember("Alice", "M001");
        Member member2 = new RegularMember("Bob", "M002");
        BorrowingService borrowingService = new BorrowingService();
        borrowingService.borrowBook(member1, book1);
        borrowingService.borrowBook(member2, book2);
        borrowingService.returnBook(member1, book1);
        borrowingService.returnBook(member2, book2);

	}
}
