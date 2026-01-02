package org.example.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CountryManagement {
    public static List<Country> countries = new ArrayList<>();


    public static void findAncientCountries(int date){
        for (Country c : countries){
            if (c.getFoundationYear() < date){
                String str = String.format("Страна, основанная ранне указанного: %s", c.getName() + " - " + c.getFoundationYear());
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public static void getCountriesByMaxArea(Long territory){
        for (Country c : countries){
            if (c.getAreaOfTerritory() < territory){
                String str = String.format("Страна с площадью меньше указанного: %s", c.getName() + " - " + c.getAreaOfTerritory());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findPresidentLastNameByExactPopulation(Long count){
        for (Country c : countries){
            if (c.getNumberOfCitizens().equals(count)){
                String str = String.format("Президент страны с кол-ом граждан: %s", c.getLastNameOfPresident() + " - " + c.getNumberOfCitizens() + " млн.");
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        countries.add(new Country("Россия", 17151442L, 146119928L, 36000000000000000L, 862, "Путин"));
        countries.add(new Country("Франция", 551500L, 68605616L, 182508000L, 843, "Макрон"));

        findPresidentLastNameByExactPopulation(146119928L);
    }
}
