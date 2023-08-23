package com.litepocketfilms.apis.services.impl;

import com.litepocketfilms.apis.dtos.Movie;
import com.litepocketfilms.apis.services.MoviesService;

import java.util.ArrayList;
import java.util.List;

public class MoviesServiceImpl implements MoviesService {
    @Override
    public List<Movie> getAllMovies() {
        Movie movie = new Movie("BHEETHI", "THRILLER");
        ArrayList<Movie> movielist = new ArrayList<Movie>();
        movielist.add(movie);
        return movielist;
    }
}
