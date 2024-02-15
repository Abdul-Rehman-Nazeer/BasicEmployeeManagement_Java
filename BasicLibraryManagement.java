//        Write a Java class Book with following features:
//        • Instance variables:
//        o title for the title of book of type String.
//        o author for the author’s name of type String.
//        o price for the book price of type double.
//        • Constructor:
//        o public Book (String title, Author name, double price): A constructor
//        with parameters, it creates the Author object by setting the the fields
//        to the passed values.
//        • Instance methods:
//        o public void setTitle(String title): Used to set the title of book.
//        o public void setAuthor(String author): Used to set the name of author
//        of book.
//        o public void setPrice(double price): Used to set the price of book.
//        o public double getTitle(): This method returns the title of book.
//        o public double getAuthor(): This method returns the author’s name of
//        book.
//        o public String toString(): This method printed out book’s details to the
//        screen
//        Write a separate class BookDemo with a main () method creates a Book titled “Great
//        Expectations” with author Charles Dickens and price 79.75.

import java.util.Scanner;

public class BasicLibraryManagement {//BasicLibraryManagement==Bookdemo class
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //using scanner instead of hardcoding the title,author and price
        System.out.print("Enter the title of the book: ");
        String title = s.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = s.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = s.nextDouble();

        Book myBook = new Book(title, author, price);

        System.out.println("\nBook Details:");
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: $" + myBook.getPrice());

        System.out.print("\nUsing Setters to update the book information: ");
        System.out.print("\nEnter the new title of the book: ");
        s.nextLine();//consumeing the neew line char
        title = s.nextLine();
        myBook.setTitle(title);

        System.out.print("Enter the new author of the book: ");
        author = s.nextLine();
        myBook.setAuthor(author);

        System.out.print("Enter the new price of the book: ");
        price = s.nextDouble();
        myBook.setPrice(price);

        System.out.println("\nUpdated Book Details:");
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: $" + myBook.getPrice());

    }
}
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}