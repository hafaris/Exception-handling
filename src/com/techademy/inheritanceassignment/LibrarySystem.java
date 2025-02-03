package com.techademy.inheritanceassignment;

class Item {
    String title;
    String author;
    int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Derived class: Book
class Book extends Item {
    String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
        System.out.println("--------------------------");
    }
}

// Derived class: Magazine
class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("--------------------------");
    }
}

public class LibrarySystem {
	public static void main(String[] args) {
		
		//Book
		Book b1= new Book("War and Peace", "Leo Tolstoy",1869, "Fiction");
		
		System.out.println("Book Details:");
        b1.displayDetails();
        
        //Magazine
        Magazine m1 = new Magazine("National Geographic", "Multiple Authors", 2025, 1101);
        
        System.out.println("Magazine Details:");
        m1.displayDetails();
	}
}
