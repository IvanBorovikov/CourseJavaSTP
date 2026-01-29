package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class RocketManagement {
    public static List<Rocket> rockets = new ArrayList<>();

    /*
    а) вывод списка ракет, с заданным количеством боеголовок и их количеством;
     */
    public static void findRocketsByArmament(int countWarheads){
        System.out.printf("Ракеты с заданным количеством боеголовок и их количеством: %d\n", countWarheads);
        for (Rocket r : rockets){
            if (r.getNumberOfWarheads() == countWarheads){
                r.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка ракет, указанного производителя;
     */
    public static void findRocketsByManufacturer(String manufacturer){
        System.out.printf("Ракеты указанного производителя: %s\n", manufacturer);
        for (Rocket r : rockets){
            if (r.getManufacture().equalsIgnoreCase(manufacturer)){
                r.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод информации по ракетам, с дальностью больше указанной.
     */
    public static void findRocketsWithRangeGreaterThan(int range){
        System.out.printf("Ракеты с дальностью больше указанной: %d\n", range);
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
