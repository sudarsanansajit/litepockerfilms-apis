package com.litepocketfilms.apis.services.impl;

import com.litepocketfilms.apis.services.MoviesService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MoviesServiceImplTest {
    MoviesService moviesService;

    @BeforeEach
    void setUp() {
        moviesService = new MoviesServiceImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllMovies() {
        assertTrue(moviesService.getAllMovies().get(0).getName().equals("BHEETHI"));
       // assertEquals("BHEETHI", moviesService.getAllMovies().get(0).getName());
    }
}