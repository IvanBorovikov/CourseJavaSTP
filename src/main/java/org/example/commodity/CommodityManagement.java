package org.example.commodity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommodityManagement {
    public static List<Commodity> commodities = new ArrayList<>();

    public static void findProductsByName(String name){
        for (Commodity c : commodities){
            if (c.getName().equalsIgnoreCase(name)){
                c.show();
                System.out.println();
            }
        }
    }

    public static void findProductsByNameWithinBudget(String name, int price){
        for (Commodity c : commodities){
            if (c.getName().equalsIgnoreCase(name) && c.getPrice() < price){
                c.show();
                System.out.println();
            }
        }
    }

    public static void findProductsWithShelfLifeGreaterThan(LocalDate date){
        for (Commodity c : commodities){
            if (c.getShelfLife().getDayOfMonth() > date.getDayOfMonth()){
                c.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        commodities.add(new Commodity("Молоко пастеризованное 3.2%", "Первый Молочный Комбинат", 85.99, 1, LocalDate.of(2026, 1, 22), 245));
        commodities.add(new Commodity("Стиральный порошок автомат", "Tide", 649.99, 4.5, LocalDate.of(2028, 1, 12), 540));
        commodities.add(new Commodity("Хлеб", "АЮТИНСКОЕ", 34.99, 0.8, LocalDate.of(2026, 1, 10), 408));
    }
}
