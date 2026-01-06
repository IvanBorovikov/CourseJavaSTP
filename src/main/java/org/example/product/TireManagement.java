package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class TireManagement {
    public static List<Tire> tires = new ArrayList<>();

    /*
    а) вывод списка покрышек указанного типа с ожидаемым пробегом выше указанного;
     */
    public static void findTiresByTypeWithMileageAbove(boolean type, int mileage){
        System.out.printf("Покрышки указанного типа с ожидаемым пробегом выше указанного: %b, %d\n", type, mileage);
        for (Tire t : tires){
            if (t.isTireType() == type && t.getExpectedMileage() > mileage){
                t.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка новых покрышек нужного радиуса.
     */
    public static void findNewTiresByRadius(int radius){
        System.out.printf("Новые покрышки нужного радиуса: %d\n", radius);
        for (Tire t : tires){
            boolean found = true;
            if (t.isTireType() == found && t.getRadius() == radius){
                t.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        tires.add(new Tire("Michelin", true, 17, 85000, true));
        tires.add(new Tire("Nokian", false, 16, 15000, false));
        tires.add(new Tire("Cordiant", true, 14, 50000, true));
        findTiresByTypeWithMileageAbove(false, 10000);
    }
}
