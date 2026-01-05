package org.example.organization;

import java.time.LocalDate;

public class Country extends Organization {
    /*
    Площадь территории
     */
    private Long areaOfTerritory;
    /*
    количество граждан
     */
    private Long numberOfCitizens;
    /*
    фамилия президента
     */
    private String lastNameOfPresident;

    Country(){
        super();
    }

    Country(Country country){
        super(country);
        this.areaOfTerritory = country.areaOfTerritory;
        this.numberOfCitizens = country.numberOfCitizens;
        this.lastNameOfPresident = country.lastNameOfPresident;
    }

    Country(String name, Long areaOfTerritory, Long numberOfCitizens, Long budget, LocalDate foundationYear, String lastNameOfPresident){
        super(name, foundationYear, budget);
        if (lastNameOfPresident == null){
            throw new IllegalArgumentException("lastNameOfPresident");
        }
        this.areaOfTerritory = areaOfTerritory;
        this.numberOfCitizens = numberOfCitizens;
        this.lastNameOfPresident = lastNameOfPresident;
    }

    public Long getAreaOfTerritory() {
        return areaOfTerritory;
    }

    public Long getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public String getLastNameOfPresident() {
        return lastNameOfPresident;
    }

    public void setAreaOfTerritory(Long areaOfTerritory) {
        this.areaOfTerritory = areaOfTerritory;
    }

    public void setNumberOfCitizens(Long numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
    }

    public void setLastNameOfPresident(String lastNameOfPresident) {
        this.lastNameOfPresident = lastNameOfPresident;
    }

    public void show(){
        System.out.println("Наименование страны: " + name);
        System.out.println("Площадь территории: " + areaOfTerritory);
        System.out.println("Кол-во граждан: " + numberOfCitizens);
        System.out.println("Бюджет страны: " + budget);
        System.out.println("Год основания: " + foundationYear);
        System.out.println("Фамилия президента: " + lastNameOfPresident);
    }
}
