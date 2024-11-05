package com.codedifferently.lesson16.movie;

import java.util.ArrayList;

public class Movie {

  // member variables
  private String title;
  private int releaseYear;
  private double rating;
  private final Genres genres;
  private final MovieRating movieRating;
  private ArrayList<String> actors;

  // constructor
  public Movie(
      String title, int releaseYear, double rating, MovieRating movieRating, Genres genres) {
    this.title = title;
    this.releaseYear = releaseYear;
    this.rating = rating;
    this.movieRating = movieRating;
    this.genres = genres;
    this.actors = new ArrayList<String>();
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

  // Conditional
  public String goodRating() {
    if (rating >= 7.0) {
      return "The movie is not good";
    } else {
      return "The movie is satisfactory";
    }
  }

  public void addActor(String actor) {
    actors.add(actor);
  }

  public String getActors() throws actorNotAvailableException {
    if (actors.isEmpty()) {
      throw new actorNotAvailableException("actors not available");
    }
    String names = "";
    for (String actor : actors) {
      names += actor + ",";
    }
    return names;
  }
}

class actorNotAvailableException extends Exception {
  public actorNotAvailableException(String message) {
    super(message);
  }
}
