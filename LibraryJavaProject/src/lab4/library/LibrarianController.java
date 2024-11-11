package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	Library library;
	public LibrarianController() {
		library = new Library();
	}
	
	
	public void addBookToCatalog(Book book) { //adds an existing book object
		library.addBook(book);
	}
	public void addBookToCatalog(String bookTitle) { //creates and adds a new book
		library.addBook(bookTitle);
	}
	public void addMember(String Name) {
		library.addMembers(Name);
		}
	public void borrowBook(String bookTitle, String memberName) {
		Member m = library.getMember(memberName);
		Book b = library.getBook(bookTitle);
		if(m.borrowBook(b)) { // borrowBook return true if book was successfully borrowed
			b.updateStatus(); // sets the book to unavailable
		}
	}
	public void returnBook(String bookTitle, String memberName) {
		Member m = library.getMember(memberName);
		Book b = library.getBook(bookTitle);
		b.updateStatus();
		m.returnBook(b);
	}
	public void showCatalog() {
		library.showAllBooks();
	}
	public void showMembers() {
		library.showAllMembers();
	}
	public void showAvailableBoooks() {
		library.showAvailable();
	}
	

}
