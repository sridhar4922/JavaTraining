package com.training.day3;


class Library{
    private Book [] books ;

    public Library(){
        this.books = new Book[5];
    }
    public void addBook(Book book){
        for (int i =0 ;i<books.length;i++){
            if(books[i]==null){
                books[i] = book;
                System.out.println("Books added successfully");
                return;
            }

        }
        System.out.println("Library is full");

    }
    public void replaceBook(int bookId, String newtitle, String newauthor) {
        for (Book book : books) {
            if (book != null && book.BookId() == bookId) {
                book.title();
                book.author();
                System.out.println("Book replaced successfully!");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null){
                System.out.println("BookID: " + book.BookId() +
                        ", Title: " + book.title() +
                        ", Author: " + book.author() +
                        ", Available: " + (book.isavailable() ? "Yes" : "No"));
            }
        }
    }

}
