package org.example.organization;

import java.time.LocalDate;

public class Area {
    protected String name;
    /*
    дата основания
     */
    protected LocalDate foundationYear;
    protected Long budget;

    protected Area(){
    }

    protected Area(Area area){
        this.name = area.name;
        this.foundationYear = area.foundationYear;
        this.budget = area.budget;
    }

    protected Area(String name, LocalDate foundationYear, Long budget){
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
