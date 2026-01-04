package org.example.airplane;

public class Airplane {
    private String departurePoint; // Пункт отправления
    private String arrivalPoint; // Пункт направления
    private String flightNumber;
    private int countPassengers;
    private Weekday departureWeekday; //день недели вылета
    private Weekday arrivalWeekday; // день недели прилета

    public Airplane(){}

    public Airplane(Airplane a){
        this.departurePoint = a.departurePoint;
        this.arrivalPoint = a.arrivalPoint;
        this.flightNumber = a.flightNumber;
        this.countPassengers = a.countPassengers;
        this.departureWeekday = a.departureWeekday;
        this.arrivalWeekday = a.arrivalWeekday;
    }

    public Airplane(String departurePoint, String arrivalPoint, String flightNumber,
                    int countPassengers, Weekday departureWeekday, Weekday arrivalWeekday){
        if (departurePoint == null){
            throw new IllegalArgumentException("departurePoint");
        }

        if (arrivalPoint == null){
            throw new IllegalArgumentException("arrivalPoint");
        }

        if (flightNumber == null){
            throw new IllegalArgumentException("flightNumber");
        }

        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
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

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public Weekday getDepartureWeekday() {
        return departureWeekday;
    }

    public void setDepartureWeekday(Weekday departureWeekday) {
        this.departureWeekday = departureWeekday;
    }

    public Weekday getArrivalWeekday() {
        return arrivalWeekday;
    }

    public void setArrivalWeekday(Weekday arrivalWeekday) {
        this.arrivalWeekday = arrivalWeekday;
    }

    public void show(){
        System.out.println("Пункт отправления: " + departurePoint);
        System.out.println("Пункт назначения: " + arrivalPoint);
        System.out.println("Номер рейса: " + flightNumber);
        System.out.println("Кол-во пассажиров: " + countPassengers);
        System.out.println("День недели вылета: " + departureWeekday.getWeekday());
        System.out.println("День недели прилёта: " + arrivalWeekday.getWeekday());
    }
}
