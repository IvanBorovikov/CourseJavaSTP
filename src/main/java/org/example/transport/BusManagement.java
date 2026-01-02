package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class BusManagement {
    public static List<Bus> buses = new ArrayList<>();

    public void findBusesByRouteNumber(int rout){
        for (Bus b : buses){
            if (b.getRouteNumber() == rout){
                b.show();
            }
        }
    }

    public void findBusesInServiceLongerThan(int year){
        for (Bus b : buses){
            if (b.getYearOfStartOfOperation() > year){
                b.show();
            }
        }
    }

    public void getBusesByMinMileage(int mileage){
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
