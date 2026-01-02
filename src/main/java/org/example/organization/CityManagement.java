package org.example.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CityManagement {
    public static List<City> cities = new ArrayList<>();

    public static void getCitiesByMinPopulation(Long num){
        for (City c : cities){
            if (c.getNumberOfInhabitants() > num){
                String str = String.format("Город, с кол-ом жителей больше указанного: %s", c.getName() + " - " + c.getNumberOfInhabitants());
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public static void findByCity_BudgetGreaterThanAndCity_FoundationDateAfter(Long budget, int date){
        for (City c : cities){
            if (c.getBudget() > budget && c.getFoundationYear() > date){
                String str = String.format("Город, бюджет и год больше указанного: %s", c.getName() + " - " + c.getBudget());
                System.out.println(str);
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        cities.add(new City("Москва", 13274285L, 1147, "Собянин", 5000000000000L));
        cities.add(new City("Ростов-на-Дону", 1143123L, 1749, "Слюсарь ", 79000000000L));
        cities.add(new City("Воронеж", 1143123L, 1585, "Гусев ", 48000000000L));
    }
}
