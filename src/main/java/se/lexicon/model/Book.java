package se.lexicon.model;

import java.util.UUID;

/**
  * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    // Attributes:
    private String id;
    private String title;
    private String author;
    private Person borrower;
    private boolean available;

    // Constructor:
    public Book(String title, String author) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        this.borrower = null;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    // Getters:
    public String getId() {
        return this.id;
    }

    public String getTitle() {

        return this.title;
    }

    public String getAuthor() {

        return this.author;
    }

    public Person getBorrower() {
        return borrower;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters:
    public void setTitle(String title){
        if (title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public void setAuthor(String author){
        if (author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        if(borrower == null) {
            available = true;
        }
        else {
            available = false;
        }
        this.borrower = borrower;
    }

    // Operations:
    private static String generateID() {
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    public String getBookInformation() {
        String borrowerName = (borrower != null) ? borrower.getFirstName() + " " + borrower.getLastName() : "None";
        return String.format(
                "--Book Information--%nID: %s%nTitle: %s%nAuthor: %s%nAvailable: %b%nBorrower: %s%n--------------------",
                id, title, author, available, borrowerName
        );
    }


}