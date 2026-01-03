package org.example.wheel;

import java.util.ArrayList;
import java.util.List;

public class FerrisWheelManagement {
    public static List<FerrisWheel> ferrisWheels = new ArrayList<>();

    public static void findWheelsBuiltAfter(int year){
        for (FerrisWheel f : ferrisWheels){
            if (f.getYearOfConstruction() > year){
                f.show();
                System.out.println();
            }
        }
    }

    public static void findWheelsByHeightAndSeats(int height, int seats){
        for (FerrisWheel f : ferrisWheels){
            if (f.getWheelHeight() > height && f.getNumberOfSeats() < seats){
                f.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        ferrisWheels.add(new FerrisWheel("Москва-Сити 360", 140, 30, 48, "ГК \"Столичные парки\"", 2022));
        ferrisWheels.add(new FerrisWheel("Небо Парк", 55, 15, 24, "ПКиО \"Зеленый остров\"", 1998));
        ferrisWheels.add(new FerrisWheel("Карусель-Небо", 25, 8, 12, "ИП Сидоров", 2010));
    }
}
