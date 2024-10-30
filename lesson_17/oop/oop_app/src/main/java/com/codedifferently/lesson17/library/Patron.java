package com.codedifferently.lesson17.library;

import java.util.ArrayList;
import java.util.List;

/** Represents a patron of the library. */
public class Patron {
  private String name;
  private List<Book> checkedOutBooks;

  public Patron(String name) {
    this.name = name;
    this.checkedOutBooks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Book> getCheckedOutBooks() {
    return checkedOutBooks;
  }

  public void setCheckedOutBooks(List<Book> checkedOutBooks) {
    this.checkedOutBooks = checkedOutBooks;
  }

  public void checkOutBook(Book book) {
    if (!book.isCheckedOut()) {
      book.setCheckedOut(true);
      checkedOutBooks.add(book);
    } else {
      System.out.println("Marvel comic is already checked out.");
    }
  }

  public void returnBook(Book book) {
    if (checkedOutBooks.contains(book)) {
      book.setCheckedOut(false);
      checkedOutBooks.remove(book);
    } else {
      System.out.println("Marvel comic is not checked out by this patron.");
    }
  }
}
