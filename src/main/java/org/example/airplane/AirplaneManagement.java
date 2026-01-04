package org.example.airplane;

import java.util.ArrayList;
import java.util.List;


public class AirplaneManagement {
    public static List<Airplane> airplanes = new ArrayList<>();

    public static void findFlightsByArrivalPoint(String arrivalPoint){
        for (Airplane a : airplanes){
            if (a.getArrivalPoint().equalsIgnoreCase(arrivalPoint)){
                a.show();
                System.out.println();
            }
        }
    }

    public static void findFlightsOnDay(Weekday weekday){
        System.out.printf("Рейсы прибывающие в %s\n", weekday.getWeekday());
        for (Airplane a : airplanes){
            if (a.getArrivalWeekday().equals(weekday)){
                a.show();
                System.out.println();
            }
        }

        System.out.println("-------------------------------");

        System.out.printf("Рейсы вылетающие в %s\n", weekday.getWeekday());
        for (Airplane a : airplanes){
            if (a.getDepartureWeekday().equals(weekday)){
                a.show();
                System.out.println();
            }
        }


    }

    public static void findFlightsSpanningMultipleDays(){
        for (Airplane a : airplanes){
            if (a.getArrivalWeekday() != a.getDepartureWeekday()){
                a.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        airplanes.add(new Airplane("Москва", "Санкт-Петербург", "SU-22", 156, Weekday.MONDAY, Weekday.MONDAY));
        airplanes.add(new Airplane("Нью-Йорк", "Токио", "JL-006", 280, Weekday.SUNDAY, Weekday.SUNDAY));
        airplanes.add(new Airplane("Москва", "Анталья", "DP-715", 189, Weekday.SUNDAY, Weekday.MONDAY));
        airplanes.add(new Airplane("Москва", "Тбилиси", "DP-711", 189, Weekday.SUNDAY, Weekday.MONDAY));
        findFlightsSpanningMultipleDays();
        //findFlightsOnDay(Weekday.SUNDAY);
        //findFlightsByArrivalPoint("Тбилиси");
    }
}
