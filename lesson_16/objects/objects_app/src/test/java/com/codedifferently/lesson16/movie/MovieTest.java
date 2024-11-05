package com.codedifferently.lesson16.movie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTest {
  Movie movie;

  @BeforeEach
  public void setUp() {
    movie = new Movie("Creed", 2015, 7.6, MovieRating.PG_13, Genres.ACTION);
  }

  @Test
  void testGetMovieTitle() {
    // act
    String title = movie.getTitle();
    // assert
    assertEquals("Creed", title);
  }

  @Test
  void testSetMovieTitle() {
    // arrange
    // act
    String title = movie.setTitle();
    // assert
    assertEquals("Creed 2", title);
  }

  @Test
  void testGetReleaseYear() {
    int releaseYear = movie.getReleaseYear();
    assertEquals(2015, 2015);
  }

  @Test
  void testSetReleaseYear() {
    int releaseYear = movie.setReleaseYear(2018);
    assertEquals(movie.getReleaseYear(), 2018);
  }

  @Test
  void testGetRating() {
    double rating = movie.getRating();
    assertEquals(movie.getRating(), 7.6);
  }

  @Test
  void testGetGenres() {
    assertEquals(Genres.ACTION, movie.getGenres());
  }
}
