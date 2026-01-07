package org.example.page;

import java.util.ArrayList;
import java.util.List;

public class PageManagement {
    public static List<Page> pages = new ArrayList<>();

    /*
    а) вывод списка страниц, содержащих количество букв больше заданного;
     */
    public static void findPagesWithLetterCountGreaterThan(int letters){
        System.out.printf("Страницы, содержащих количество букв больше заданного: %d\n", letters);
        for (Page p : pages){
            if (p.getNumberOfLetters() > letters){
                p.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка номеров страниц и количеств согласных букв на них;
     */
    public static void getPageSummaryStatistics(){
        for (Page p : pages){
            System.out.println("Номер страницы: " + p.getPageNumber());
            System.out.println("Кол-во гласных: " + p.getNumberOfVowels());
            System.out.println("---------------------------");
        }
    }

    /*
    в) вывод среднего количества букв на странице.
     */
    public static void calculateAverageLetterCountPerPage(){
        int total = 0;
        for (Page p : pages){
            total += p.getNumberOfLetters();
        }
        System.out.println("Среднее кол-во букв на странице: " + total / pages.size());
    }

    public static void main(String[] args) {
        pages.add(new Page(3850, 1620, 12, 8, 1, 48));
        pages.add(new Page(320, 135, 18, 3, 2, 12));
        pages.add(new Page(1150, 500, 14, 5, 3, 32));
        getPageSummaryStatistics();
    }
}
