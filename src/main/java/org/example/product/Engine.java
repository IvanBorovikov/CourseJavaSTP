package org.example.product;

public class Engine {
    private String manufacture;
    private double power;
    private int cylinderCapacity;
    private boolean engineType;
    private int numberOfValves;
    private int numberOfCylinders;

    Engine(){

    }

    Engine(Engine engine){
        this.manufacture = engine.manufacture;
        this.power = engine.power;
        this.cylinderCapacity = engine.cylinderCapacity;
        this.engineType = engine.engineType;
        this.numberOfValves = engine.numberOfValves;
        this.numberOfCylinders = engine.numberOfCylinders;
    }

    Engine(String manufacture, double power, int cylinderCapacity,
             boolean engineType, int numberOfValves, int numberOfCylinders){
        this.manufacture = manufacture;
        this.power = power;
        this.cylinderCapacity = cylinderCapacity;
        this.engineType = engineType;
        this.numberOfValves = numberOfValves;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getPower() {
        return power;
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

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPower(double power) {
        this.power = power;
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
