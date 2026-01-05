package org.example.order;

public class OrderTaxi extends Order {
    /*
    Пункт отправления
     */
    private String departurePoint;
    /*
    Пункт прибытия
     */
    private String destination;
    /*
    номер машины
     */
    private int numberCar;
    /*
    Протяжность маршрута
     */
    private double routeLength;

    public OrderTaxi(){
        super();
    }

    public OrderTaxi(OrderTaxi orderTaxi){
        super(orderTaxi);
        this.departurePoint = orderTaxi.departurePoint;
        this.destination = orderTaxi.destination;
        this.numberCar = orderTaxi.numberCar;
        this.routeLength = orderTaxi.routeLength;
    }

    public OrderTaxi(String serviceProvider, String departurePoint,
              String destination, int numberCar, double cost, double routeLength){
        super(serviceProvider, cost);
        if (departurePoint == null){
            throw new IllegalArgumentException("departurePoint");
        }
        if (destination == null){
            throw new IllegalArgumentException("destination");
        }
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.numberCar = numberCar;
        this.routeLength = routeLength;

    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }

    public void show(){
        System.out.println("Фамилия официанта: " + serviceProvider);
        System.out.println("Пункт отправления: " + departurePoint);
        System.out.println("Пункт прибытия: " + destination);
        System.out.println("Номер машины: " + numberCar);
        System.out.println("Стоимость: " + cost);
        System.out.println("Протяженность маршрута: " + routeLength);


    }
}
