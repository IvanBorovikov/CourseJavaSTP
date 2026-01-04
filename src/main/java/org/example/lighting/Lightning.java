package org.example.lighting;

public class Lightning {
    private String lightningId;
    private int zipperLength; //длина молнии
    private double dischargePower; //мощность разряда
    private double distanceFromObserver; //удаленность от наблюдателя
    private double dischargeDuration; //длительность разряда
    private String lastNameObserver; // фамилия наблюдателя

    public Lightning(){

    }

    public Lightning(Lightning lightning){
        this.lightningId = lightning.lightningId;
        this.zipperLength = lightning.zipperLength;
        this.dischargePower = lightning.dischargePower;
        this.distanceFromObserver = lightning.distanceFromObserver;
        this.dischargeDuration = lightning.dischargeDuration;
        this.lastNameObserver = lightning.lastNameObserver;
    }

    public Lightning(String lightningId, int zipperLength, double dischargePower,
              double distanceFromObserver, double dischargeDuration, String lastNameObserver){
        if (lightningId == null){
            throw new IllegalArgumentException("lightningId");
        }

        if (lastNameObserver == null){
            throw new IllegalArgumentException("lastNameObserver");
        }
        this.lightningId = lightningId;
        this.zipperLength = zipperLength;
        this.dischargePower = dischargePower;
        this.distanceFromObserver = distanceFromObserver;
        this.dischargeDuration = dischargeDuration;
        this.lastNameObserver = lastNameObserver;
    }

    public String getLightningId() {
        return lightningId;
    }

    public int getZipperLength() {
        return zipperLength;
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

    public void setLightningId(String lightningId) {
        this.lightningId = lightningId;
    }

    public void setZipperLength(int zipperLength) {
        this.zipperLength = zipperLength;
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
        System.out.println("Идентификатор молнии: " + lightningId);
        System.out.println("Длина молнии: " + zipperLength);
        System.out.println("Мощность разряда: " + dischargePower);
        System.out.println("Удаленность от наблюдателя: " + distanceFromObserver);
        System.out.println("Длительность разряда: " + dischargeDuration);
        System.out.println("Фамилия наблюдателя: " + lastNameObserver);
    }
}
