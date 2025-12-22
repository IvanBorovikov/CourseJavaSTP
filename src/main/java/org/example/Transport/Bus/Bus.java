package org.example.Transport.Bus;

import org.example.Transport.Transport;

import java.time.Year;

public class Bus extends Transport {
    private String lastNameDriver;
    private int routeNumber;
    private String stamp;
    private Year yearOfStartOfOperation;
    private int mileage;

    Bus(){
        super();
    }

    Bus(Bus bus){
        super(bus);
        this.lastNameDriver = bus.lastNameDriver;
        this.routeNumber = bus.routeNumber;
        this.stamp = bus.stamp;
        this.yearOfStartOfOperation = bus.yearOfStartOfOperation;
        this.mileage = bus.mileage;
    }

    Bus(String lastNameDriver, int numberOfTransport, int routeNumber,
        String stamp, Year yearOfStartOfOperation, int mileage){
        super(numberOfTransport);
        this.lastNameDriver = lastNameDriver;
        this.routeNumber = routeNumber;
        this.stamp = stamp;
        this.yearOfStartOfOperation = yearOfStartOfOperation;
        this.mileage = mileage;
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

    public Year getYearOfStartOfOperation() {
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

    public void setYearOfStartOfOperation(Year yearOfStartOfOperation) {
        this.yearOfStartOfOperation = yearOfStartOfOperation;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
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
