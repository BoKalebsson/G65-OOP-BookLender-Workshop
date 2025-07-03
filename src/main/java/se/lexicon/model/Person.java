package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {

    private static int sequencer = 0;

    // Attributes:
    private int id;
    private String firstName;
    private String lastName;

    // Constructor:
    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
    }

    // Getters:
    public int getId() {
        return this.id;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    private int getNextId() {
        return ++sequencer;
    }

    // Setters:
    public void setFirstName(String firstName){
        if (firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("Firstname cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        if (lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Lastname cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    // Operations:
    public String getPersonInformation() {
        return String.format("--Person Information--%nID: %d%nName: %s %s%n--------------------", id, firstName, lastName);
    }

    public boolean loanBook(Book book) {
        if(book.isAvailable()) {
            book.setBorrower(this);
            System.out.println("Yepp!");
            return true;
        }
        System.out.println("Nope!");
        return false;
    }

    public boolean returnBook(Book book) {
        if(!book.isAvailable()) {
            book.setBorrower(null);
            System.out.println("The book is returned.");
            return true;
        }
        System.out.println("We could not return the book.");
        return false;
    }

}