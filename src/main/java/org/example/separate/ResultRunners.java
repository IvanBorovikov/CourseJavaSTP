package org.example.separate;

public class ResultRunners {
    private String lastNameOfTheAthlete;
    private String country;
    private int age;
    private int raceDistance;
    private boolean result;

    ResultRunners(){

    }

    ResultRunners(ResultRunners resultRunners){
        this.lastNameOfTheAthlete = resultRunners.lastNameOfTheAthlete;
        this.country = resultRunners.country;
        this.age = resultRunners.age;
        this.raceDistance = resultRunners.raceDistance;
        this.result = resultRunners.result;
    }

    ResultRunners(String lastNameOfTheAthlete, String country, int age, int raceDistance,
                  boolean result){
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

    public int getRaceDistance() {
        return raceDistance;
    }

    public boolean isResult() {
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

    public void setRaceDistance(int raceDistance) {
        this.raceDistance = raceDistance;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void show(){
        System.out.println("Фамилия спортсмена: " + lastNameOfTheAthlete);
        System.out.println("Страна: " + country);
        System.out.println("Возраст спортсмена: " + age);
        System.out.println("Дистанция забега: " + raceDistance);
        System.out.println("Результат: " + (result ? "Успех" : "Провален"));
    }
}
