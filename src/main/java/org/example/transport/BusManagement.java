package org.example.transport;

import java.util.ArrayList;
import java.util.List;

public class BusManagement {
    public static List<Bus> buses = new ArrayList<>();

    /*
    а) вывод списка автобусов для заданного номера маршрута;
     */
    public static void findBusesByRouteNumber(int rout){
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
    public static void findBusesInServiceLongerThan(int year){
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
    public static void getBusesByMinMileage(int mileage){
        System.out.printf("Автобусы пробег у которых больше заданного количества км: %d\n", mileage);
        for (Bus b : buses){
            if (b.getMileage() > mileage){
                b.show();
            }
        }
    }

    /*
    Удаление автобуса по номеру
     */
    public static boolean deleteBusByNumber(int busNumber) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getNumberOfTransport() == busNumber) {
                buses.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void editBus(int index, String lastNameDriver, int numberOfTransport, int routeNumber,
                               String stamp, int yearOfStartOfOperation, int mileage){
        if (index < 0 || index >= buses.size()) {
            System.out.println("Неверный номер автобуса!");
            return;

        }


        Bus b = buses.get(index);
        b.setLastNameDriver(lastNameDriver);
        b.setNumberOfTransport(numberOfTransport);
        b.setRouteNumber(routeNumber);
        b.setStamp(stamp);
        b.setYearOfStartOfOperation(yearOfStartOfOperation);
        b.setMileage(mileage);
        System.out.println("====================");
        System.out.println("ПОСЛЕ РЕДАКТИРОВАНИЯ:");
        b.show();

        System.out.println("Автобус успешно отредактирован");

    }


    public static void showAllBuses() {
        System.out.println("=== ВСЕ АВТОБУСЫ ===");
        for (int i = 0; i < buses.size(); i++) {
            System.out.println("[" + i + "] - Номер автобуса: " + buses.get(i).getNumberOfTransport());
            buses.get(i).show();
            System.out.println("-------------------");
        }
    }


}
