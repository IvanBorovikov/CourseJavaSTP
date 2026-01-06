package org.example.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CountryManagement {
    public static List<Country> countries = new ArrayList<>();

    /*
    а) вывод списка стран, основанных ранее указанного года;
     */
    public static void findAncientCountries(LocalDate date){
        System.out.println("Страна, основанная ранне указанного: ");
        for (Country c : countries){
            if (!c.getFoundationYear().isAfter(date)){
                c.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка стран, с площадью меньше указанной;
     */
    public static void getCountriesByMaxArea(Long territory){
        System.out.printf("Страны с площадью меньше указанного: %d\n", territory);
        for (Country c : countries){
            if (c.getAreaOfTerritory() < territory){
                c.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод фамилии президента страны с указанным количеством граждан.
     */
    public static void findPresidentLastNameByExactPopulation(Long count){
        System.out.printf("Президент страны с указанным кол-ом граждан: %d", count);
        for (Country c : countries){
            if (c.getNumberOfCitizens().equals(count)){
                System.out.printf("Президент страны с кол-ом граждан: %s", c.getLastNameOfPresident() + " - " + c.getNumberOfCitizens() + " млн.");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        countries.add(new Country("Россия", 17151442L, 146119928L, 36000000000000000L, LocalDate.of(862, 1, 1), "Путин"));
        countries.add(new Country("Франция", 551500L, 68605616L, 182508000L, LocalDate.of(843, 2, 2), "Макрон"));

        findPresidentLastNameByExactPopulation(146119928L);
    }
}
