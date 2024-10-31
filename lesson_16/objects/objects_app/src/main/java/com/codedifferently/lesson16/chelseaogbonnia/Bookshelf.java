package com.codedifferently.lesson16.chelseaogbonnia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class BookNotFoundException extends Exception {
  public BookNotFoundException(String message) {
    super(message);
  }
}

public class Bookshelf {
  private String owner;
  private int capacity;
  private List<Book> books;
  private HashMap<String, Book> bookMap;
  private boolean isPublic;

  public Bookshelf(String owner, int capacity, boolean isPublic) {
    this.owner = owner;
    this.capacity = capacity;
    this.isPublic = isPublic;
    this.books = new ArrayList<>();
    this.bookMap = new HashMap<>();
  }

  public List<Book> listBooks() {
    return Collections.unmodifiableList(books);
  }

  public void addBook(Book book) throws Exception {
    if (books.size() >= capacity) {
      throw new Exception("Bookshelf is full. Cannot add more books.");
    }
    books.add(book);
    bookMap.put(book.getTitle(), book);
  }

  public Book findBook(String title) throws BookNotFoundException {
    if (bookMap.containsKey(title)) {
      return bookMap.get(title);
    }
    throw new BookNotFoundException("Book titled \"" + title + "\" not found.");
  }

  public boolean hasBook(String title) {
    return bookMap.containsKey(title);
  }

  public int countBooksByGenre(Genre genre) {
    int count = 0;
    for (Book book : books) {
      if (book.getGenre() == genre) {
        count++;
      }
    }
    return count;
  }

  public String getOwner() {
    return owner;
  }

  public boolean isPublic() {
    return isPublic;
  }

  @Override
  public String toString() {
    return "Bookshelf owned by "
        + owner
        + " with capacity "
        + capacity
        + " (Public: "
        + isPublic
        + ")";
  }
}
