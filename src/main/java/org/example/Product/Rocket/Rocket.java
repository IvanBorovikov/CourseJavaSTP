package org.example.Product.Rocket;

import org.example.Product.Product;

public class Rocket extends Product {
    private int range;
    private double guaranteedAccuracyInMeters;
    private int numberOfWarheads;
    private double warheadPower;

    Rocket(){
        super();
    }

    Rocket(Rocket rocket){
        super(rocket);
        this.range = rocket.range;
        this.guaranteedAccuracyInMeters = rocket.guaranteedAccuracyInMeters;
        this.numberOfWarheads = rocket.numberOfWarheads;
        this.warheadPower = rocket.warheadPower;
    }

    Rocket(String manufacturer, double power, int range,
           double guaranteedAccuracyInMeters, int numberOfWarheads, double warheadPower){
        super(manufacturer, power);
        this.range = range;
        this.guaranteedAccuracyInMeters = guaranteedAccuracyInMeters;
        this.numberOfWarheads = numberOfWarheads;
        this.warheadPower = warheadPower;
    }

    public int getRange() {
        return range;
    }

    public double getGuaranteedAccuracyInMeters() {
        return guaranteedAccuracyInMeters;
    }

    public int getNumberOfWarheads() {
        return numberOfWarheads;
    }

    public double getWarheadPower() {
        return warheadPower;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setGuaranteedAccuracyInMeters(double guaranteedAccuracyInMeters) {
        this.guaranteedAccuracyInMeters = guaranteedAccuracyInMeters;
    }

    public void setNumberOfWarheads(int numberOfWarheads) {
        this.numberOfWarheads = numberOfWarheads;
    }

    public void setWarheadPower(double warheadPower) {
        this.warheadPower = warheadPower;
    }

    public void show(){
        System.out.println("Производитель: " + manufacture);
        System.out.println("Мощность двигателя: " + power);
        System.out.println("Дальность: " + range);
        System.out.println("Гарантированная точность: " + guaranteedAccuracyInMeters);
        System.out.println("Кол-во боеголовок: " + numberOfWarheads);
        System.out.println("Мощность боеголовок: " + warheadPower);
    }
}
