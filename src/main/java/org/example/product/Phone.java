package org.example.product;

public class Phone {
    private String manufacturer;
    private String model;
    private int memoryCapacity;
    private String bodyColor;
    private double screenDiagonal;
    private int batteryCapacity;


    public Phone(){

    }

    public Phone(Phone phone){
        this.manufacturer = phone.manufacturer;
        this.model = phone.model;
        this.memoryCapacity = phone.memoryCapacity;
        this.bodyColor = phone.bodyColor;
        this.screenDiagonal = phone.screenDiagonal;
        this.batteryCapacity = phone.batteryCapacity;
    }

    public Phone(String manufacturer, String model, int memoryCapacity, String bodyColor,
          double screenDiagonal, int batteryCapacity){
        this.manufacturer = manufacturer;
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.bodyColor = bodyColor;
        this.screenDiagonal = screenDiagonal;
        this.batteryCapacity = batteryCapacity;

    }

    public String getManufacture() {
        return manufacturer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setManufacture(String manufacture) {
        this.manufacturer = manufacture;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void show(){
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Модель: " + model);
        System.out.println("Объем памяти: " + memoryCapacity);
        System.out.println("Цвет корпуса: " + bodyColor);
        System.out.println("Диагональ экрана: " + screenDiagonal);
        System.out.println("Емкость аккумулятора: " + batteryCapacity);
    }
}
