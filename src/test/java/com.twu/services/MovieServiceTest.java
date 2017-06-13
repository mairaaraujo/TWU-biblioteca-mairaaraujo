package com.twu.services;

import com.twu.movies.Movie;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceTest {

    @Mock
    Movie movie;

    @InjectMocks
    MovieService movieService;

    @Test
    public void checkoutMovie() throws Exception {

        movieService.checkoutMovie(movie);

        Assert.assertFalse(movie.isAvailable());
    }
}
