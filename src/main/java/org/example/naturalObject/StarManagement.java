package org.example.naturalObject;

import java.util.ArrayList;

public class StarManagement {

    public static ArrayList<Star> stars = new ArrayList<>();


    public static void findStarsInGalaxyWithDiameterGreaterThan(double diameter){
        for (Star s : stars){
            if (s.getDiameter() > diameter){
                String str = String.format("Диаметр больше заданного принадлежит: %s", s.getBelongingToTheGalaxy());
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public static void findNearbyBrightStars(Long distance, double brightness1){
        for (Star s : stars){
            if (s.getDiameter() < distance && s.getBrightness() > brightness1){
                String str = String.format("Удаленность от солнца меньше заданного и яркостью больше заданного принадлежит: %s", s.getBelongingToTheGalaxy());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findGroupsOfStarsWithSameAge(Long age){
        for (Star s : stars){
            if (s.getAge().equals(age)){
                s.show();
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        stars.add(new Star("Солнце", 1.0, 1.0, 4600000000L, 0L, "Млечный путь"));
        stars.add(new Star("Бетельгейзе", 90000.0, 1000.0, 10000000L, 550L, "Млечный путь"));
        stars.add(new Star("WOH G64", 280000.0, 1540.0, 5000000L, 163000L, "БМО"));
    }
}
