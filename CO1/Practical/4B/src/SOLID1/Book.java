package SOLID1;

public interface Book {
	    String getTitle();
	    String getAuthor();
	    String getISBN();
	    boolean isAvailable();
	    void setAvailability(boolean availability);
}
