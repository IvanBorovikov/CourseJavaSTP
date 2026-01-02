package org.example.property;

public class Apartment {
    private int apartmentNumber;
    private int floorNumber;
    private int numberOfRooms;
    private double totalArea;
    private double livingArea;
    private String ownerLastName;


    public Apartment(){

    }

    public Apartment(Apartment apartment){
        this.ownerLastName = apartment.ownerLastName;
        this.apartmentNumber = apartment.apartmentNumber;
        this.floorNumber = apartment.floorNumber;
        this.numberOfRooms = apartment.numberOfRooms;
        this.totalArea = apartment.totalArea;
        this.livingArea = apartment.livingArea;
    }

    public Apartment(int apartmentNumber, int floorNumber, int numberOfRooms,
              double totalArea, double livingArea, String ownerLastName){
        this.apartmentNumber = apartmentNumber;
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.totalArea = totalArea;
        this.livingArea = livingArea;
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public void show(){
        System.out.println("Номер квартиры: " + apartmentNumber);
        System.out.println("Номер этажа: " + floorNumber);
        System.out.println("Кол-во комнат: " + numberOfRooms);
        System.out.println("НОбщая площадь: " + totalArea);
        System.out.println("Жилая площадь: " + livingArea);
        System.out.println("Фамилия владельца: " + ownerLastName);
    }
}
