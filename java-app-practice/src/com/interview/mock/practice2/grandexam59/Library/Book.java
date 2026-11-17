package com.interview.mock.practice2.grandexam59.Library;

public class Book {
    private  int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public  boolean isAvailable(){
        return available;
    }
    //issue book
    public void issueBook(){
        available = false;
    }
    //Return book
    public void returnBook(){
        available = true;
    }
    public void display(){
        System.out.println(
                "ID:"+bookId+" | Title:"+title+" |Author:"+author+" | Status:"+(available ? "Available":"Issued")
        );
    }
}
