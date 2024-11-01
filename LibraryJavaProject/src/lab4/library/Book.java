package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String title) {
		this.title = title;
		this.isAvailable = true;
	}
	
	// TODO: implement Book functionality 
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean getAvailability() {
		return isAvailable;
	}
	
	public void updateStatus() {
		isAvailable = !isAvailable;
	}
}
