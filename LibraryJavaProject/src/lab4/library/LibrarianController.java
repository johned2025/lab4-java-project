package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	Library library = new Library();
	
	public void addBookToCatalog(Book book) { //adds an existing book
		library.addBook(book);
	}
	public void addBookToCatalog(String bookTitle) { //creates and adds a new book
		library.addBook(bookTitle);
	}
	

}
