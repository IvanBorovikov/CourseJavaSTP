package org.example.organization;

import java.time.LocalDate;

public class City extends Area {
    /*
    количество жителей
     */
    private Long numberOfInhabitants;
    /*
    фамилия губернатора
     */
    private String lastNameOfGovernor;


    public City(){
        super();
    }

    public City(City city){
        super(city);
        this.numberOfInhabitants = city.numberOfInhabitants;
        this.lastNameOfGovernor = city.lastNameOfGovernor;
    }

    public City(String name, Long numberOfInhabitants, LocalDate foundationYear, String lastNameOfGovernor, Long budget){
        super(name, foundationYear, budget);
        this.numberOfInhabitants = numberOfInhabitants;
        this.lastNameOfGovernor = lastNameOfGovernor;
    }

    public Long getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public String getLastNameOfGovernor() {
        return lastNameOfGovernor;
    }

    public void setNumberOfInhabitants(Long numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public void setLastNameOfGovernor(String lastNameOfGovernor) {
        this.lastNameOfGovernor = lastNameOfGovernor;
    }

    public void show(){
        System.out.println("Наименование города: " + name);
        System.out.println("Кол-во жителей: " + numberOfInhabitants);
        System.out.println("Дата основания: " + foundationYear);
        System.out.println("Фамилия губернатора: " + lastNameOfGovernor);
    }
}
