package com.twu.services;

import com.twu.inputAsker.InputAsker;
import com.twu.movies.Movie;
import com.twu.util.Util;

public class MovieService {

    UserService userService;

    public void checkoutMovie(Movie movie) {
        movie.setAvailable(false);
    }

    public void printMovieList(){

        System.out.println(MovieServiceConstants.MOVIE_LIST_HEAD);
        for (String id: Movie.movieList.keySet()) {
            System.out.println(Movie.movieList.get(id).getDetails());
        }
    }

    public void askOption(InputAsker inputAsker){
        inputAsker.ask(MovieServiceConstants.SUBMENU_MOVIE_LIST);
        String answer = inputAsker.getAnswer();

        processAction(Util.getAction(answer), Util.getBookId(answer));
    }

    public void processAction(String action, String bookId) {

        if(MovieServiceConstants.CHECKOUT_MOVIE.equals(action.trim().toLowerCase())){
            checkoutMovie(Movie.movieList.get(bookId));
        }
    }


}
