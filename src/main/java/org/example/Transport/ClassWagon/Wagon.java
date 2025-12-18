package org.example.Transport.ClassWagon;
// ВАГОН
public class Wagon {
    private String typeOfCarriage;
    private int numberCarriage;
    private int numberSeats;
    private String conductorName;
    private int trainNumber;
    private boolean isConditioner;
    private String operationPeriod;

    Wagon(Wagon r){
        this.typeOfCarriage = r.typeOfCarriage;
        this.numberCarriage = r.numberCarriage;
        this.numberSeats = r.numberSeats;
        this.conductorName = r.conductorName;
        this.trainNumber = r.trainNumber;
        this.isConditioner = r.isConditioner;
        this.operationPeriod = r.operationPeriod;
    }

    Wagon(String typeOfCarriage, int numberCarriage, int numberSeats, String conductorName,
          int trainNumber, boolean isConditioner, String operationPeriod){
        this.typeOfCarriage = typeOfCarriage;
        this.numberCarriage = numberCarriage;
        this.numberSeats = numberSeats;
        this.conductorName = conductorName;
        this.trainNumber = trainNumber;
        this.isConditioner = isConditioner;
        this.operationPeriod = operationPeriod;
    }

    public String getTypeOfCarriage() {
        return typeOfCarriage;
    }

    public void setTypeOfCarriage(String typeOfCarriage) {
        this.typeOfCarriage = typeOfCarriage;
    }

    public int getNumberCarriage() {
        return numberCarriage;
    }

    public void setNumberCarriage(int numberCarriage) {
        this.numberCarriage = numberCarriage;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getConductorName() {
        return conductorName;
    }

    public void setConductorName(String conductorName) {
        this.conductorName = conductorName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public boolean isConditioner() {
        return isConditioner;
    }

    public void setConditioner(boolean conditioner) {
        isConditioner = conditioner;
    }

    public String getOperationPeriod() {
        return operationPeriod;
    }

    public void setOperationPeriod(String operationPeriod) {
        this.operationPeriod = operationPeriod;
    }

    public void show(){
        System.out.println("Тип вагона " + typeOfCarriage);
        System.out.println("Номер вагона: " + numberCarriage);
        System.out.println("число мест в вагоне: " + numberSeats);
        System.out.println("Фамилия проводника: " + conductorName);
        System.out.println("Номер поезда: " + trainNumber);
        System.out.println("Наличие кондиционера: " + isConditioner);
        System.out.println("Срок эксплуатации вагона: " + operationPeriod);
    }
}
