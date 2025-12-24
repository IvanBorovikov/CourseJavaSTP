package org.example.transport;

public class Wagon {
    private String typeOfCarriage;
    private int numberOfTransport;
    private int numberSeats;
    private String conductorName;
    private int trainNumber;
    private boolean isConditioner;
    private String operationPeriod;

    public Wagon(){

    }

    public Wagon(Wagon wagon){
        this.typeOfCarriage = wagon.typeOfCarriage;
        this.numberOfTransport = wagon.numberOfTransport;
        this.numberSeats = wagon.numberSeats;
        this.conductorName = wagon.conductorName;
        this.trainNumber = wagon.trainNumber;
        this.isConditioner = wagon.isConditioner;
        this.operationPeriod = wagon.operationPeriod;
    }

    public Wagon(String typeOfCarriage, int numberOfTransport, int numberSeats, String conductorName,
          int trainNumber, boolean isConditioner, String operationPeriod){
        this.typeOfCarriage = typeOfCarriage;
        this.numberOfTransport = numberOfTransport;
        this.numberSeats = numberSeats;
        this.conductorName = conductorName;
        this.trainNumber = trainNumber;
        this.isConditioner = isConditioner;
        this.operationPeriod = operationPeriod;
    }

    public int getNumberOfTransport() {
        return numberOfTransport;
    }

    public String getTypeOfCarriage() {
        return typeOfCarriage;
    }

    public void setTypeOfCarriage(String typeOfCarriage) {
        this.typeOfCarriage = typeOfCarriage;
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

    public void setNumberOfTransport(int numberOfTransport) {
        this.numberOfTransport = numberOfTransport;
    }

    public void show(){
        System.out.println("Тип вагона " + typeOfCarriage);
        System.out.println("Номер вагона: " + numberOfTransport);
        System.out.println("число мест в вагоне: " + numberSeats);
        System.out.println("Фамилия проводника: " + conductorName);
        System.out.println("Номер поезда: " + trainNumber);
        System.out.println("Наличие кондиционера: " + isConditioner);
        System.out.println("Срок эксплуатации вагона: " + operationPeriod);
    }
}
