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


/*
Output:

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice: 1
Enter Book ID: 123
Enter Title: harry
Enter Author: potter
Books added successfully

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice: 1
Enter Book ID: 345
Enter Title: potter
Enter Author: hatty
Books added successfully

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice: 3
Books in the library:
BookID: 123, Title: harry, Author: potter, Available: Yes
BookID: 345, Title: potter, Author: hatty, Available: Yes

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice: 2
Enter Book ID to replace: 345
Enter new Title: demon
Enter new Author: king
Book replaced successfully!

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice: 3
Books in the library:
BookID: 123, Title: harry, Author: potter, Available: Yes
BookID: 345, Title: potter, Author: hatty, Available: Yes

Library Management System
1. Add Book
2. Replace Book
3. Display Books
4. Exit
Enter your choice:
 */
