package org.example;

public abstract class LibraryItem extends Main{
    String title;
    String author;
    int year;
    private int count;

//    public LibraryItem(){
//        this.title = title;
//        this.author= author;
//        this.year= year;
//        this.count = 0;
//    }
    public LibraryItem(String title, String author, int year) {
        super();
    }

    public void increment(){
        count++;
    }
    public void decrement(){
        if(count > 0){
            count --;
        }
    }
    public int getCount(){
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
