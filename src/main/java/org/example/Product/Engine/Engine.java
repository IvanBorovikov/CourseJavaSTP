package org.example.Product.Engine;

import org.example.Product.Product;

public class Engine extends Product {
    private int cylinderCapacity;
    private boolean engineType;
    private int numberOfValves;
    private int numberOfCylinders;

    Engine(){
        super();
    }

    Engine(Engine engine){
        super(engine);
        this.cylinderCapacity = engine.cylinderCapacity;
        this.engineType = engine.engineType;
        this.numberOfValves = engine.numberOfValves;
        this.numberOfCylinders = engine.numberOfCylinders;
    }

    Engine(String manufacture, double power, int cylinderCapacity,
             boolean engineType, int numberOfValves, int numberOfCylinders){
        super(manufacture, power);
        this.cylinderCapacity = cylinderCapacity;
        this.engineType = engineType;
        this.numberOfValves = numberOfValves;
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public boolean isEngineType() {
        return engineType;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public void setEngineType(boolean engineType) {
        this.engineType = engineType;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void show(){
        System.out.println("Производитель: " + manufacture);
        System.out.println("Мощность: " + power);
        System.out.println("Объем цилиндров: " + cylinderCapacity);
        System.out.println("Двигатель на: " + (engineType ? "Бензин" : "Дизель"));
        System.out.println("Кол-во клапанов: " + numberOfValves);
        System.out.println("Кол-во цилиндров: " + numberOfCylinders);
    }
}
