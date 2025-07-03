package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Initialize and display a Person instance:
        Person person1 = new Person("Anders", "Eriksson");
        System.out.println(person1.getPersonInformation());

        // Initialize and display a Book instance:
        Book book1 = new Book("Bok om småfåglar", "Erik Svensson");
        System.out.println(book1.getBookInformation());

        // Simulate borrowing a book:
        person1.loanBook(book1);
        System.out.println(book1.getBookInformation());

        // Simulate returning a book:
        person1.returnBook(book1);
        System.out.println(book1.getBookInformation());

    }

}
