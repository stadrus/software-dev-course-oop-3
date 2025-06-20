package org.example;
//Create the Movie subclass (complete with duration) //
public class Movie extends LibraryItem{
    int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
