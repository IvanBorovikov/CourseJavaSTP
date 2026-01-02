package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class EngineManagement {
    public static List<Engine> engines = new ArrayList<>();

    public static void getEnginesByMinPower(double power){
        for (Engine e : engines){
            if (e.getPower() > power){
                String str = String.format("Двигатель мощность которого больше указанного: %s", e.getManufacture() + " - " + (e.isEngineType() ? "Бензин" : "Дизель"));
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findEnginesByValvesAndCylinders(double valves, int countCylinders){
        for (Engine e : engines){
            if (e.getNumberOfValves() == valves && e.getNumberOfCylinders() == countCylinders){
                String str = String.format("Двигатель c заданным кол-ом клапанов и цилиндров: %s", e.getManufacture() + " - " + (e.isEngineType() ? "Бензин" : "Дизель"));
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public static void findEnginesByType(boolean type){
        for (Engine e : engines){
            if (e.isEngineType() == type){
                e.show();
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        engines.add(new Engine("Toyota", 99.0, 1.33, true, 16, 4));
        engines.add(new Engine("Cummins", 360.0, 6.7, false, 24, 6));
        engines.add(new Engine("Ferrari", 800.0, 6.5, true, 48, 12));

        findEnginesByType(true);
    }
}
