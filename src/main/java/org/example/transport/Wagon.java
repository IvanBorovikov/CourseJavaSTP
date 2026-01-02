package org.example.transport;

public class Wagon {
    private String typeOfCarriage;
    private String numberOfTransport;
    private int numberSeats;
    private String conductorName;
    private String trainNumber;
    private boolean isConditioner;
    private int operationPeriod;

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

    public Wagon(String typeOfCarriage, String numberOfTransport, int numberSeats, String conductorName,
          String trainNumber, boolean isConditioner, int operationPeriod){
        this.typeOfCarriage = typeOfCarriage;
        this.numberOfTransport = numberOfTransport;
        this.numberSeats = numberSeats;
        this.conductorName = conductorName;
        this.trainNumber = trainNumber;
        this.isConditioner = isConditioner;
        this.operationPeriod = operationPeriod;
    }

    public String getNumberOfTransport() {
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

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public boolean isConditioner() {
        return isConditioner;
    }

    public void setConditioner(boolean conditioner) {
        isConditioner = conditioner;
    }

    public int getOperationPeriod() {
        return operationPeriod;
    }

    public void setOperationPeriod(int operationPeriod) {
        this.operationPeriod = operationPeriod;
    }

    public void setNumberOfTransport(String numberOfTransport) {
        this.numberOfTransport = numberOfTransport;
    }

    public void show(){
        System.out.println("Тип вагона: " + typeOfCarriage);
        System.out.println("Номер вагона: " + numberOfTransport);
        System.out.println("число мест в вагоне: " + numberSeats);
        System.out.println("Фамилия проводника: " + conductorName);
        System.out.println("Номер поезда: " + trainNumber);
        System.out.println("Наличие кондиционера: " + (isConditioner ? "Да" : "Нет"));
        System.out.println("Срок эксплуатации вагона: " + operationPeriod);
    }
}
