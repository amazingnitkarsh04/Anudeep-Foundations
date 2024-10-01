package com.storebook;


	import java.util.ArrayList;

	class Book {
	    // Attributes of the Book class
	    private int bookId;
	    private String bookName;
	    private String authorName;

	    // Parameterized constructor to initialize Book objects
	    public Book(int bookId, String bookName, String authorName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	    }

	    // Getter methods to access private attributes
	    public int getBookId() {
	        return bookId;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public String getAuthorName() {
	        return authorName;
	    }

	    // Method to display Book details
	    public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName);
	    }
	}

	public class StoreBookArrayList {
	    public static void main(String[] args) {
	        // Create an ArrayList to store Book objects
	        ArrayList<Book> bookList = new ArrayList<>();

	        // Add Book objects to the ArrayList
	        bookList.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
	        bookList.add(new Book(2, "1984", "George Orwell"));
	        bookList.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
	        bookList.add(new Book(4, "Moby Dick", "Herman Melville"));

	        // Use advanced (enhanced) for loop to display all book details
	        for (Book book : bookList) {
	            book.displayBookDetails();  // Call method to display details of each book
	        }
	    }
	}


