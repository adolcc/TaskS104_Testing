package leve1.exercise1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if (book == null || containsBook(book.getTitle())) return false;
        books.add(book);
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        return true;
    }

    public boolean addBookAt(int index, Book book) {
        if (index < 0 || index > books.size() || book == null || containsBook(book.getTitle())) {
            return false;
        }
        books.add(index, book);
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        return true;
    }

    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookAt(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid book index");
        }
        return books.get(index);
    }

    public int getBookCount() {
        return books.size();
    }

    public boolean containsBook(String title) {
        return books.stream().anyMatch(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
