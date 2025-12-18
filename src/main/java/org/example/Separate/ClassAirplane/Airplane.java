package org.example.Separate.ClassAirplane;

public class Airplane {
    private String departurePoint; // Пункт отправления
    private String destination; // Пункт направления
    private int flightNumber;
    private int countPassengers;
    private String departureWeekday; //день недели вылета
    private String arrivalWeekday; // день недели прилета

    Airplane(Airplane a){
        this.departurePoint = a.departurePoint;
        this.destination = a.destination;
        this.flightNumber = a.flightNumber;
        this.countPassengers = a.countPassengers;
        this.departureWeekday = a.departureWeekday;
        this.arrivalWeekday = a.arrivalWeekday;
    }

    Airplane(String departurePoint, String destination, int flightNumber,
             int countPassengers, String departureWeekday, String arrivalWeekday){
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.countPassengers = countPassengers;
        this.departureWeekday = departureWeekday;
        this.arrivalWeekday = arrivalWeekday;

    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public String getDepartureWeekday() {
        return departureWeekday;
    }

    public void setDepartureWeekday(String departureWeekday) {
        this.departureWeekday = departureWeekday;
    }

    public String getArrivalWeekday() {
        return arrivalWeekday;
    }

    public void setArrivalWeekday(String arrivalWeekday) {
        this.arrivalWeekday = arrivalWeekday;
    }

    public void show(){
        System.out.println("Пункт отправления: " + departurePoint);
        System.out.println("Пункт назначения: " + destination);
        System.out.println("Номер рейса: " + flightNumber);
        System.out.println("Кол-во пассажиров: " + countPassengers);
        System.out.println("День недели вылета: " + departureWeekday);
        System.out.println("День недели прилёта: " + arrivalWeekday);
    }
}
