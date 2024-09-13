package SOLID1;

public class LendingBook  implements Book{
	private String title;
    private String author;
    private String isbn;
    private boolean available;
    public LendingBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; 
   }
  public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return isbn;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailability(boolean availability) {
        this.available = availability;
    }

}
