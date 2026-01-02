package org.example.administration;

import org.example.separate.Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirplaneManagement {
    public static List<Airplane> airplanes = new ArrayList<>();

    public static void findFlightsByDestination(String destination){
        for (Airplane a : airplanes){
            if (a.getDestination().equalsIgnoreCase(destination)){
                a.show();
                System.out.println();
            }
        }
    }

    public static void findFlightsOnDay(String weekday){
        for (Airplane a : airplanes){
            if (a.getDepartureWeekday().equalsIgnoreCase(weekday)){
                a.show();
                System.out.println();
            }
        }
    }

    public static void findFlightsSpanningMultipleDays(String weekday){
        for (Airplane a : airplanes){
            if (a.getDepartureWeekday().equalsIgnoreCase(weekday) && !Objects.equals(a.getArrivalWeekday(), weekday)){
                a.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        airplanes.add(new Airplane("Москва", "Санкт-Петербург", "SU-22", 156, "Понедельник", "Понедельник"));
        airplanes.add(new Airplane("Нью-Йорк", "Токио", "JL-006", 280, "Суббота", "Воскресенье"));
        airplanes.add(new Airplane("Москва", "Анталья", "DP-715", 189, "Суббота", "Суббота"));
        findFlightsSpanningMultipleDays("Суббота");
    }
}
