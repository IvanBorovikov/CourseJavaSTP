package org.example.naturalobject;

import java.util.ArrayList;

public class GalaxyManagement {

    public static ArrayList<Galaxy> galaxies = new ArrayList<>();

    /*
    а) вывод списка галактик, просуществовавших дольше указанного времени и расположенных от солнечной системы дальше указанного расстояния;
     */
    public static void findGalaxiesOlderAndFurtherThan(Long age, Long distance){
        System.out.printf("Галактики просуществовавшие дольше указанного времени: %d", age);
        System.out.printf("И расположенных от солнечной системы дальше указанного расстояния: %d\n", distance);
        for (Galaxy g : galaxies){
            if (g.getAge() > age && g.getDistanceFromSolarSystem() > distance){
                g.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка галактик, содержащих звезд меньше, чем указано и имеющих диаметр меньше указанного.
     */
    public static void findSmallAndSparseGalaxies(Long numberStar, double diameter){
        System.out.printf("Галактики содержащие звезд меньше, чем указано: %d", numberStar);
        System.out.printf("И имеющие диаметр меньше указанного: %.2f\n", diameter);
        for (Galaxy g : galaxies){
            if (g.getNumberOfStarsGalaxy() < numberStar && g.getDiameterGalaxy() < diameter){
                g.show();
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
