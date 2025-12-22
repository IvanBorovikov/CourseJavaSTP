package org.example.Organization.City;

import org.example.Organization.Organization;

import java.time.LocalDate;

public class City extends Organization {
    private Long numberOfInhabitants;
    private String lastNameOfGovernor;


    City(){
        super();
    }

    City(City city){
        super(city);
        this.numberOfInhabitants = city.numberOfInhabitants;
        this.lastNameOfGovernor = city.lastNameOfGovernor;
    }

    City(String name, Long numberOfInhabitants, LocalDate foundationYear, String lastNameOfGovernor, double budget){
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
        System.out.println("Фамилия губернатора: " + lastNameOfGovernor);
    }
}
