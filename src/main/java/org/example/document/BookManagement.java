package org.example.document;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {

    public static List<Book> books = new ArrayList<>();

    public static void booksByTheAuthor(String author){
        for (Book b : books){
            if (b.getAuthor().equalsIgnoreCase(author)){
                String str = String.format("Книги по заданному автору: %s", b.getTitle());
                System.out.println(str);
            }
        }
    }

    public static void TheNumberOfPagesIsLess(int numberPages) {
        for (Book b : books) {
            if (b.getNumberOfPages() < numberPages) {
                String str = String.format("Книги с кол-вом страниц меньше заданного: %s", b.getTitle());
                System.out.println(str);

            }
        }
    }

    public static void BooksAfterAGivenYear(int year) {
        for (Book b : books) {
            if (b.getYearOfIssue() > year) {
                String str = String.format("Книги выпущенные после заданного года: %s", b.getTitle());
                System.out.println(str);

            }
        }
    }


    public static void main(String[] args) {
        books.add(new Book("Рэй Брэдбери", "Вино из одуванчиков", "Эксмо", 2025, 448));
        books.add(new Book("Рэй Брэдбери", "451 градус по Фаренгейту", "Эксмо", 1953, 320));
        books.add(new Book("Анджей Сапковский", "Ведьмак. Последнее желание", "АСТ", 1986, 416));
        books.add(new Book("Анджей Сапковский", "Ведьмак. Меч предназначения", "АСТ", 1992, 672));

        BooksAfterAGivenYear(1930);
    }

}
