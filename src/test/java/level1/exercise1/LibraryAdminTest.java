package level1.exercise1;

import leve1.exercise1.administrator.LibraryAdmin;

import leve1.exercise1.model.Book;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryAdminTest {

    private LibraryAdmin admin;

    @BeforeEach
    void setUp() {
        admin = new LibraryAdmin();
    }

    @Test
    void testListIsNotNullAfterCreation() {
        assertNotNull(admin.listAllBooks());
        assertTrue(admin.listAllBooks().isEmpty());
    }

    @Test
    void testListHasExpectedSizeAfterAddingBooks() {
        admin.addBook(new Book("Atmosphere", "Taylor Jenkins"));
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));
        admin.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));

        assertEquals(3, admin.getTotalBooks());
    }

    @Test
    void testListContainsBookInCorrectPosition() {
        admin.addBook(new Book("Atmosphere", "Taylor Jenkins"));
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));
        admin.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));

        List<Book> books = admin.listAllBooks();

        assertEquals("Atmosphere", books.get(0).getTitle());
        assertEquals("Harry Potter and the Sorcerer's Stone", books.get(1).getTitle());
        assertEquals("The Hobbit", books.get(2).getTitle());
    }

    @Test
    void testNoDuplicateTitlesInList() {
        Book book = new Book("The Hobbit", "John Ronald Reuel Tolkien");
        assertTrue(admin.addBook(book));
        assertFalse(admin.addBook(book)); // Intento de duplicado

        assertEquals(1, admin.getTotalBooks());
    }

    @Test
    void testGetBookByIndexReturnsCorrectTitle() {
        admin.addBook(new Book("Atmosphere", "Taylor Jenkins"));
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));

        Book book = admin.getBookByIndex(1);
        assertEquals("The Hobbit", book.getTitle());
    }

    @Test
    void testAddingBookModifiesTheListCorrectly() {
        int initialSize = admin.getTotalBooks();

        admin.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));

        assertEquals(initialSize + 1, admin.getTotalBooks());
    }

    @Test
    void testRemovingBookDecreasesListSize() {
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));
        admin.deleteBookByTitle("The Hobbit");

        assertEquals(0, admin.getTotalBooks());
    }

    @Test
    void testListRemainsAlphabeticallySortedAfterAddAndRemove() {
        admin.addBook(new Book("Atmosphere", "Taylor Jenkins"));
        admin.addBook(new Book("The Hobbit", "John Ronald Reuel Tolkien"));
        admin.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));

        List<Book> sortedList = admin.listAllBooks();
        assertEquals("Atmosphere", sortedList.get(0).getTitle());
        assertEquals("Harry Potter and the Sorcerer's Stone", sortedList.get(1).getTitle());
        assertEquals("The Hobbit", sortedList.get(2).getTitle());

        admin.deleteBookByTitle("Harry Potter and the Sorcerer's Stone");

        sortedList = admin.listAllBooks();
        assertEquals("Atmosphere", sortedList.get(0).getTitle());
        assertEquals("The Hobbit", sortedList.get(1).getTitle());
    }
}
