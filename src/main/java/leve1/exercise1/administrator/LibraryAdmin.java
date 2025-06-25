package leve1.exercise1.administrator;
import leve1.exercise1.model.Book;
import leve1.exercise1.model.Library;

import java.util.List;

public class LibraryAdmin {
    private Library library;

    public LibraryAdmin() {
        library = new Library();
    }

    public boolean addBook(Book book) {
        return library.addBook(book);
    }

    public boolean addBookAtPosition(int index, Book book) {
        return library.addBookAt(index, book);
    }

    public boolean deleteBookByTitle(String title) {
        return library.removeBook(title);
    }

    public List<Book> listAllBooks() {
        return library.getAllBooks();
    }

    public Book getBookByIndex(int index) {
        return library.getBookAt(index);
    }

    public int getTotalBooks() {
        return library.getBookCount();
    }

    public boolean hasBook(String title) {
        return library.containsBook(title);
    }
}