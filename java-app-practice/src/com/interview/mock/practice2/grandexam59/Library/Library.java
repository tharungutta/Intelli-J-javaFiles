package com.interview.mock.practice2.grandexam59.Library;

import java.util.HashMap;

public class Library {
    // HashMap to store books
    private HashMap<Integer, Book> books = new HashMap<>();

    // add a book
    public void addBook(int id, String title, String author){
        if(books.containsKey(id)){
            System.out.println("Book Id already exists!");
            return;
        }
        Book book = new Book(id, title, author);
        books.put(id,book);
        System.out.println("Book added successfully");
    }

    // issue a book
    public void issueBook(int id){
        Book book = books.get(id);
        if(book == null){
            System.out.println("Book not found");
        } else if (!book.isAvailable()) {
            System.out.println("Book is already issued");
        }else {
            book.issueBook();
            System.out.println("Book issued successfully");
        }
    }

    // Return a book
    public void returnBook(int id){
        Book book = books.get(id);
        if(book == null){
            System.out.println("Book not found");
        } else if (book.isAvailable()) {
            System.out.println("Book is already available");
        }else {
            book.returnBook();
            System.out.println("Book returned successfully");
        }
    }

    // Search Book by title or author

    public void searchBook(String keyword){
        boolean found = false;
        for(Book book: books.values()){
            if(book.getTitle().toLowerCase()
                    .contains(keyword.toLowerCase()) ||
               book.getAuthor().toLowerCase()
                       .contains(keyword.toLowerCase())
            ){
                book.display();
                found = true;
            }
        }
        if(!found){
            System.out.println("No matching books found");
        }
    }

    // Display available books
    public void displayAvailbaleBooks(){
        boolean found = false;
        for (Book book: books.values()){
            if(book.isAvailable()){
                book.display();
                found = true;
            }
        }
        if(!found){
            System.out.println("No books are currently available");
        }
    }

}
