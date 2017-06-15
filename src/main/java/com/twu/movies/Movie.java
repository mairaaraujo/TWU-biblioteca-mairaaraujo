package com.twu.movies;


import java.util.HashMap;

public class Movie {

    String id;
    String name;
    String director;
    int year;
    String rating;
    boolean isAvailable;

    public String getId() {
        return id;
    }

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
        return "ID: " + this.getId() + " || " +  this.getName() + " || " + " Director: " + this.getDirector() + " || " + " Year:  " + String.valueOf(this.getYear())
            + " || " + " Rating: " + this.getRating();
    }

    public Movie(String id, String name, String director, int year, String rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public Movie() {
    }

    public static final HashMap<String, Movie> movieList = new HashMap<String, Movie>(){{
        put("01", new Movie("01", "Black swan", "Darren Aronofsky", 2010, "10", true));
        put("02", new Movie("02","Wonder Woman", "Patty Jenkins", 2017, "8", true));
        put("03", new Movie("03","A clockwork orange", "Stanley Kubrick", 1971, "9", true));
        put("04", new Movie("04","Que horas ela volta?", "Anna Muylaert", 2015, "10", true));
        put("05", new Movie("05","I origins", "Mike Cahill", 2015, "9", true));

    }};

}
