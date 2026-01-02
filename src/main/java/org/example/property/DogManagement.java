package org.example.property;

import java.util.ArrayList;
import java.util.List;

public class DogManagement {

    public static List<Dog> dogs = new ArrayList<>();

    public static void findDogsByOwnerLastName(String owner){
        for (Dog d : dogs) {
            if (d.getOwnerLastName().equalsIgnoreCase(owner)){
                d.show();
                System.out.println();
            }
        }
    }

    public static void findDogsByCoatColor(String color){
        for (Dog d : dogs) {
            if (d.getColor().equalsIgnoreCase(color)){
                d.show();
                System.out.println();
            }
        }
    }

    public static void findByWeightKgGreaterThan(double weight){
        for (Dog d : dogs) {
            if (d.getWeight() > weight){
                d.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        dogs.add(new Dog("Барон",  "Лабрадор-ретривер", 32.0, "Кузнецов", "Палевый", true, 58, 4));
        dogs.add(new Dog("Лакки",  "Той-пудель", 3.2, "Соколова", "Белый", false, 24, 1));
        dogs.add(new Dog("Арес",  "Немецкая овчарка", 42.2, "Иванов", "Чепрачный", true, 65, 6));
    }
}
