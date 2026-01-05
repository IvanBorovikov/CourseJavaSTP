package org.example.organization;

import java.time.LocalDate;

public class Organization {
    protected String name;
    /*
    дата основания
     */
    protected LocalDate foundationYear;
    protected Long budget;

    protected Organization(){
    }

    protected Organization(Organization organization){
        this.name = organization.name;
        this.foundationYear = organization.foundationYear;
        this.budget = organization.budget;
    }

    protected Organization(String name, LocalDate foundationYear, Long budget){
        if (name == null){
            throw new IllegalArgumentException("name");
        }
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

    public Long getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }
}
