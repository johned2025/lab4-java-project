package lab4.library;

import java.util.ArrayList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	private ArrayList<Book> catalog;
	
	private ArrayList<Member> members;
	private ArrayList<Book> availableBooks;
	
	
	// DONE: implement functionality of Member class
	public Library() {
		catalog = new ArrayList<>();
		members= new ArrayList<>();
	}
	public void addMembers(Member member) {
		members.add(member);
	}
	public void addBook(Book book) {
		catalog.add(book);
	}
	public void availableBooks() {
		for(Book book: catalog) {
			if(book.getAvailability()) {
				availableBooks.add(book);
			}
		}
	}
}