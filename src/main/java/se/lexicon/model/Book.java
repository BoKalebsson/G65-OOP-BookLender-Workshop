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
    private boolean avaliable;

    // Constructor:
    public Book(String title, String author) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        this.borrower = null;
        this.avaliable = true;
    }

    public Book(String title, String author, Person borrower) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        this.borrower = borrower;
        this.avaliable = (borrower == null);
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
        return avaliable;
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

    // Operations:
    private static String generateID() {
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    public String getBookInformation() {
        return String.format("ID: %s, Title: %s, Author: %s, Available: %b",
                id, title, author, avaliable);
    }

}