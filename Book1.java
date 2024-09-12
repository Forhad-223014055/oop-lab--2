/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.book1;

/**
 *
 * @author DELL
 */
public class Book1 {

    private static int totalBooks = 0;
    private static String genre = "Fiction";

   
    private String title;
    private String author;
    private int year;

   
    public Book1(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }

    
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
    public static void main(String[] args) {
        
        Book1 book1 = new Book1("To Kill a Mockingbird", "Harper Lee", 1960);
        Book1 book2 = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book1 book3 = new Book1("Pride and Prejudice", "Jane Austen", 1813);

        
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        book3.displayBookDetails();

        
        Book1.displayTotalBooks();
    }
}
