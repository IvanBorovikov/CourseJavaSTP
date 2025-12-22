package org.example.Product;

import java.time.Year;

public class Product {
    protected String manufacture;
    protected double power;

    protected Product(){

    }

    protected Product(Product product){
        this.manufacture = product.manufacture;
        this.power = product.power;
    }

    protected Product(String manufacture, double price){
        this.manufacture = manufacture;
        this.power = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getPower() {
        return power;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPower(double power) {
        this.power = power;
    }


}
