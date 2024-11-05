package com.codedifferently.lesson16.chelseaogbonnia.bookshelf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookshelfTest {
  private Bookshelf bookshelf;

  @BeforeEach
  public void setUp() {
    bookshelf = new Bookshelf("Chelsea", 10, true);
  }

  @Test
  public void testAddBook() throws Exception {
    // Arrange
    Book book = new Book("Frankenstein", "Mary Shelly", Genre.HORROR, BookType.NOVEL);

    // Act
    bookshelf.addBook(book);

    // Assert
    assertTrue(bookshelf.hasBook("Frankenstein"));
  }

  @Test
  public void testFindBookExists() throws Exception {
    // Arrange
    Book book =
        new Book("Brave New World", "Aldous Huxley", Genre.SCIENCE_FICTION, BookType.PAPERBACK);
    bookshelf.addBook(book);

    // Act
    Book foundBook = bookshelf.findBook("Brave New World");

    // Assert
    assertEquals(book, foundBook);
  }

  @Test
  public void testFindBookNotExists() {
    // Arrange
    String nonExistentBookTitle = "Non-Existent Book";

    // Act & Assert
    Exception exception =
        assertThrows(
            BookNotFoundException.class,
            () -> {
              bookshelf.findBook(nonExistentBookTitle);
            });
    assertEquals("Book titled \"" + nonExistentBookTitle + "\" not found.", exception.getMessage());
  }

  @Test
  public void testCountBooksByGenre() throws Exception {
    // Arrange
    bookshelf.addBook(new Book("The Hobbit", "J.R.R. Tolkien", Genre.FANTASY, BookType.HARDCOVER));
    bookshelf.addBook(new Book("Dune", "Frank Herbert", Genre.SCIENCE_FICTION, BookType.HARDCOVER));

    // Act & Assert
    assertEquals(1, bookshelf.countBooksByGenre(Genre.SCIENCE_FICTION));
    assertEquals(1, bookshelf.countBooksByGenre(Genre.FANTASY));
  }

  @Test
  public void testAddBookToFullShelf() throws Exception {
    // Arrange
    for (int i = 0; i < 10; i++) {
      bookshelf.addBook(new Book("Book " + i, "Author " + i, Genre.FICTION, BookType.PAPERBACK));
    }
    Book extraBook = new Book("Extra Book", "Author Extra", Genre.FICTION, BookType.HARDCOVER);

    // Act & Assert
    Exception exception =
        assertThrows(
            Exception.class,
            () -> {
              bookshelf.addBook(extraBook);
            });
    assertEquals("Bookshelf is full. Cannot add more books.", exception.getMessage());
  }

  @Test
  public void testCountBooksByGenreNoBooks() {
    // Arrange
    Genre genreToCheck = Genre.ADVENTURE;

    // Act & Assert
    assertEquals(0, bookshelf.countBooksByGenre(genreToCheck));
  }

  @Test
  public void testListBooks() throws Exception {
    // Arrange
    bookshelf.addBook(
        new Book("The Adventures of Tintin", "Hergé", Genre.ADVENTURE, BookType.COMICS));
    bookshelf.addBook(new Book("The Big Sleep", "Raymond Chandler", Genre.CRIME, BookType.NOVEL));
    bookshelf.addBook(
        new Book("Don Quixote", "Miguel de Cervantes", Genre.ADVENTURE, BookType.NOVEL));
    bookshelf.addBook(new Book("Sonnet 18", "William Shakespeare", Genre.ROMANCE, BookType.POEM));

    // Act
    int bookCount = bookshelf.listBooks().size();

    // Assert
    assertEquals(4, bookCount);
  }

  @Test
  public void checksMagazineBooks() throws Exception {
    // Arrange
    Book magazine =
        new Book("National Geographic", "Various", Genre.NON_FICTION, BookType.MAGAZINE);
    bookshelf.addBook(magazine);

    // Act
    boolean hasMagazine = bookshelf.hasBook("National Geographic");
    int magazineCount = bookshelf.countBooksByGenre(Genre.NON_FICTION);

    // Assert
    assertTrue(hasMagazine, "Bookshelf should contain the magazine 'National Geographic'.");
    assertEquals(
        1, magazineCount, "There should be 1 magazine in the bookshelf under NON_FICTION.");
  }
}
