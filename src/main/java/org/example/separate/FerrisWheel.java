package org.example.separate;

import java.sql.Time;
import java.time.Year;

public class FerrisWheel {
    private String nameWheel;
    private String wheelHeight;
    private Time theDurationOfCompleteRevolution;
    private int numberOfSeats;
    private String nameOwner;
    private Year yearOfConstruction;

    FerrisWheel(){

    }

    FerrisWheel(FerrisWheel ferrisWheel){
        this.nameWheel = ferrisWheel.nameWheel;
        this.wheelHeight = ferrisWheel.wheelHeight;
        this.theDurationOfCompleteRevolution = ferrisWheel.theDurationOfCompleteRevolution;
        this.numberOfSeats = ferrisWheel.numberOfSeats;
        this.nameOwner = ferrisWheel.nameOwner;
        this.yearOfConstruction = ferrisWheel.yearOfConstruction;
    }

    FerrisWheel(String nameWheel, String wheelHeight, Time theDurationOfCompleteRevolution,
                int numberOfSeats, String nameOwner, Year yearOfConstruction){
        this.nameWheel = nameWheel;
        this.wheelHeight = wheelHeight;
        this.theDurationOfCompleteRevolution = theDurationOfCompleteRevolution;
        this.numberOfSeats = numberOfSeats;
        this.nameOwner = nameOwner;
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getNameWheel() {
        return nameWheel;
    }

    public String getWheelHeight() {
        return wheelHeight;
    }

    public Time getTheDurationOfCompleteRevolution() {
        return theDurationOfCompleteRevolution;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public Year getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setNameWheel(String nameWheel) {
        this.nameWheel = nameWheel;
    }

    public void setWheelHeight(String wheelHeight) {
        this.wheelHeight = wheelHeight;
    }

    public void setTheDurationOfCompleteRevolution(Time theDurationOfCompleteRevolution) {
        this.theDurationOfCompleteRevolution = theDurationOfCompleteRevolution;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setYearOfConstruction(Year yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public void show(){
        System.out.println("Наименование колеса: " + nameWheel);
        System.out.println("Высота колеса: " + wheelHeight);
        System.out.println("Длительность полного оборота: " + theDurationOfCompleteRevolution);
        System.out.println("Кол-во мест: " + numberOfSeats);
        System.out.println("Наименование владельца: " + nameOwner);
        System.out.println("Год постройки: " + yearOfConstruction);
    }
}
