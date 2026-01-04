package org.example.document;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {

    public static List<Book> books = new ArrayList<>();

    /*
    а) вывод списк книг заданного автора;
     */
    public static void listBooksByTheAuthor(String author){
        String str = String.format("Книги по заданному автору: %s", author);
        System.out.println(str);
        for (Book b : books){
            if (b.getAuthor().equalsIgnoreCase(author)){
                b.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка книг, с количеством страниц меньше заданного;
     */
    public static void listBooksWithNumberOfPagesIsLess(int numberPages) {
        String str = String.format("Книги с кол-вом страниц меньше заданного: %d", numberPages);
        System.out.println(str);
        for (Book b : books) {
            if (b.getNumberOfPages() < numberPages) {
                b.show();
                System.out.println();
            }
        }
    }

    /*
    в) список книг, выпущенных после заданного года.
     */
    public static void listBooksAfterYear(int year) {
        String str = String.format("Книги выпущенные после заданного года: %s", year);
        System.out.println(str);
        for (Book b : books) {
            if (b.getYearOfIssue() > year) {
                b.show();
                System.out.println();

            }
        }
    }


    public static void main(String[] args) {
        books.add(new Book("Рэй Брэдбери", "Вино из одуванчиков", "Эксмо", 2025, 448));
        books.add(new Book("Рэй Брэдбери", "451 градус по Фаренгейту", "Эксмо", 1953, 320));
        books.add(new Book("Анджей Сапковский", "Ведьмак. Последнее желание", "АСТ", 1986, 416));
        books.add(new Book("Анджей Сапковский", "Ведьмак. Меч предназначения", "АСТ", 1992, 672));
        //listBooksByTheAuthor("Рэй Брэдбери");
        //listBooksWithNumberOfPagesIsLess(400);
        listBooksAfterYear(1990);
    }

}
