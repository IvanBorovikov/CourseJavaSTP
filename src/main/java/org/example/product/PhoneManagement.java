package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class PhoneManagement {
    public static List<Phone> phones = new ArrayList<>();

    public static void findPhonesByColor(String color){
        for (Phone p : phones){
            if (p.getBodyColor().equalsIgnoreCase(color)){
                p.show();
                System.out.println();
            }
        }
    }

    public static void findPhonesByBrandWithLargeScreen(String manufacturer, double diagonal){
        for (Phone p : phones){
            if (p.getManufacture().equalsIgnoreCase(manufacturer) && p.getScreenDiagonal() > diagonal){
                p.show();
                System.out.println();
            }
        }
    }

    public static void findPhonesWithBatteryCapacityGreaterThan(int battery){
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
