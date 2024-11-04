package com.codedifferently.lesson16.librarybook;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryBookTest {

  private LibraryBook book;

  @BeforeEach
  public void setUp() {
    book = new LibraryBook("1984", "George Orwell", LibraryBook.Genre.FICTION, 1949);
  }

  @Test
  public void testConstructor() {
    assertEquals("1984", book.getTitle());
    assertEquals("George Orwell", book.getAuthor());
    assertEquals(LibraryBook.Genre.FICTION, book.getGenre());
    assertEquals(1949, book.getPublicationYear());
  }

  @Test
  public void testCheckOut() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    assertTrue(book.isCheckedOut());
  }

  @Test
  public void testReturnBook() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    book.returnBook(false);
    assertFalse(book.isCheckedOut());
  }

  @Test
  public void testDisplayBorrowerHistory() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    book.returnBook(false);
    book.checkOut("Bob");
    book.returnBook(false);

    String expectedHistory = "Borrower History:\n- Alice\n- Bob\n";

    assertEquals(expectedHistory, book.displayBorrowerHistory());
  }

  @Test
  public void testOverdueExceptionOnReturn() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    Exception exception =
        assertThrows(
            LibraryBook.OverdueException.class,
            () -> {
              book.returnBook(true);
            });
    assertEquals("Book is overdue!", exception.getMessage());
  }

  @Test
  public void testCheckOutAlreadyCheckedOut() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    Exception exception =
        assertThrows(
            LibraryBook.OverdueException.class,
            () -> {
              book.checkOut("Bob");
            });
    assertEquals("Book is already checked out!", exception.getMessage());
  }

  @Test
  public void testReturnBookNotCheckedOut() {
    Exception exception =
        assertThrows(
            LibraryBook.OverdueException.class,
            () -> {
              book.returnBook(false);
            });
    assertEquals("Book was not checked out!", exception.getMessage());
  }

  @Test
  public void testCheckOutAddsToHistory() throws LibraryBook.OverdueException {
    book.checkOut("Charlie");
    assertEquals(1, book.getBorrowersHistory().size());
    assertEquals("Charlie", book.getBorrowersHistory().get(0));
  }

  @Test
  public void testMultipleCheckOutsAndReturns() throws LibraryBook.OverdueException {
    book.checkOut("Alice");
    book.returnBook(false);
    book.checkOut("Bob");
    book.returnBook(false);
    book.checkOut("Charlie");

    assertEquals(3, book.getBorrowersHistory().size());
    assertEquals("Alice", book.getBorrowersHistory().get(0));
    assertEquals("Bob", book.getBorrowersHistory().get(1));
    assertEquals("Charlie", book.getBorrowersHistory().get(2));
  }

  @Test
  public void testBorrowerHistoryIsEmptyInitially() {
    assertEquals(0, book.getBorrowersHistory().size());
  }

  @Test
  public void testGenre() {
    assertEquals(LibraryBook.Genre.FICTION, book.getGenre());
  }

  @Test
  public void testSetTitle() {
    book.setTitle("Animal Farm");
    assertEquals("Animal Farm", book.getTitle(), "Title should be updated to 'Animal Farm'");
  }

  @Test
  public void testSetAuthor() {
    book.setAuthor("Aldous Huxley");
    assertEquals("Aldous Huxley", book.getAuthor(), "Author should be updated to 'Aldous Huxley'");
  }

  @Test
  public void testSetGenre() {
    book.setGenre(LibraryBook.Genre.NONFICTION);
    assertEquals(
        LibraryBook.Genre.NONFICTION, book.getGenre(), "Genre should be updated to NON_FICTION");
  }

  @Test
  public void testSetPublicationYear() {
    book.setPublicationYear(1932);
    assertEquals(1932, book.getPublicationYear(), "Publication year should be updated to 1932");
  }

  @Test
  public void testSetCheckedOutStatus() {
    book.setCheckedOut(true);
    assertTrue(book.isCheckedOut(), "Checked out status should be updated to true");
  }

  @Test
  public void testSetBorrowersHistory() {
    book.setBorrowersHistory(List.of("Charlie", "Dana"));

    assertEquals(
        2, book.getBorrowersHistory().size(), "Borrowers history should contain 2 entries");
    assertEquals(
        "Charlie", book.getBorrowersHistory().get(0), "First borrower should be 'Charlie'");
    assertEquals("Dana", book.getBorrowersHistory().get(1), "Second borrower should be 'Dana'");

    try {
      book.getBorrowersHistory().add("Eve");
      fail("borrowersHistory should not be modifiable externally");
    } catch (UnsupportedOperationException e) {
    }
  }

  @Test
  public void testSetNewBorrowers() {
    book.setNewBorrowers(List.of("Alice", "Bob"));

    assertEquals(2, book.getNewBorrowers().size(), "New borrowers should contain 2 entries");
    assertEquals("Alice", book.getNewBorrowers().get(0), "First new borrower should be 'Alice'");
    assertEquals("Bob", book.getNewBorrowers().get(1), "Second new borrower should be 'Bob'");
  }

  @Test
  public void testGetNewBorrowers() {
    book.setNewBorrowers(List.of("Charlie", "Dana"));

    List<String> borrowers = book.getNewBorrowers();
    assertEquals(2, borrowers.size(), "Should return 2 new borrowers");
    assertEquals("Charlie", borrowers.get(0), "First new borrower should be 'Charlie'");
    assertEquals("Dana", borrowers.get(1), "Second new borrower should be 'Dana'");
  }
}
