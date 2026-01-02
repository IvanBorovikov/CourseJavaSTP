package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class RocketManagement {
    public static List<Rocket> rockets = new ArrayList<>();

    public static void findRocketsByArmament(int countWarheads, int warheadPower){
        for (Rocket r : rockets){
            if (r.getNumberOfWarheads() == countWarheads && r.getWarheadPower() == warheadPower){
                r.show();
                System.out.println();
            }
        }
    }

    public static void findRocketsByManufacturer(String manufacturer){
        for (Rocket r : rockets){
            if (r.getManufacture().equalsIgnoreCase(manufacturer)){
                r.show();
                System.out.println();
            }
        }
    }

    public static void findRocketsWithRangeGreaterThan(int range){
        for (Rocket r : rockets){
            if (r.getRange() > range){
                r.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        rockets.add(new Rocket("Государственный ракетный центр «Южный»", 2500, 11000, 200, 10, 550));
        rockets.add(new Rocket("КБ «Точность»", 800, 2500, 30, 1, 120));
        rockets.add(new Rocket("Завод «Молния»", 150, 120, 10, 1, 50));
    }
}
