package org.example.commodity;

import java.time.LocalDate;

/*
8.	Класс Товар.
 */
public class Commodity {
    /*
    наименование
     */
    private String name;
    /*
    производитель
     */
    private String manufacturer;
    /*
    цена
     */
    private double price;
    /*
    вес
     */
    private double weight;
    /*
    срок хранения
     */
    private LocalDate shelfLife;
    /*
    количество
     */
    private int count;

    public Commodity(){

    }

    public Commodity(Commodity commodity){
        this.name = commodity.name;
        this.manufacturer = commodity.manufacturer;
        this.price = commodity.price;
        this.weight = commodity.weight;
        this.shelfLife = commodity.shelfLife;
        this.count = commodity.count;
    }

    public Commodity(String name, String manufacturer, double price, double weight,
              LocalDate shelfLife, int count){
        if (name == null){
            throw new IllegalArgumentException("name");
        }

        if (manufacturer == null){
            throw new IllegalArgumentException("manufacturer");
        }

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
