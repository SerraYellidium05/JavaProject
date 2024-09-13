package SOLID1;

public class ReferenceBook  implements Book{
	private String title;
    private String author;
    private String isbn;

	public ReferenceBook(String title, String author, String isbn) {
		this.title = title;
        this.author = author;
        this.isbn = isbn;
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
	        return false; 
  }
	    public void setAvailability(boolean availability) {
	       System.out.println("Reference books are always available within the library.");
	    }

}
