package org.example.Product.Tire;

import org.example.Product.Product;

public class Tire extends Product {
    private boolean tireType;
    private double radius;
    private boolean newOrBu;

    Tire(){
        super();
    }

    Tire(Tire tire){
        super(tire);
        this.tireType = tire.tireType;
        this.radius = tire.radius;
        this.newOrBu = tire.newOrBu;
    }

    Tire(String manufacturer, boolean tireType, double radius,
         double power, boolean newOrBu){
        super(manufacturer, power);
        this.tireType = tireType;
        this.radius = radius;
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
        System.out.println("Производитель: " + manufacture);
        System.out.println("Тип покрышки: " + (tireType ? "Лето" : "Зима"));
        System.out.println("Радиус: " + radius);
        System.out.println("Ожидаемый пробег: " + power);
        System.out.println("Новая или б/У: " + (newOrBu ? "Новая" : "б/у"));
    }
}
