package org.example.product;

public class Tire {
    private String manufacturer;
    private boolean tireType;
    private double radius;
    private double expectedMileage;
    private boolean newOrBu;

    Tire(){

    }

    Tire(Tire tire){
        this.manufacturer = tire.manufacturer;
        this.tireType = tire.tireType;
        this.radius = tire.radius;
        this.expectedMileage = tire.expectedMileage;
        this.newOrBu = tire.newOrBu;
    }

    Tire(String manufacturer, boolean tireType, double radius,
         double expectedMileage, boolean newOrBu){
        this.manufacturer = manufacturer;
        this.tireType = tireType;
        this.radius = radius;
        this.expectedMileage = expectedMileage;
        this.newOrBu = newOrBu;
    }

    public boolean isTireType() {
        return tireType;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isNewOrBu() {
        return newOrBu;
    }

    public void setTireType(boolean tireType) {
        this.tireType = tireType;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setNewOrBu(boolean newOrBu) {
        this.newOrBu = newOrBu;
    }

    public void show(){
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Тип покрышки: " + (tireType ? "Лето" : "Зима"));
        System.out.println("Радиус: " + radius);
        System.out.println("Ожидаемый пробег: " + expectedMileage);
        System.out.println("Новая или б/У: " + (newOrBu ? "Новая" : "б/у"));
    }
}
