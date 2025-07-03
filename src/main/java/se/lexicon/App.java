package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

        Person person1 = new Person("Anders", "Eriksson");
        System.out.println(person1.getPersonInformation());

        Person person2 = new Person("Greger", "Svensson");
        System.out.println(person2.getPersonInformation());

        Book book1 = new Book("Bok om småfåglar", "Erik Svensson");
        System.out.println(book1.getBookInformation());

        Book book2 = new Book("Bok om skruvmejslar", "Elin Johansson");
        System.out.println(book2.getBookInformation());

        Book book3 = new Book("Bok om pannkakor", "Per Moberg", null);
        System.out.println(book3.getBookInformation());

        Book book4 = new Book("Bok om pannkakor", "Per Moberg", person1);
        System.out.println(book4.getBookInformation());
    }

}
