package org.example;
//Create the Book subclass (complete with page counts)//

import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryItem{
    int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }
//    public List<Book> book = new ArrayList<>();
//    void createBook (String title, String author, int year, int pageCount){
////        Book book = new Book();
//        book.add(new Book(title, author, year, pageCount));
//        createBook();
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                ", book=" + book +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                "year=" + year +
//                ", pageCount=" + pageCount +
//                '}';
//    }

    public void readBook (){
        readBooks();
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
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
