package com.twu.books;

import java.util.ArrayList;

/**
 * Created by mairaaraujo on 06/06/17.
 */
public class Book {

    private String name;
    private int publishedYear;
    private String authorName;

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

    public Book(){}

    public Book(String name, String authorName, int publishedYear){
        this.name = name;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
    }

    public static final ArrayList<Book> bookList = new ArrayList<Book>(){{

        bookList.add(new Book("1984", "George Orwell",1949));
        bookList.add(new Book("Half of a yellow sun", "Chimamanda Ngozi Adichie", 2006));
        bookList.add(new Book("Clockwork orange", "Anthony Burgess", 1962));
        bookList.add(new Book("Brave new world", "Aldous Huxley", 1932));
        bookList.add(new Book("Wonder", "R.J. Palacio", 2012));
        bookList.add(new Book("The Goldfinch", "Donna Tartt", 2013));
        bookList.add(new Book("To kill a mockingbird", "Harper Lee", 1960));
    }};
}
