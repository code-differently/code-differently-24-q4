package com.codedifferently.lesson16.librarybook;

import java.util.ArrayList;
import java.util.List;

public class LibraryBook {

  public enum Genre {
    FICTION,
    NONFICTION,
    MYSTERY,
    SCIENCE,
    FANTASY
  }

  private String title;
  private String author;
  private Genre genre;
  private int publicationYear;
  private List<String> borrowersHistory;
  private boolean isCheckedOut;
  private List<String> newBorrowers = new ArrayList<>();

  public LibraryBook(String title, String author, Genre genre, int publicationYear) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publicationYear = publicationYear;
    this.borrowersHistory = new ArrayList<>();
    this.isCheckedOut = false;
    this.newBorrowers = newBorrowers;
  }

  public void checkOut(String borrower) throws OverdueException {
    if (isCheckedOut) {
      throw new OverdueException("Book is already checked out!");
    }
    this.isCheckedOut = true;
    borrowersHistory.add(borrower);
  }

  public void returnBook(boolean isOverdue) throws OverdueException {
    if (!isCheckedOut) {
      throw new OverdueException("Book was not checked out!");
    }
    if (isOverdue) {
      throw new OverdueException("Book is overdue!");
    }
    this.isCheckedOut = false;
  }

  public String displayBorrowerHistory() {
    StringBuilder history = new StringBuilder("Borrower History:\n");
    for (String borrower : borrowersHistory) {
      history.append("- ").append(borrower).append("\n");
    }
    return history.toString();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  public List<String> getBorrowersHistory() {
    return borrowersHistory;
  }

  public void setBorrowersHistory(List<String> borrowersHistory) {
    this.borrowersHistory = borrowersHistory;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  public void setCheckedOut(boolean isCheckedOut) {
    this.isCheckedOut = isCheckedOut;
  }

  public List<String> getNewBorrowers() {
    return newBorrowers;
  }

  public void setNewBorrowers(List<String> newBorrowers) {
    this.newBorrowers = newBorrowers;
  }

  public static class OverdueException extends Exception {
    public OverdueException(String message) {
      super(message);
    }
  }
}
