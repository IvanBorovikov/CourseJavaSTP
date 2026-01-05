package org.example.lighting;

public class Lightning {
    private String id;
    /*
    длина молнии
     */
    private int length;
    /*
    мощность разряда
     */
    private double dischargePower;
    /*
    удаленность от наблюдателя
     */
    private double distanceFromObserver;
    /*
    длительность разряда
     */
    private double dischargeDuration;
    /*
    фамилия наблюдателя
     */
    private String lastNameObserver;

    public Lightning(){

    }

    public Lightning(Lightning lightning){
        this.id = lightning.id;
        this.length = lightning.length;
        this.dischargePower = lightning.dischargePower;
        this.distanceFromObserver = lightning.distanceFromObserver;
        this.dischargeDuration = lightning.dischargeDuration;
        this.lastNameObserver = lightning.lastNameObserver;
    }

    public Lightning(String id, int length, double dischargePower,
                     double distanceFromObserver, double dischargeDuration, String lastNameObserver){
        if (id == null){
            throw new IllegalArgumentException("lightningId");
        }

        if (lastNameObserver == null){
            throw new IllegalArgumentException("lastNameObserver");
        }
        this.id = id;
        this.length = length;
        this.dischargePower = dischargePower;
        this.distanceFromObserver = distanceFromObserver;
        this.dischargeDuration = dischargeDuration;
        this.lastNameObserver = lastNameObserver;
    }

    public String getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public double getDischargePower() {
        return dischargePower;
    }

    public double getDistanceFromObserver() {
        return distanceFromObserver;
    }

    public double getDischargeDuration() {
        return dischargeDuration;
    }

    public String getLastNameObserver() {
        return lastNameObserver;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDischargePower(double dischargePower) {
        this.dischargePower = dischargePower;
    }

    public void setDistanceFromObserver(double distanceFromObserver) {
        this.distanceFromObserver = distanceFromObserver;
    }

    public void setDischargeDuration(double dischargeDuration) {
        this.dischargeDuration = dischargeDuration;
    }

    public void setLastNameObserver(String lastNameObserver) {
        this.lastNameObserver = lastNameObserver;
    }

    public void show(){
        System.out.println("Идентификатор молнии: " + id);
        System.out.println("Длина молнии: " + length);
        System.out.println("Мощность разряда: " + dischargePower);
        System.out.println("Удаленность от наблюдателя: " + distanceFromObserver);
        System.out.println("Длительность разряда: " + dischargeDuration);
        System.out.println("Фамилия наблюдателя: " + lastNameObserver);
    }
}
