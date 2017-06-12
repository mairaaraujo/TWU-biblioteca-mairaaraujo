package com.twu.books;

import java.util.HashMap;


public class Book {

    private String id;
    private String name;
    private int publishedYear;
    private String authorName;
    private boolean isAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDetails() {
        return "ID: " + this.getId() + " || " + this.getName() + " || Author: " + this.getAuthorName() + " || Publishing year: " + String.valueOf(this.getPublishedYear());
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public Book(){}

    public Book(String id, String name, String authorName, int publishedYear, boolean isAvailable){
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.isAvailable = isAvailable;
    }

    public static final HashMap<String, Book> bookList = new  HashMap<String, Book>(){{
        put("01", new Book("01", "1984", "George Orwell",1949, true));
        put("02", new Book("02", "Half of a yellow sun", "Chimamanda Ngozi Adichie", 2006, true));
        put("03", new Book("03", "Clockwork orange", "Anthony Burgess", 1962, true));
        put("04", new Book("04", "Brave new world", "Aldous Huxley", 1932, true));
        put("05", new Book("05", "Wonder", "R.J. Palacio", 2012, true));
        put("06", new Book("06", "The Goldfinch", "Donna Tartt", 2013, true));
        put("07", new Book("07", "To kill a mockingbird", "Harper Lee", 1960, true));
    }};


}
