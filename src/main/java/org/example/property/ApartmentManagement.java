package org.example.property;

import java.util.ArrayList;
import java.util.List;

public class ApartmentManagement {
    public static List<Apartment> apartments = new ArrayList<>();

    public static void findApartmentsByRoomCount(int rooms){
        for (Apartment a : apartments){
            if (a.getNumberOfRooms() == rooms){
                a.show();
                System.out.println();
            }
        }
    }

    public static void findApartmentsByOwnerLastName(String owner){
        for (Apartment a : apartments){
            if (a.getOwnerLastName().equalsIgnoreCase(owner)){
                a.show();
                System.out.println();
            }
        }
    }

    public static void calculateAverageRoomAreaForApartment(int apartment){
        double total;
        for (Apartment a : apartments){
            if (a.getApartmentNumber() == apartment){
                total = (a.getTotalArea() + a.getLivingArea()) / 2;
                System.out.println("Номер квартиры: " + a.getApartmentNumber());
                System.out.println("Средняя площадь: " + total);
            }

        }
    }

    public static void main(String[] args) {
        apartments.add(new Apartment(85, 9, 2, 58.7, 34.2, "Иванов"));
        apartments.add(new Apartment(401, 4, 3, 112.5, 78.9, "Смирнова"));
        apartments.add(new Apartment(12, 1, 1, 32.4, 27.5, "Петров"));

        calculateAverageRoomAreaForApartment(85);
    }
}
