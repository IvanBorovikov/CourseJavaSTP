package org.example.person;

public enum Sex {
    MALE("Мужчина"),
    FEMALE("Женщина");

    private final String gender;

    Sex(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
