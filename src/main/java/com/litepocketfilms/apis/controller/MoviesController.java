package com.litepocketfilms.apis.controller;

import com.litepocketfilms.apis.dtos.Movie;
import com.litepocketfilms.apis.services.MoviesService;
import com.litepocketfilms.apis.services.impl.MoviesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MoviesController {

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        MoviesService moviesService = new MoviesServiceImpl();
        return moviesService.getAllMovies();
    }
}
