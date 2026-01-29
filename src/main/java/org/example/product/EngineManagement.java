package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class EngineManagement {
    public static List<Engine> engines = new ArrayList<>();

    /*
    а) вывод списка двигателей, мощность которых больше указанной;
     */
    public static void getEnginesByMinPower(double power){
        System.out.printf("Двигатели мощность которых больше указанной: %.2f", power);
        for (Engine e : engines){
            if (e.getPower() > power){
                e.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка двигателей, с заданным количеством клапанов и цилиндров;
     */
    public static void findEnginesByValvesAndCylinders(int valves, int countCylinders){
        System.out.printf("Двигатели с заданным количеством клапанов и цилиндров: %d, %d\n", valves, countCylinders);
        for (Engine e : engines){
            if (e.getNumberOfValves() == valves && e.getNumberOfCylinders() == countCylinders){
                e.show();
                System.out.println();
            }
        }

    }

    /*
    в) вывод информации по двигателям, заданного типа.
     */
    public static void findEnginesByType(boolean type){
        System.out.printf("Двигатели заданного типа: %b",type);
        for (Engine e : engines){
            if (e.isEngineType() == type){
                e.show();
                System.out.println();
            }
        }

    }

//    public static void main(String[] args) {
//        engines.add(new Engine("Toyota", 99.0, 1.33, true, 16, 4));
//        engines.add(new Engine("Cummins", 360.0, 6.7, false, 24, 6));
//        engines.add(new Engine("Ferrari", 800.0, 6.5, true, 48, 12));
//
//        findEnginesByValvesAndCylinders(16, 4);
//    }
}
