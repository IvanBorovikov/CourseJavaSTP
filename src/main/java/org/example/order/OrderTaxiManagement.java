package org.example.order;

import java.util.ArrayList;
import java.util.List;

public class OrderTaxiManagement {

    public static List<OrderTaxi> orderTaxis = new ArrayList<>();

    public static void getOrdersForVehicle(int numCar){
        for (OrderTaxi or : orderTaxis){
            if (or.getNumberCar() == numCar){
                or.show();
                System.out.println();
            }
        }
    }

    public static void findLongDistanceOrders(double route){
        for (OrderTaxi or : orderTaxis){
            if (or.getRouteLength() > route){
                String str = String.format("Заказ, протяженность которого больше указанного: %s", or.getRouteLength());
                System.out.println(str);
                System.out.println();
            }
        }
    }

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
