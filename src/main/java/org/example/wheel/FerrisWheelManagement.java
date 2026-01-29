package org.example.wheel;

import java.util.ArrayList;
import java.util.List;

public class FerrisWheelManagement {
    public static List<FerrisWheel> ferrisWheels = new ArrayList<>();

    /*
    а) вывод списка колес, построенных после указанного года;
     */
    public static void findWheelsBuiltAfter(int year){
        System.out.printf("Колеса построенные после указанного года: %d", year);
        for (FerrisWheel f : ferrisWheels){
            if (f.getYearOfConstruction() > year){
                f.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка колес, имеющих высоту больше указанной и количество мест меньше указанного.
     */
    public static void findWheelsByHeightAndSeats(int height, int seats){
        System.out.printf("Колеса имеющие высоту больше указанной %d. И количество мест меньше указанного: %d\n", height, seats);
        for (FerrisWheel f : ferrisWheels){
            if (f.getWheelHeight() > height && f.getNumberOfSeats() < seats){
                f.show();
                System.out.println();
            }
        }
    }

//    public static void main(String[] args) {
//        ferrisWheels.add(new FerrisWheel("Москва-Сити 360", 140, 30, 48, "ГК \"Столичные парки\"", 2022));
//        ferrisWheels.add(new FerrisWheel("Небо Парк", 55, 15, 24, "ПКиО \"Зеленый остров\"", 1998));
//        ferrisWheels.add(new FerrisWheel("Карусель-Небо", 25, 8, 12, "ИП Сидоров", 2010));
//
//    }
}
