package se.lexicon.model;

/**
  * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    // Attributes:
    private String id;
    private String title;
    private String author;
    private boolean avaliable;

    // Constructor:
    public Book(String title, String author) {
        this.id = id;
        setTitle(title);
        setAuthor(author);
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


}