package org.example.document;

import java.time.Year;

public class Book  {
    private String title;
    private String author;
    private String publisher;
    private int yearOfIssue;
    private int numberOfPages;

    public Book(){

    }

    public Book(Book b){
        this.title = b.title;
        this.author = b.author;
        this.publisher = b.publisher;
        this.yearOfIssue = b.yearOfIssue;
        this.numberOfPages = b.numberOfPages;
    }

    public Book(String author, String title, String publisher, int yearOfIssue, int numberOfPages){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfIssue = yearOfIssue;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void show(){
        System.out.println("Автор: " + author);
        System.out.println("Название: " + title);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год выпуска: " + yearOfIssue);
        System.out.println("Кол-во страниц: " + numberOfPages);
    }
}
