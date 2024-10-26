package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private int memberID;
	private String name;
	private ArrayList<String> borrowedBooks;
	// private borrowedbBooks TODO: implement collection of borrowed books
	// TODO: implement functionality of Member class
	public Member(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public int getMemberID(){
		return memberID;
	}
	public String getName(){
		return name;
	}
	public ArrayList<String> getborrowedBooks(){
		return borrowedBooks;
	}
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
		System.out.println(name + " has borrowed " + book.getTitle());
	}
	public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " has returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }
	

}
