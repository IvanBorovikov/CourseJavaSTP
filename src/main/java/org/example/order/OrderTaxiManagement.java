package org.example.order;

import java.util.ArrayList;
import java.util.List;

public class OrderTaxiManagement {

    public static List<OrderTaxi> orderTaxis = new ArrayList<>();

    /*
    а) вывод информации о заказах, по номеру машины;
     */
    public static void getOrdersForVehicle(int numCar){
        for (OrderTaxi or : orderTaxis){
            if (or.getNumberCar() == numCar){
                or.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка заказов, протяженность которых больше указанной;
     */
    public static void findLongDistanceOrders(double route){
        System.out.printf("Заказы протяженность которых больше указанной: %.2f", route);
        for (OrderTaxi or : orderTaxis){
            if (or.getRouteLength() > route){
                or.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод размера среднего чека по всем заказам.
     */
    public static void getAverageCheck(){
        double total = 0.0;
        for (OrderTaxi or : orderTaxis){
            total += or.getCost();

        }
        System.out.println("Средний чек всех заказов: " + total / orderTaxis.size());
    }


    public static void main(String[] args) {
        orderTaxis.add(new OrderTaxi("Рожков", "Ул. Новосёлов", "Главный Вокзал", 233, 340.0, 2.2));
        orderTaxis.add(new OrderTaxi("Гулан", "Ул. Пушкинская", "Галерея Чижова", 132, 460.0, 3.4));
        getAverageCheck();
    }
}
