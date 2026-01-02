package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class TrainManagement {
    public static List<Train> trains = new ArrayList<>();

    public void findTrainsByDestination(String destination){
        for (Train t : trains){
            if (t.getDestination().equalsIgnoreCase(destination)){
                t.show();
                System.out.println();
            }
        }

    }

    public void calculateTotalSeatsByTrainNumber(String num){
        for (Train t : trains){
            if (t.getNumberOfTransport().equalsIgnoreCase(num)){
                String str = String.format("Общее число мест: %s", t.getNumberOfCommonPlaces());
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public void findTrainsWithRouteLengthGreaterThan(int route){
        for (Train t : trains){
            if (t.getRouteLength() > route){
                t.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        trains.add(new Train("Москва", "Владивосток", "002H", 9302, 0, 264, 0));
        trains.add(new Train("Санкт-Петербург", "Мурманск", "016A", 1448, 58, 108, 162));
    }
}
