package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class WagonManagement {
    public static List<Wagon> wagons = new ArrayList<>();

    public static void findCarsInServiceLongerThan(int period){
        for (Wagon w : wagons){
            if (w.getOperationPeriod() > period){
                w.show();
                System.out.println();
            }
        }
    }

    public static void findCarsByConductorLastName(String lastName){
        for (Wagon w : wagons){
            if (w.getConductorName().equalsIgnoreCase(lastName)){
                w.show();
                System.out.println();
            }
        }
    }

    public static void findCarsWithAirConditioning(){
        boolean found = true;
        for (Wagon w : wagons){
            if (w.isConditioner() == found){
                w.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        wagons.add(new Wagon("Купейный", "09", 18, "Волкова", "002H", true, 7));
        wagons.add(new Wagon("Плацкартный", "07", 54, "Иванов", "016A", false, 22));
        wagons.add(new Wagon("Вагон-ресторан", "P-01", 48, "Петров", "002H", true, 15));
        findCarsWithAirConditioning();
    }
}
