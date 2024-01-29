package com.training.day3;

public class Book {
    private int bookId;
    private String title;
    private String author;

    private boolean isavailable;

    public Book (int bookId , String title,String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isavailable = true;
    }


    public int BookId() {
        return bookId;
    }
    public String title(){
        return title;
    }
    public String author(){
        return author;
    }
    public boolean isavailable(){
        return isavailable;
    }
    public void setavailable(boolean available){
        isavailable = available;
    }

}
