package org.example;
//Create the Album subclass (complete with track counts) //
public class Album extends LibraryItem {
   int trackCount;

   public Album(String title, String author, int year, int trackCount){
      super(title, author, year);
      this.trackCount = trackCount;
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
    public int getTrackCount() {
        return trackCount;
    }
}

