package leve1.exercise1.application;

import leve1.exercise1.administrator.LibraryAdmin;
import leve1.exercise1.model.Book;

public class Main {
    public static void main(String[] args) {

        LibraryAdmin admin = new LibraryAdmin();


        admin.addBook(new Book("Atmosphere", "Taylor Jenkins"));
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));
        admin.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));


        System.out.println("Book List:");
        for (Book book : admin.listAllBooks()) {
            System.out.println("- " + book);
        }


        admin.deleteBookByTitle("Atmosphere");
        System.out.println("\n Book 'Atmosphere' removed.");


        System.out.println("\n Updated Book List:");
        for (Book book : admin.listAllBooks()) {
            System.out.println("- " + book);
        }
    }
}