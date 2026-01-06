package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class BusManagement {
    public static List<Bus> buses = new ArrayList<>();

    /*
    а) вывод списка автобусов для заданного номера маршрута;
     */
    public void findBusesByRouteNumber(int rout){
        System.out.printf("Автобусы для заданного номера маршрута: %d\n", rout);
        for (Bus b : buses){
            if (b.getRouteNumber() == rout){
                b.show();
            }
        }
    }

    /*
    б) вывод списка автобусов, которые эксплуатируются больше заданного количества лет;
     */
    public void findBusesInServiceLongerThan(int year){
        System.out.printf("Автобусы которые эксплуатируются больше заданного количества лет: %d\n", year);
        for (Bus b : buses){
            if (b.getYearOfStartOfOperation() > year){
                b.show();
            }
        }
    }

    /*
    в) вывод списка автобусов, пробег у которых больше заданного количества км.
     */
    public void getBusesByMinMileage(int mileage){
        System.out.printf("Автобусы пробег у которых больше заданного количества км: %d\n", mileage);
        for (Bus b : buses){
            if (b.getMileage() > mileage){
                b.show();
            }
        }
    }

    public static void main(String[] args) {
        buses.add(new Bus("Сидоров", 217, 105, "ЛиАЗ-5292", 2022, 85450));
        buses.add(new Bus("Петров", 42, 301, "ПАЗ-3205", 2015, 324800));
        buses.add(new Bus("Козлов", 12, 111, " ГАЗель Next", 2010, 412500));
    }
}
