package org.example.order;

import java.util.ArrayList;
import java.util.List;

public class OrderRestaurantManagement {
    public static List<OrderRestaurant> orderRestaurants = new ArrayList<>();

    /*
    а) вывод информации о заказах, принятых конкретным официантом;
     */
    public static void findOrdersByWaiter(String service){
        System.out.printf("Информация о заказах принятых конкретным официантом: %s\n", service);
        for (OrderRestaurant or : orderRestaurants){
            if (or.getServiceProvider().equalsIgnoreCase(service)){
                or.show();
                System.out.println();
            }
        }

    }

    /*
    б) вывод списка заказов, стоимость которых больше указанной;
     */
    public static void findHighValueOrders(double cost){
        System.out.printf("Информация о заказах принятых конкретным официантом: %.2f\n", cost);
        for (OrderRestaurant or : orderRestaurants){
            if (or.getCost() > cost){
                or.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка клиентов, платящих наличными.
     */
    public static void findCustomersWhoPreferCash(){
        System.out.println("Клиенты платящие наличными:");
        for (OrderRestaurant or : orderRestaurants){
            if (or.getPaymentType() == PaymentType.CASH){
                or.show();
                System.out.println();
            }
        }
    }

//    public static void main(String[] args) {
//        orderRestaurants.add(new OrderRestaurant("Лисицин", 2, "Лазанья", 450.0, 100, PaymentType.CARD));
//        orderRestaurants.add(new OrderRestaurant("Алипов", 4, "Картошка по деревенски", 300.0, 30, PaymentType.CASH));
//
//    }
}
