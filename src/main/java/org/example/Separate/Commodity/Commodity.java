package org.example.Separate.Commodity;

import java.time.LocalDate;

public class Commodity {
    private String name;
    private String manufacturer;
    private double price;
    private double weight;
    private LocalDate shelfLife;
    private int count;

    Commodity(){

    }

    Commodity(Commodity commodity){
        this.name = commodity.name;
        this.manufacturer = commodity.manufacturer;
        this.price = commodity.price;
        this.weight = commodity.weight;
        this.shelfLife = commodity.shelfLife;
        this.count = commodity.count;
    }

    Commodity(String name, String manufacturer, double price, double weight,
              LocalDate shelfLife, int count){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getShelfLife() {
        return shelfLife;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setShelfLife(LocalDate shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void show(){
        System.out.println("Наименование: " + name);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Цена: " + price);
        System.out.println("Вес: " + weight);
        System.out.println("Срок хранения: " + shelfLife);
        System.out.println("Количество: " + count);
    }

}
