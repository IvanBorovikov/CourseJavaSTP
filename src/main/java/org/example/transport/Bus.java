package org.example.transport;

public class Bus {
    /*
    фамилия водителя
     */
    private String lastNameDriver;
    /*
     номер автобуса
     */
    private int numberOfTransport;
    /*
    номер маршрута
     */
    private int routeNumber;
    /*
    марка
     */
    private String stamp;
    /*
   год начала эксплуатации
     */
    private int yearOfStartOfOperation;
    /*
     пробег.
     */
    private int mileage;

    public Bus(){
        super();
    }

    public Bus(Bus bus){
        this.lastNameDriver = bus.lastNameDriver;
        this.numberOfTransport = bus.numberOfTransport;
        this.routeNumber = bus.routeNumber;
        this.stamp = bus.stamp;
        this.yearOfStartOfOperation = bus.yearOfStartOfOperation;
        this.mileage = bus.mileage;
    }

    public Bus(String lastNameDriver, int numberOfTransport, int routeNumber,
        String stamp, int yearOfStartOfOperation, int mileage){
        if (lastNameDriver == null){
            throw new IllegalArgumentException("lastNameDriver");
        }

        if (stamp == null){
            throw new IllegalArgumentException("stamp");
        }

        this.lastNameDriver = lastNameDriver;
        this.numberOfTransport = numberOfTransport;
        this.routeNumber = routeNumber;
        this.stamp = stamp;
        this.yearOfStartOfOperation = yearOfStartOfOperation;
        this.mileage = mileage;
    }

    public int getNumberOfTransport() {
        return numberOfTransport;
    }

    public String getLastNameDriver() {
        return lastNameDriver;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public String getStamp() {
        return stamp;
    }

    public int getYearOfStartOfOperation() {
        return yearOfStartOfOperation;
    }

    public int getMileage() {
        return mileage;
    }

    public void setLastNameDriver(String lastNameDriver) {
        this.lastNameDriver = lastNameDriver;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public void setYearOfStartOfOperation(int yearOfStartOfOperation) {
        this.yearOfStartOfOperation = yearOfStartOfOperation;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setNumberOfTransport(int numberOfTransport) {
        this.numberOfTransport = numberOfTransport;
    }

    public void show(){
        System.out.println("Фамилия водителя: " + lastNameDriver);
        System.out.println("Номер автобуса: " + numberOfTransport);
        System.out.println("Номер маршрута: " + routeNumber);
        System.out.println("Марка: " + stamp);
        System.out.println("Год начала эксплуатации: " + yearOfStartOfOperation);
        System.out.println("Пробег: " + mileage);
    }
}
