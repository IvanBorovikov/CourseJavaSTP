package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class TrainManagement {
    public static List<Train> trains = new ArrayList<>();

    /*
    а) вывод списка поездов, следующих до заданного пункта назначения;
     */
    public static void findTrainsByDestination(String destination){
        System.out.printf("Поезда до заданного пункта назначения: %s\n", destination);
        for (Train t : trains){
            if (t.getDestination().equalsIgnoreCase(destination)){
                t.show();
                System.out.println();
            }
        }

    }

    /*
    б) вывод общего числа мест в поезде с заданным номером;
     */
    public static void calculateTotalSeatsByTrainNumber(String num){
        System.out.printf("Вывод общего числа мест в поезде с заданным номером: %s\n", num);
        for (Train t : trains){
            if (t.getNumberOfTransport().equalsIgnoreCase(num)){
                t.show();
                System.out.println();
            }
        }

    }

    /*
    в) вывод списка поездов, с протяженностью маршрута больше заданной
     */
    public static void findTrainsWithRouteLengthGreaterThan(int route){
        System.out.printf("Поезда с протяженностью маршрута больше заданной: %d\n", route);
        for (Train t : trains){
            if (t.getRouteLength() > route){
                t.show();
                System.out.println();
            }
        }
    }


//    public static void main(String[] args) {
//        trains.add(new Train("Москва", "Владивосток", "002H", 9302, 0, 264, 0));
//        trains.add(new Train("Санкт-Петербург", "Мурманск", "016A", 1448, 58, 108, 162));
//    }
}
