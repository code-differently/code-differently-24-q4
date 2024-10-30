package com.codedifferently.lesson17.library;

import java.util.List;

/** Represents a book in the library. */
public class Book {
  private String title;
  private String isbn;
  private List<String> authors;
  private int numPages;
  private boolean checkedOut;

  public Book(String title, String isbn, List<String> authors, int numPages) {
    this.title = title;
    this.isbn = isbn;
    this.authors = authors;
    this.numPages = numPages;
    this.checkedOut = false;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public int getNumPages() {
    return numPages;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  public boolean isCheckedOut() {
    return checkedOut;
  }

  public void setCheckedOut(boolean checkedOut) {
    this.checkedOut = checkedOut;
  }
}
