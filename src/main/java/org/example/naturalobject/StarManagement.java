package org.example.naturalobject;

import java.util.*;

public class StarManagement {

    public static ArrayList<Star> stars = new ArrayList<>();

    /*
    а) вывод списка звезд, с диаметром больше заданного, принадлежащих указанной галактике;
     */
    public static void findStarsInGalaxyWithDiameterGreaterThan(double diameter, String galaxy){
        System.out.printf("Звезды с диаметром больше заданного: %.2f\n", diameter);
        for (Star s : stars){
            if (s.getDiameter() > diameter && s.getBelongingToTheGalaxy().equalsIgnoreCase(galaxy)){
                s.show();
                System.out.println();
            }
        }

    }

    /*
    б) вывод списка звезд, с удаленностью от Солнца меньше заданной, и яркостью больше заданной;
     */
    public static void findNearbyBrightStars(Long distance, double brightness1){
        System.out.printf("Звезды с удаленностью от Солнца меньше заданной: %df", distance);
        System.out.printf(". И яркостью больше заданной: %.2f\n", brightness1);
        for (Star s : stars){
            if (s.getDiameter() < distance && s.getBrightness() > brightness1){
                s.show();
                System.out.println();
            }
        }
    }

    /*
    в) определение существования в списке звезд одинакового возраста и вывод информации по ним в случае обнаружения таковых.
     */


    public static void findGroupsOfStarsWithSameAge(){

        Map<Long, List<Star>> starsByAge = new HashMap<>();

        for (Star star : stars) {
            long age = star.getAge();
            boolean exists = starsByAge.containsKey(age);
            if (exists) {
                starsByAge.get(age).add(star);
            } else {
                List<Star> starsWithSameAge = new ArrayList<>();
                starsWithSameAge.add(star);
                starsByAge.put(age, starsWithSameAge);
            }
        }

        for (Map.Entry<Long, List<Star>> entry: starsByAge.entrySet()) {
            List<Star> starsWithSameAge = entry.getValue();
            if (starsWithSameAge.size() > 1){
                System.out.printf("Звезды с одинаковым возрастом %d\n", entry.getKey());
                for (Star s : starsWithSameAge){
                    s.show();
                    System.out.println();
                }
            }
        }
    }



    public static void main(String[] args) {
        stars.add(new Star("Солнце", 1.0, 1.0, 4600000000L, 0L, "Млечный путь"));
        stars.add(new Star("Бетельгейзе", 90000.0, 1000.0, 10000000L, 550L, "Млечный путь"));
        stars.add(new Star("WOH G64", 280000.0, 1540.0, 5000000L, 163000L, "БМО"));
        stars.add(new Star("WOH 12", 280000.0, 1540.0, 5000000L, 163000L, "БМО"));
        findGroupsOfStarsWithSameAge();
    }
}
