package org.example.order;

import java.util.ArrayList;
import java.util.List;

public class OrderRestaurantManagement {
    public static List<OrderRestaurant> orderRestaurants = new ArrayList<>();


    public static void findOrdersByWaiter(String service){
        for (OrderRestaurant or : orderRestaurants){
            if (or.getServiceProvider().equalsIgnoreCase(service)){
                or.show();
                System.out.println();
            }
        }

    }

    public static void findHighValueOrders(double cost){
        for (OrderRestaurant or : orderRestaurants){
            if (or.getCost() > cost){
                String str = String.format("Заказ, стоимость которого больше указанного: %s", or.getDishName() + " - " + or.getCost() + " руб.");
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void findCustomersWhoPreferCash(){
        boolean found = true;
        for (OrderRestaurant or : orderRestaurants){
            if (or.isCashOrCard() == found){
                String str = String.format("Оплатили наличными за столом: %s", or.getTableNumber());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        orderRestaurants.add(new OrderRestaurant("Лисицин", 2, "Лазанья", 450.0, 100, true));
        orderRestaurants.add(new OrderRestaurant("Алипов", 4, "Картошка по деревенски", 300.0, 30, false));
        findCustomersWhoPreferCash();
    }
}
