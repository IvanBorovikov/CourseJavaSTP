package org.example.order;

public class OrderTaxi extends Order {
    /*
    Пункт отправления
     */
    private String departurePoint;
    /*
    Пункт прибытия
     */
    private String arrivalPoint;
    /*
    номер машины
     */
    private String numberCar;
    /*
    Протяжность маршрута
     */
    private int routeLength;

    public OrderTaxi(){
        super();
    }

    public OrderTaxi(OrderTaxi orderTaxi){
        super(orderTaxi);
        this.departurePoint = orderTaxi.departurePoint;
        this.arrivalPoint = orderTaxi.arrivalPoint;
        this.numberCar = orderTaxi.numberCar;
        this.routeLength = orderTaxi.routeLength;
    }

    public OrderTaxi(String serviceProvider, String departurePoint,
                     String arrivalPoint, String numberCar, double cost, int routeLength){
        super(serviceProvider, cost);
        if (departurePoint == null){
            throw new IllegalArgumentException("departurePoint");
        }
        if (arrivalPoint == null){
            throw new IllegalArgumentException("arrivalPoint");
        }
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.numberCar = numberCar;
        this.routeLength = routeLength;

    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public int getRouteLength() {
        return routeLength;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public void setRouteLength(int routeLength) {
        this.routeLength = routeLength;
    }

    public void show(){
        System.out.println("Фамилия официанта: " + serviceProvider);
        System.out.println("Пункт отправления: " + departurePoint);
        System.out.println("Пункт прибытия: " + arrivalPoint);
        System.out.println("Номер машины: " + numberCar);
        System.out.println("Стоимость: " + cost);
        System.out.println("Протяженность маршрута: " + routeLength);


    }
}
