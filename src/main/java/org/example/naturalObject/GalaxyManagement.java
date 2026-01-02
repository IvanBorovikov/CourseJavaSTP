package org.example.naturalObject;

import java.util.ArrayList;

public class GalaxyManagement {

    public static ArrayList<Galaxy> galaxies = new ArrayList<>();

    public static void findGalaxiesOlderAndFurtherThan(Long age, Long distance){
        for (Galaxy g : galaxies){
            if (g.getAge() > age && g.getDistanceFromSolarSystem() > distance){
                String str = String.format("Галактики просуществовавшие дольше: %s", g.getNameOfTheGalaxy());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findSmallAndSparseGalaxies(Long numberStar, double diameter){
        for (Galaxy g : galaxies){
            if (g.getNumberOfStarsGalaxy() < numberStar && g.getDiameterGalaxy() < diameter){
                String str = String.format("Галактики с меньшим кол-во звезд и диаметром: %s", g.getNameOfTheGalaxy());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        galaxies.add(new Galaxy("Андромеда", 6000000000000L, 220000000000L, 1000000000000000L, 220000.0));
        galaxies.add(new Galaxy("Млечный путь", 13000000000L, 200000000L, 400000000L, 220000.0));
        findSmallAndSparseGalaxies(2000000000000000L, 420030.0);
    }
}
