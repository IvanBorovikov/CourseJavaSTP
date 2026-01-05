package org.example.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CityManagement {
    public static List<City> cities = new ArrayList<>();

    /*
    а) вывод списка городов, с количеством жителей больше указанной;
     */
    public static void getCitiesByMinPopulation(Long num){
        System.out.printf("Город, с кол-ом жителей больше указанного: %d\n", num);
        for (City c : cities){
            if (c.getNumberOfInhabitants() > num){
                c.show();
                System.out.println();
            }
        }

    }

    /*
    б) вывод списка губернаторов города под управлением которых имеют бюджет больше указанного и основаны позже указанной даты.
     */
    public static void findByCity_BudgetGreaterThanAndCity_FoundationDateAfter(Long budget, LocalDate date){
        System.out.println("Губернаторы города под управлением которых имеют бюджет больше указанного: " + budget + "\n И основаны позже указанной даты: " + date);
        for (City c : cities){
            if (c.getBudget() > budget && c.getFoundationYear().isAfter(date)){
                c.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        cities.add(new City("Москва", 13274285L, LocalDate.of(1147, 1, 2), "Собянин", 5000000000000L));
        cities.add(new City("Ростов-на-Дону", 1143123L, LocalDate.of(1749, 2, 1), "Слюсарь ", 79000000000L));
        cities.add(new City("Воронеж", 1143123L, LocalDate.of(1585, 3, 4), "Гусев ", 48000000000L));
    }
}
