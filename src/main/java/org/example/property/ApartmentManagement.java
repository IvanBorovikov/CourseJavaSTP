package org.example.property;

import java.util.ArrayList;
import java.util.List;

public class ApartmentManagement {
    public static List<Apartment> apartments = new ArrayList<>();

    /*
    а) вывод списка квартир, имеющих заданное число комнат;
     */
    public static void findApartmentsByRoomCount(int rooms){
        System.out.printf("Квартиры имеющие заданное число комнат: %d\n", rooms);
        for (Apartment a : apartments){
            if (a.getNumberOfRooms() == rooms){
                a.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка квартир, принадлежащих заданному владельцу;
     */
    public static void findApartmentsByOwnerLastName(String owner){
        System.out.printf("Квартиры принадлежащие заданному владельцу: %s\n", owner);
        for (Apartment a : apartments){
            if (a.getOwnerLastName().equalsIgnoreCase(owner)){
                a.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод средней площади комнату квартиры с указанным номером.
     */
    public static void calculateAverageRoomAreaForApartment(int apartment){
        System.out.printf("Средняя площадь комнаты квартиры с указанным номером: %d\n", apartment);
        double total;
        for (Apartment a : apartments){
            if (a.getApartmentNumber() == apartment){
                total = a.getLivingArea() / a.getNumberOfRooms();
                System.out.println("Средняя площадь комнаты: " + total);
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
