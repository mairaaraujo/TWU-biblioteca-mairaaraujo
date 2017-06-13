package com.twu.movies;


import java.util.HashMap;

public class Movie {

    String name;
    String director;
    int year;
    String rating;
    boolean isAvailable;

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getDetails(){
        return this.getName() + " || " + " Director: " + this.getDirector() + " || " + " Year:  " + String.valueOf(this.getYear())
            + " || " + " Rating: " + this.getRating();
    }

    public Movie(String name, String director, int year, String rating, boolean isAvailable) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public Movie() {
    }

    public static final HashMap<String, Movie> movieList = new HashMap<String, Movie>(){{
        put("01", new Movie("Black swan", "Darren Aronofsky", 2010, "10", true));
        put("02", new Movie("Wonder Woman", "Patty Jenkins", 2017, "8", true));
        put("03", new Movie("A clockwork orange", "Stanley Kubrick", 1971, "9", true));
        put("04", new Movie("Que horas ela volta?", "Anna Muylaert", 2015, "10", true));
        put("05", new Movie("I origins", "Mike Cahill", 2015, "9", true));

    }};

}
