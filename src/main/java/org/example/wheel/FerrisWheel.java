package org.example.wheel;

public class FerrisWheel {
    /*
    Наименование колеса
     */
    private String nameWheel;
    /*
    высота колеса
     */
    private int wheelHeight;
    /*
   длительность полного оборота(минуты)
     */
    private int theDurationOfCompleteRevolution;
    /*
    количество мест
     */
    private int numberOfSeats;
    /*
  наименование владельца
     */
    private String nameOwner;
    /*
    год постройки.
     */
    private int yearOfConstruction;

    public FerrisWheel(){

    }

    public FerrisWheel(FerrisWheel ferrisWheel){
        this.nameWheel = ferrisWheel.nameWheel;
        this.wheelHeight = ferrisWheel.wheelHeight;
        this.theDurationOfCompleteRevolution = ferrisWheel.theDurationOfCompleteRevolution;
        this.numberOfSeats = ferrisWheel.numberOfSeats;
        this.nameOwner = ferrisWheel.nameOwner;
        this.yearOfConstruction = ferrisWheel.yearOfConstruction;
    }

    public FerrisWheel(String nameWheel, int wheelHeight, int theDurationOfCompleteRevolution,
                int numberOfSeats, String nameOwner, int yearOfConstruction){
        if (nameWheel == null){
            throw new IllegalArgumentException("nameWheel");
        }

        if (nameOwner == null){
            throw new IllegalArgumentException("nameOwner");
        }

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

    public int getWheelHeight() {
        return wheelHeight;
    }

    public int getTheDurationOfCompleteRevolution() {
        return theDurationOfCompleteRevolution;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setNameWheel(String nameWheel) {
        this.nameWheel = nameWheel;
    }

    public void setWheelHeight(int wheelHeight) {
        this.wheelHeight = wheelHeight;
    }

    public void setTheDurationOfCompleteRevolution(int theDurationOfCompleteRevolution) {
        this.theDurationOfCompleteRevolution = theDurationOfCompleteRevolution;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
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
