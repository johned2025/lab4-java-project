package lab4.library;

import java.util.ArrayList;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	private ArrayList<Book> catalog;
	
	private ArrayList<Member> members;
	
	
	
	// DONE: implement functionality of Member class
	public Library() {
		catalog = new ArrayList<>();
		members= new ArrayList<>();
	}
	public void addMembers(Member member) {
		members.add(member);
	}
	public void addMembers(String memberName) {
		members.add(new Member(memberName));
	}
	public void addBook(Book book) {
		catalog.add(book);
		System.out.println(book.getTitle()+ " was added to library catalog");
	}
	public void addBook(String bookTitle) {
		
		catalog.add(new Book(bookTitle));
		System.out.println(bookTitle+ " was added to library catalog");
	}
	// retrieves a member from members' list
	// or  creates a member and add it to members' list
	public Member getMember(String name) {
		for(Member m : members) {
			if(m.getName() == name) return m;
		}
		Member m = new Member(name);
		this.addMembers(m);
		return m;
	}
	public Book getBook(String BookName) {
		for(Book b : catalog) {
			if(b.getTitle() == BookName) return b;
		}
		Book b = new Book(BookName);
		this.addBook(b);
		return b;
	}
	public void showAllBooks() {
		System.out.println("** Library Catalog **");
		for(Book b: catalog) {
			System.out.println(b.getTitle());
		}
	}
	public void showAllMembers() {
		System.out.println("** Library Members **");
		for(Member m: members) {
			System.out.println(m.getName());
		}
	}
	public void showAvailable() {
		System.out.println("** Library Available Books **");
		for(Book b: catalog) {
			if(b.getAvailability()) {
				System.out.println(b.getTitle());
			}
			
		}
	}
	
}
