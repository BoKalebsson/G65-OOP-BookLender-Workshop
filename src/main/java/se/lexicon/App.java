package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances: Done.
        // Simulate borrowing a book
        // Simulate returning a book

        Person person1 = new Person("Anders", "Eriksson");
        System.out.println(person1.getPersonInformation());

        Book book1 = new Book("Bok om småfåglar", "Erik Svensson");
        System.out.println(book1.getBookInformation());

        Book book3 = new Book("Bok om pannkakor", "Per Moberg", null);
        System.out.println(book3.getBookInformation());

        Book book4 = new Book("Bok om plättar", "Per Moberg", person1);
        System.out.println(book4.getBookInformation());

        person1.loanBook(book3);
        System.out.println(book3.getBookInformation());

    }

}
