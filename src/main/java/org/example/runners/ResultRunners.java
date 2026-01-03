package org.example.runners;

import java.time.LocalTime;

public class ResultRunners {
    private String lastNameOfTheAthlete;
    private String country;
    private int age;
    private double raceDistance;
    private LocalTime result;

    public ResultRunners(){

    }

    public ResultRunners(ResultRunners resultRunners){
        this.lastNameOfTheAthlete = resultRunners.lastNameOfTheAthlete;
        this.country = resultRunners.country;
        this.age = resultRunners.age;
        this.raceDistance = resultRunners.raceDistance;
        this.result = resultRunners.result;
    }

    public ResultRunners(String lastNameOfTheAthlete, String country, int age, double raceDistance,
                         LocalTime result){
        this.lastNameOfTheAthlete = lastNameOfTheAthlete;
        this.country = country;
        this.age = age;
        this.raceDistance = raceDistance;
        this.result = result;
    }

    public String getLastNameOfTheAthlete() {
        return lastNameOfTheAthlete;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public double getRaceDistance() {
        return raceDistance;
    }

    public LocalTime getResult() {
        return result;
    }

    public void setLastNameOfTheAthlete(String lastNameOfTheAthlete) {
        this.lastNameOfTheAthlete = lastNameOfTheAthlete;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRaceDistance(double raceDistance) {
        this.raceDistance = raceDistance;
    }

    public void setResult(LocalTime result) {
        this.result = result;
    }

    public void show(){
        System.out.println("Фамилия спортсмена: " + lastNameOfTheAthlete);
        System.out.println("Страна: " + country);
        System.out.println("Возраст спортсмена: " + age);
        System.out.println("Дистанция забега: " + raceDistance);
        System.out.println("Результат: " + result);
    }
}
