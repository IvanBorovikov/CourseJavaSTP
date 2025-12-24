package org.example.organization;

import java.time.LocalDate;

public class Organization {
    protected String name;
    protected LocalDate foundationYear;
    protected double budget;

    protected Organization(){
    }

    protected Organization(Organization organization){
        this.name = organization.name;
        this.foundationYear = organization.foundationYear;
        this.budget = organization.budget;
    }

    protected Organization(String name, LocalDate foundationYear, double budget){
        this.name = name;
        this.foundationYear = foundationYear;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public double getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
