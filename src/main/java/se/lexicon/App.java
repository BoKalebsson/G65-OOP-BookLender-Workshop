package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Initialize and display a Person instance:
        Person person1 = new Person("Anders", "Eriksson");
        System.out.println(person1.getPersonInformation());

        Person person2 = new Person("Greger", "Pettersson");
        System.out.println(person2.getPersonInformation());

        // Initialize and display a Book instance:
        Book book1 = new Book("Bok om småfåglar", "Erik Svensson");
        System.out.println(book1.getBookInformation());

        Book book2 = new Book("Bok om pannkakor", "Per Moberg");
        System.out.println(book2.getBookInformation());

        // Simulate borrowing a book:
        person1.loanBook(book1);
        System.out.println(book1.getBookInformation());

        // Simulate returning a book you haven't loaned:
        person2.returnBook(book1);
        System.out.println(book1.getBookInformation());

        // Simulate returning a book:
        person1.returnBook(book1);
        System.out.println(book1.getBookInformation());

        // Simulate returning a book you don't have:
        person2.returnBook(book2);
        System.out.println(book2.getBookInformation());

    }

}
