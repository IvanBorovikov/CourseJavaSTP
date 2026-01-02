package org.example.product;

public class Rocket {
    private String manufacturer;
    private int enginePower;
    private int range;
    private int guaranteedAccuracyInMeters;
    private int numberOfWarheads;
    private int warheadPower;

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

    public Rocket(String manufacturer, int   enginePower, int range,
           int guaranteedAccuracyInMeters, int numberOfWarheads, int warheadPower){
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

    public int getPower() {
        return enginePower;
    }

    public int getRange() {
        return range;
    }

    public int getGuaranteedAccuracyInMeters() {
        return guaranteedAccuracyInMeters;
    }

    public int getNumberOfWarheads() {
        return numberOfWarheads;
    }

    public int getWarheadPower() {
        return warheadPower;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setGuaranteedAccuracyInMeters(int guaranteedAccuracyInMeters) {
        this.guaranteedAccuracyInMeters = guaranteedAccuracyInMeters;
    }

    public void setNumberOfWarheads(int numberOfWarheads) {
        this.numberOfWarheads = numberOfWarheads;
    }

    public void setWarheadPower(int warheadPower) {
        this.warheadPower = warheadPower;
    }

    public void setManufacture(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower(int enginePower) {
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
