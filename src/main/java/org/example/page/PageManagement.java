package org.example.page;

import java.util.ArrayList;
import java.util.List;

public class PageManagement {
    public static List<Page> pages = new ArrayList<>();

    public static void findPagesWithLetterCountGreaterThan(int letters){
        for (Page p : pages){
            if (p.getNumberOfLetters() > letters){
                p.show();
                System.out.println();
            }
        }
    }

    public static void getPageSummaryStatistics(int page){
        for (Page p : pages){
            if (p.getPageNumber() == page){
                System.out.println("Номер страницы" + p.getPageNumber());
                System.out.println("Кол-во гласных" + p.getNumberOfVowels());
            }
        }
    }

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
        calculateAverageLetterCountPerPage();
    }
}
