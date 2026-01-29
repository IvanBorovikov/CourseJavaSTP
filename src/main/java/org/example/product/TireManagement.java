package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class TireManagement {
    public static List<Tire> tires = new ArrayList<>();

    /*
    а) вывод списка покрышек указанного типа с ожидаемым пробегом выше указанного;
     */
    public static void findTiresByTypeWithMileageAbove(TireType type, int mileage){
        System.out.printf("Покрышки указанного типа с ожидаемым пробегом выше указанного: %s, %d\n", type.getType(), mileage);
        for (Tire t : tires){
            if (t.getTireType() == type && t.getExpectedMileage() > mileage){
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
            if (t.getNewOrBu() == TireCondition.NEW && t.getRadius() == radius){
                t.show();
                System.out.println();
            }
        }
    }

//    public static void main(String[] args) {
//        tires.add(new Tire("Michelin", TireType.SUMMER, 17, 85000, TireCondition.NEW));
//        tires.add(new Tire("Nokian", TireType.WINTER, 16, 15000, TireCondition.USED));
//        tires.add(new Tire("Cordiant", TireType.WINTER, 14, 50000, TireCondition.NEW));
//
//    }
}
