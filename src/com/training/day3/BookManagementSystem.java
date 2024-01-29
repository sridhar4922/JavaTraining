package com.training.day3;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    System.out.print("Enter Title: ");
                    String title = scanner.next();
                    System.out.print("Enter Author: ");
                    String author = scanner.next();
                    Book newBook = new Book(bookID ,title ,author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to replace: ");
                    int replaceBookID = scanner.nextInt();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.next();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.next();
                    library.replaceBook(replaceBookID, newTitle, newAuthor);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
