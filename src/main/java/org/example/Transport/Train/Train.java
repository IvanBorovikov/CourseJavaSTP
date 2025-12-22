package org.example.Transport.Train;

import org.example.Transport.Transport;

public class Train extends Transport {
    private String destination; // Пункт назначения
    private String departurePoint; // Пункт отправления
    private int routeLength;
    private int numberOfCommonPlaces;
    private int numberOfCompartments;
    private int numberOfReservedSeats;

    Train(){
        super();
    }

    Train(Train train){
        super(train);
        this.departurePoint = train.departurePoint;
        this.destination = train.destination;
        this.routeLength = train.routeLength;
        this.numberOfCommonPlaces = train.numberOfCommonPlaces;
        this.numberOfCompartments = train.numberOfCompartments;
        this.numberOfReservedSeats = train.numberOfReservedSeats;
    }

    Train(String departurePoint, String destination, int numberOfTransport,
          int routeLength, int numberOfCommonPlaces, int numberOfCompartments,
          int numberOfReservedSeats){
        super(numberOfTransport);
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.routeLength = routeLength;
        this.numberOfCommonPlaces = numberOfCommonPlaces;
        this.numberOfCompartments = numberOfCompartments;
        this.numberOfReservedSeats = numberOfReservedSeats;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getDestination() {
        return destination;
    }

    public int getRouteLength() {
        return routeLength;
    }

    public int getNumberOfCommonPlaces() {
        return numberOfCommonPlaces;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public int getNumberOfReservedSeats() {
        return numberOfReservedSeats;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setRouteLength(int routeLength) {
        this.routeLength = routeLength;
    }

    public void setNumberOfCommonPlaces(int numberOfCommonPlaces) {
        this.numberOfCommonPlaces = numberOfCommonPlaces;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public void setNumberOfReservedSeats(int numberOfReservedSeats) {
        this.numberOfReservedSeats = numberOfReservedSeats;
    }

    public void show(){
        System.out.println("Пункт назначения: " + destination);
        System.out.println("Пункт отправления: " + departurePoint);
        System.out.println("Номер поезда: " + numberOfTransport);
        System.out.println("Протяженность маршрута: " + routeLength);
        System.out.println("Число общих мест: " + numberOfCommonPlaces);
        System.out.println("Число купейных мест: " + numberOfCompartments);
        System.out.println("Число плацкартных мест: " + numberOfReservedSeats);
    }
}
