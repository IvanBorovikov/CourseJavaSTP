package org.example.commodity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommodityManagement {
    public static List<Commodity> commodities = new ArrayList<>();

    /*
    а) вывод списка товаров для заданного наименования;
     */
    public static void findProductsByName(String name){
        for (Commodity c : commodities){
            if (c.getName().equalsIgnoreCase(name)){
                c.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка товаров для заданного наименования, цена которых не превышает указанной;
     */
    public static void findProductsByNameWithinBudget(String name, double price){
        for (Commodity c : commodities){
            if (c.getName().equalsIgnoreCase(name) && c.getPrice() <= price){
                c.show();
                System.out.println();
            }
        }
    }

    /*
     в) вывод списка товаров, срок хранения которых больше заданного.
     */
    public static void findProductsWithShelfLifeGreaterThan(LocalDate date){
        for (Commodity c : commodities){
            if (c.getShelfLife().isAfter(date)){
                c.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        commodities.add(new Commodity("Молоко пастеризованное 3.2%", "Первый Молочный Комбинат", 85.99, 1, LocalDate.of(2026, 1, 22), 245));
        commodities.add(new Commodity("Стиральный порошок автомат", "Tide", 649.99, 4.5, LocalDate.of(2028, 1, 12), 540));
        commodities.add(new Commodity("Хлеб", "АЮТИНСКОЕ", 34.99, 0.8, LocalDate.of(2026, 1, 10), 408));
        commodities.add(new Commodity("Хлеб", "ВОЛНА", 33.99, 0.8, LocalDate.of(2026, 2, 10), 389));
        // findProductsByNameWithinBudget("хлеб", 34.98);
    }
}
