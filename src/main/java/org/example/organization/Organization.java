package org.example.organization;

import java.time.LocalDate;

public class Organization {
    protected String name;
    protected int foundationYear;
    protected Long budget;

    protected Organization(){
    }

    protected Organization(Organization organization){
        this.name = organization.name;
        this.foundationYear = organization.foundationYear;
        this.budget = organization.budget;
    }

    protected Organization(String name, int foundationYear, Long budget){
        this.name = name;
        this.foundationYear = foundationYear;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public Long getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }
}
