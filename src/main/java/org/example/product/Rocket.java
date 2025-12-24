package org.example.product;

public class Rocket {
    private String manufacturer;
    private double enginePower;
    private int range;
    private double guaranteedAccuracyInMeters;
    private int numberOfWarheads;
    private double warheadPower;

    public Rocket(){

    }

    public Rocket(Rocket rocket){
        this.manufacturer = rocket.manufacturer;
        this.enginePower = rocket.enginePower;
        this.range = rocket.range;
        this.guaranteedAccuracyInMeters = rocket.guaranteedAccuracyInMeters;
        this.numberOfWarheads = rocket.numberOfWarheads;
        this.warheadPower = rocket.warheadPower;
    }

    public Rocket(String manufacturer, double enginePower, int range,
           double guaranteedAccuracyInMeters, int numberOfWarheads, double warheadPower){
        this.manufacturer = manufacturer;
        this.enginePower = enginePower;
        this.range = range;
        this.guaranteedAccuracyInMeters = guaranteedAccuracyInMeters;
        this.numberOfWarheads = numberOfWarheads;
        this.warheadPower = warheadPower;
    }

    public String getManufacture() {
        return manufacturer;
    }

    public double getPower() {
        return enginePower;
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

    public void setManufacture(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void show(){
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Мощность двигателя: " + enginePower);
        System.out.println("Дальность: " + range);
        System.out.println("Гарантированная точность: " + guaranteedAccuracyInMeters);
        System.out.println("Кол-во боеголовок: " + numberOfWarheads);
        System.out.println("Мощность боеголовок: " + warheadPower);
    }
}
