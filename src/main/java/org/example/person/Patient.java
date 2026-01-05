package org.example.person;

public class Patient extends Person {
    /*
    номер медицинской карты
     */
    private int medicalCardNumber;
    /*
    Диагноз
     */
    private String diagnosis;
    /*
    фамилия лечащего врача
     */
    private String lastNameOfTheAttendingPhysician;

    public Patient(){
        super();
    }

    public Patient(Patient patient){
        super(patient);
        this.medicalCardNumber = patient.medicalCardNumber;
        this.diagnosis = patient.diagnosis;
        this.lastNameOfTheAttendingPhysician = patient.lastNameOfTheAttendingPhysician;
    }

    public Patient(String lastName, String firstName, String middleName,
            String address, int medicalCardNumber, String diagnosis, String lastNameOfTheAttendingPhysician){
        super(lastName, firstName, middleName, address);
        if (diagnosis == null){
            throw new IllegalArgumentException("diagnosis");
        }

        if (lastNameOfTheAttendingPhysician == null){
            throw new IllegalArgumentException("lastNameOfTheAttendingPhysician");
        }

        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
        this.lastNameOfTheAttendingPhysician = lastNameOfTheAttendingPhysician;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getLastNameOfTheAttendingPhysician() {
        return lastNameOfTheAttendingPhysician;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setLastNameOfTheAttendingPhysician(String lastNameOfTheAttendingPhysician) {
        this.lastNameOfTheAttendingPhysician = lastNameOfTheAttendingPhysician;
    }

    public void show(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Номер медицинской карты: " + medicalCardNumber);
        System.out.println("Диагноз: " + diagnosis);
        System.out.println("Лечащий врач: " + lastNameOfTheAttendingPhysician);
    }
}
