package com.codedifferently.lesson17.library;

import java.util.ArrayList;
import java.util.List;

/** Represents a library with books and patrons. */
public class Library {
  private List<Book> marvelComics;
  private List<Patron> patrons;

  public Library() {
    this.marvelComics = new ArrayList<>();
    this.patrons = new ArrayList<>();
  }

  public void addComic(Book comic) {
    marvelComics.add(comic);
  }

  public void removeComic(Book comic) {
    marvelComics.remove(comic);
  }

  public void registerPatron(Patron patron) {
    patrons.add(patron);
  }

  public void checkOutComic(Book comic, Patron patron) {
    if (marvelComics.contains(comic) && patrons.contains(patron)) {
      patron.checkOutBook(comic);
    } else {
      System.out.println("Marvel comic or patron not found in the library.");
    }
  }

  public void returnComic(Book comic, Patron patron) {
    if (marvelComics.contains(comic) && patrons.contains(patron)) {
      patron.returnBook(comic);
    } else {
      System.out.println("Marvel comic or patron not found in the library.");
    }
  }

  public List<Book> getMarvelComics() {
    return marvelComics;
  }

  public void setMarvelComics(List<Book> marvelComics) {
    this.marvelComics = marvelComics;
  }

  public List<Patron> getPatrons() {
    return patrons;
  }

  public void setPatrons(List<Patron> patrons) {
    this.patrons = patrons;
  }
}
