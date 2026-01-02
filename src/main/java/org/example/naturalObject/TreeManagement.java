package org.example.naturalObject;

import java.util.ArrayList;
import java.util.List;

public class TreeManagement {
    public static List<Tree> trees = new ArrayList<>();

    public static void getTreesToCutOfSpecies(){
        boolean found = true;
        for (Tree t : trees){
            if (t.isTheCullMark() == found){
                String str = String.format("Порода подлежащая к спиливанию: %s", t.getBreed());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findTreesByMinAge(int age){
        for (Tree t : trees){
            if (t.getAge() > age){
                String str = String.format("Дерево, возраст которого больше заданного: %s", t.getBreed() + " - " + t.getAge() + " лет");
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findTreesWithGirthGreaterThan(double trunk){
        for (Tree t : trees){
            if (t.getTrunkGirth() > trunk){
                t.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        trees.add(new Tree("Дуб", 5, 40.4, true, 30));
        trees.add(new Tree("Дуб", 6, 45.1, true, 32));
        trees.add(new Tree("Берёза", 4, 10.4, false, 15));

        getTreesToCutOfSpecies();
        findTreesByMinAge(10);
        findTreesWithGirthGreaterThan(10.0);
    }
}
