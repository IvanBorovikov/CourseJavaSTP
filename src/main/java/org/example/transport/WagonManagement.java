package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class WagonManagement {
    public static List<Wagon> wagons = new ArrayList<>();

    /*
    а) вывод списка вагонов, находящихся в эксплуатации больше указанного количества лет;
     */
    public static void findCarsInServiceLongerThan(int period){
        System.out.printf("Вагоны находящиеся в эксплуатации больше указанного количества лет: %d\n", period);
        for (Wagon w : wagons){
            if (w.getOperationPeriod() > period){
                w.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка вагонов, закрепленных за проводником с заданной фамилией;
     */
    public static void findCarsByConductorLastName(String lastName){
        System.out.printf("Вагоны  закрепленных за проводником с заданной фамилией: %s\n", lastName);
        for (Wagon w : wagons){
            if (w.getConductorName().equalsIgnoreCase(lastName)){
                w.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка вагонов с кондиционером.
     */
    public static void findCarsWithAirConditioning(){
        System.out.println("Вагоны с кондиционером");
        for (Wagon w : wagons){
            if (w.isConditioner()){
                w.show();
                System.out.println();
            }
        }
    }


//    public static void main(String[] args) {
//        wagons.add(new Wagon("Купейный", "09", 18, "Волкова", "002H", true, 7));
//        wagons.add(new Wagon("Плацкартный", "07", 54, "Иванов", "016A", false, 22));
//        wagons.add(new Wagon("Вагон-ресторан", "P-01", 48, "Петров", "002H", true, 15));
//        findCarsWithAirConditioning();
//    }
}
