package lab4.library;

import java.util.ArrayList;

public class Member {
	public int id = 0;
	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private int memberID;
	private String name;
	private ArrayList<Book> borrowedBooks;
	// private borrowedbBooks TODO: implement collection of borrowed books
	// TODO: implement functionality of Member class
	public Member(String name) {
		this.name = name;
		this.memberID = id;
		this.borrowedBooks = new ArrayList<>();
		id++;
	}
	
	public int getMemberID(){
		return memberID;
	}
	public String getName(){
		return name;
	}
	public ArrayList<Book> getborrowedBooks(){
		return borrowedBooks;
	}
	public boolean borrowBook(Book book) {
		if(book.getAvailability()) { /// John added this condition for borrowing a book
			borrowedBooks.add(book);
			System.out.println(name + " has borrowed " + book.getTitle());
			return true;
		}else {
			System.out.println("** Sorry "+this.name+" "+book.getTitle()+" is not available");
			return false;
		}
		
	}
	public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " has returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }
	

}
