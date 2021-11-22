package OOP.lab;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Book[] listOfBooks = new Book[10];
        int numberOfBooks = 0;
        //Book a = new Book("HP", 100.12);
        Scanner sc = new Scanner(System.in);

        while (true){
            //to add book, input "add"
            //to quit program, input "q"
            //to print all books, input "print"
            System.out.print("Input your choice: ");
            String choice = sc.next();
            if(choice.equals("add")){
                Book newBook = inputBook();
                listOfBooks[numberOfBooks] = newBook;
                numberOfBooks++;
                System.out.println("Book has been added!");
            }
            else if (choice.equals("q")){
                System.out.println("Exiting program...");
                break;
            }
            else if (choice.equals("print")){
                for(int i = 0; i < numberOfBooks; i++){
                    Book bk = listOfBooks[i];
                    System.out.println(bk.getName());
                }
            }
            else{
                System.out.println("You have entered an invalid choice!");
            }
        }

    }

    public static Book inputBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        sc.useDelimiter("\n");
        String bookName = sc.next();
        System.out.print("Enter Book Price: ");
        double bookPrice = sc.nextDouble();
        Book newBook = new Book(bookName, bookPrice);
        return newBook;
    }
}
