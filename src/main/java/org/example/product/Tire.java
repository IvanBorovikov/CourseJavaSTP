package org.example.product;

public class Tire {
    /*
    Производитель
     */
    private String manufacturer;
    /*
    тип покрышки(лето/зима)
     */
    private boolean tireType;
    /*
    радиус
     */
    private int radius;
    /*
   ожидаемый пробег
     */
    private int expectedMileage;
    /*
    новая/бу.
     */
    private boolean newOrBu;

    public Tire(){

    }

    public Tire(Tire tire){
        this.manufacturer = tire.manufacturer;
        this.tireType = tire.tireType;
        this.radius = tire.radius;
        this.expectedMileage = tire.expectedMileage;
        this.newOrBu = tire.newOrBu;
    }

    public Tire(String manufacturer, boolean tireType, int radius,
         int expectedMileage, boolean newOrBu){

        if(manufacturer == null){
            throw new IllegalArgumentException("manufacturer");
        }

        this.manufacturer = manufacturer;
        this.tireType = tireType;
        this.radius = radius;
        this.expectedMileage = expectedMileage;
        this.newOrBu = newOrBu;
    }

    public boolean isTireType() {
        return tireType;
    }

    public int getRadius() {
        return radius;
    }

    public int getExpectedMileage() {
        return expectedMileage;
    }

    public boolean isNewOrBu() {
        return newOrBu;
    }

    public void setTireType(boolean tireType) {
        this.tireType = tireType;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setNewOrBu(boolean newOrBu) {
        this.newOrBu = newOrBu;
    }

    public void setExpectedMileage(int expectedMileage) {
        this.expectedMileage = expectedMileage;
    }

    public void show(){
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Тип покрышки: " + (tireType ? "Лето" : "Зима"));
        System.out.println("Радиус: " + radius);
        System.out.println("Ожидаемый пробег: " + expectedMileage);
        System.out.println("Новая или б/У: " + (newOrBu ? "Новая" : "б/у"));
    }
}
