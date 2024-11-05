package com.codedifferently.lesson16.movie;

public class Movie {

  // member variables
  private String title;
  private int releaseYear;
  private double rating;
  private final Genres genres;
  private final MovieRating movieRating;

  // constructor
  public Movie(
      String title, int releaseYear, double rating, MovieRating movieRating, Genres genres) {
    this.title = title;
    this.releaseYear = releaseYear;
    this.rating = rating;
    this.movieRating = movieRating;
    this.genres = genres;
  }

  // getters and setters member functions

    public String getTitle() {
    return title;
  }

  public String setTitle() {
    return "Creed 2";
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public int setReleaseYear(int releaseYear) {
    return this.releaseYear = releaseYear;
  }

  public double getRating() {
    return rating;
  }

  public double setRating(double rating) {
    return this.rating = rating;
  }

  public Genres getGenres() {
    return genres;
  }

  public MovieRating getMovieRating() {
    return movieRating;
  }

  //Conditional
  if MovieRating =< 4 { 
 return "Title"; 
  } 
   

  }
}
