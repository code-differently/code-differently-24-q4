package com.codedifferently.lesson16.chelseaogbonnia;

enum Genre {
  FICTION,
  NON_FICTION,
  MYSTERY,
  SCIENCE_FICTION,
  FANTASY,
  HORROR,
  ROMANCE,
  ADVENTURE,
  HISTORY,
  CRIME
}

enum BookType {
  HARDCOVER,
  PAPERBACK,
  MAGAZINE,
  NOVEL,
  POEM,
  COMICS
}

public class Book {
  private String title;
  private String author;
  private Genre genre;
  private BookType bookType;

  public Book(String title, String author, Genre genre, BookType bookType) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.bookType = bookType;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Genre getGenre() {
    return genre;
  }
  
  public BookType getBookType() {
    return bookType;
  }
}
