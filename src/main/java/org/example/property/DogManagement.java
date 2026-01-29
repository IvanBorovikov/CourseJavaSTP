package org.example.property;

import java.util.ArrayList;
import java.util.List;

public class DogManagement {
    public static List<Dog> dogs = new ArrayList<>();

    /*
    а) вывод списка собак, принадлежащих указанному владельцу;
     */
    public static void findDogsByOwnerLastName(String owner){
        System.out.printf("Собаки принадлежащие указанному владельцу: %s\n", owner);
        for (Dog d : dogs) {
            if (d.getOwnerLastName().equalsIgnoreCase(owner)){
                d.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка собак, указанного окраса;
     */
    public static void findDogsByCoatColor(String color){
        System.out.printf("Собаки указанного окраса: %s\n", color);
        for (Dog d : dogs) {
            if (d.getColor().equalsIgnoreCase(color)){
                d.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод информации по собакам, вес которых больше заданного.
     */
    public static void findByWeightKgGreaterThan(double weight){
        System.out.printf("Собаки вес которых больше заданного: %.2f\n", weight);
        for (Dog d : dogs) {
            if (d.getWeight() > weight){
                d.show();
                System.out.println();
            }
        }
    }

//    public static void main(String[] args) {
//        dogs.add(new Dog("Барон",  "Лабрадор-ретривер", 32.0, "Кузнецов", "Палевый", true, 58, 4));
//        dogs.add(new Dog("Лакки",  "Той-пудель", 3.2, "Соколова", "Белый", false, 24, 1));
//        dogs.add(new Dog("Арес",  "Немецкая овчарка", 42.2, "Иванов", "Чепрачный", true, 65, 6));
//
//    }
}
