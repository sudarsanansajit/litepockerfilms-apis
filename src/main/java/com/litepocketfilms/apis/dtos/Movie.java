package com.litepocketfilms.apis.dtos;

import java.util.Objects;

public class Movie {
    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(getName(), movie.getName()) && Objects.equals(getGenre(), movie.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGenre());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    String name;
    String genre;
}
