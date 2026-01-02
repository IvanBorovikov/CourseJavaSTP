package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class TireManagement {
    public static List<Tire> tires = new ArrayList<>();

    public static void findTiresByTypeWithMileageAbove(boolean type, int mileage){
        for (Tire t : tires){
            if (t.isTireType() == type && t.getExpectedMileage() > mileage){
                t.show();
                System.out.println();
            }
        }
    }

    public static void findNewTiresByRadius(int radius){
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
    }
}
