package com.practice.movieandproduct.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie {
    private String title;
    private String mpa; // R, PG-13, PG,
    private String genre;
    private double rating;

    public Movie(String title, String mpa, String genre, double rating) {
        this.title = title;
        this.mpa = mpa;
        this.genre = genre;
        this.rating = rating;
    }

}