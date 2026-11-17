package com.interview.mock.practice2.grandexam59.Library;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;
        do{
            System.out.println("\n MINI LIBARAY MANAGEMENT SYSTEM");
            System.out.println("1.Add Book");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Search Book");
            System.out.println("5.Display Available Books");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice){
                    case 1:
                        System.out.print("Enter Book id:");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter book title:");
                        String title = sc.nextLine();
                        System.out.print("Enter Author name:");
                        String author = sc.nextLine();
                        if(id<=0 || title.trim().isEmpty() || author.trim().isEmpty()){
                            System.out.println("Inavlid book details");
                        }else {
                            library.addBook(id, title, author);
                        }
                        break;
                    case 2:
                        System.out.print("Enter book ID to issue:");
                        int issued = Integer.parseInt(sc.nextLine());
                        library.issueBook(issued);
                        break;
                    case 3:
                        System.out.println("Enter book id to return:");
                        int returnId = Integer.parseInt(sc.nextLine());
                        library.returnBook(returnId);
                        break;
                    case 4:
                        System.out.print("Enter title or author:");
                        String keyword = sc.nextLine();
                        library.searchBook(keyword);
                        break;
                    case 5:
                        System.out.println("\nAvailable Books");
                        library.displayAvailbaleBooks();
                        break;
                    case 6:
                        System.out.println("Thank you for using libray system");
                        break;
                    default:
                        System.out.println("Invalid choice try again");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input ! , please enter the numbers only");
                choice = 0;
            }
        }while (choice != 6);
        sc.close();
    }
}
