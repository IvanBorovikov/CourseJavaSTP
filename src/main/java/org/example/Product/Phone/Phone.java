package org.example.Product.Phone;

import org.example.Product.Product;

public class Phone extends Product {
    private String model;
    private int memoryCapacity;
    private String bodyColor;
    private double screenDiagonal;


    Phone(){
        super();
    }

    Phone(Phone phone){
        super(phone);
        this.model = phone.model;
        this.memoryCapacity = phone.memoryCapacity;
        this.bodyColor = phone.bodyColor;
        this.screenDiagonal = phone.screenDiagonal;
    }

    Phone(String manufacturer, String model, int memoryCapacity, String bodyColor,
          double screenDiagonal, double power){
        super(manufacturer, power);
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.bodyColor = bodyColor;
        this.screenDiagonal = screenDiagonal;
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

    public void show(){
        System.out.println("Производитель: " + manufacture);
        System.out.println("Модель: " + model);
        System.out.println("Объем памяти: " + memoryCapacity);
        System.out.println("Цвет корпуса: " + bodyColor);
        System.out.println("Диагональ экрана: " + screenDiagonal);
        System.out.println("Емкость аккумулятора: " + power);
    }
}
