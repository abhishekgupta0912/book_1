package main;

import java.util.Scanner;

class Book {
    private String bname, author, isbn;

    Book(String nam, String auth, String ISBN) {
        this.bname = nam;
        this.author = auth;
        this.isbn = ISBN;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String na) {
        this.bname = na;
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
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
            System.out.println("N/a");
        else {
            Book[] ob = new Book[n];
            for (int i = 0; i < n; i++) {
                ob[i] = new Book(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
        }
    }

}
