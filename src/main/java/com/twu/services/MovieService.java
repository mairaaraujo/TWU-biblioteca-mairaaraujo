package com.twu.services;

import com.twu.inputAsker.InputAsker;
import com.twu.movies.Movie;
import com.twu.util.Util;

public class MovieService {

    private UserService userService;
    private static MovieService instance = new MovieService();

    public static MovieService getInstance(){
        return instance;
    }

    public MovieService() {
        this.userService = UserService.getInstance();
    }

    public void checkoutMovie(Movie movie) {
        movie.setAvailable(false);
        System.out.println(MovieServiceConstants.SUCCESSFUL_CHECKOUT);
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
            if(userService.login());
                checkoutMovie(Movie.movieList.get(bookId));
        }
    }


}
