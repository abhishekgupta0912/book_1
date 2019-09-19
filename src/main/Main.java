package main;

import java.util.Scanner;

class Book {
    private String b_name, author, isbn;

    Book(String nam, String auth, String ISBN) {
        this.b_name = nam;
        this.author = auth;
        this.isbn = ISBN;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "-----------------------------\nBook Name:    " + b_name + "\nAuthor Name:    " + author + "\nISBN:    " + isbn + "\n-----------------------------";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] ob = new Book[n];
        if (n == 0)
            System.out.println("N/A");
        else {
            for (int i = 0; i < n; i++) {
                String v = sc.nextLine().trim();
                String nam1 = sc.nextLine().trim();
                String auth1 = sc.nextLine().trim();
                String isbn1 = sc.nextLine().trim();
                ob[i] = new Book(nam1, auth1, isbn1);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ob[i].toString());
            }
        }
    }

}