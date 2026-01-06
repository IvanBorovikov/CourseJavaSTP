package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class PhoneManagement {
    public static List<Phone> phones = new ArrayList<>();

    /*
    а) вывод списка телефонов с заданным цветом корпуса;
     */
    public static void findPhonesByColor(String color){
        System.out.printf("Телефоны с заданным цветом корпуса: %s\n", color);
        for (Phone p : phones){
            if (p.getBodyColor().equalsIgnoreCase(color)){
                p.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка телефонов заданного производителя с диагональю больше заданной;
     */
    public static void findPhonesByBrandWithLargeScreen(String manufacturer, double diagonal){
        System.out.printf("Телефоны заданного производителя с диагональю больше заданной: %s, %.2f\n", manufacturer,diagonal);
        for (Phone p : phones){
            if (p.getManufacture().equalsIgnoreCase(manufacturer) && p.getScreenDiagonal() > diagonal){
                p.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка телефонов с емкостью аккумулятора больше заданной.
     */
    public static void findPhonesWithBatteryCapacityGreaterThan(int battery){
        System.out.printf("Телефоны с емкостью аккумулятора больше заданной: %d\n", battery);
        for (Phone p : phones){
            if (p.getBatteryCapacity() > battery){
                p.show();
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        phones.add(new Phone("Apple", "iPhone 15 Pro Max", 512, "Титан чёрный", 6.7, 4422));
        phones.add(new Phone("Samsung", "Galaxy A54 5G", 128, "Лаймовый", 6.4, 5000));
        phones.add(new Phone("Google", "Pixel 7a", 128, "Угольно-серый", 6.1, 4300));
    }
}
