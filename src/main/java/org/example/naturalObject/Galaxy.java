package org.example.naturalObject;

public class Galaxy {
    private int age;
    private String nameOfTheGalaxy;
    private Long distanceFromSolarSystem;
    private Long numberOfStarsGalaxy;
    private double diameterGalaxy;

   public Galaxy(){

    }

    public Galaxy(Galaxy galaxy){
        this.age = galaxy.age;
        this.nameOfTheGalaxy = galaxy.nameOfTheGalaxy;
        this.distanceFromSolarSystem = galaxy.distanceFromSolarSystem;
        this.numberOfStarsGalaxy = galaxy.numberOfStarsGalaxy;
        this.diameterGalaxy = galaxy.diameterGalaxy;
    }

    public Galaxy(int age, String nameOfTheGalaxy, Long distanceFromSolarSystem, Long numberOfStarsGalaxy, double diameterGalaxy){
        this.age = age;
        this.nameOfTheGalaxy = nameOfTheGalaxy;
        this.distanceFromSolarSystem = distanceFromSolarSystem;
        this.numberOfStarsGalaxy = numberOfStarsGalaxy;
        this.diameterGalaxy = diameterGalaxy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfTheGalaxy() {
        return nameOfTheGalaxy;
    }

    public Long getDistanceFromSolarSystem() {
        return distanceFromSolarSystem;
    }

    public Long getNumberOfStarsGalaxy() {
        return numberOfStarsGalaxy;
    }

    public double getDiameterGalaxy() {
        return diameterGalaxy;
    }

    public void setNameOfTheGalaxy(String nameOfTheGalaxy) {
        this.nameOfTheGalaxy = nameOfTheGalaxy;
    }

    public void setDistanceFromSolarSystem(Long distanceFromSolarSystem) {
        this.distanceFromSolarSystem = distanceFromSolarSystem;
    }

    public void setNumberOfStarsGalaxy(Long numberOfStarsGalaxy) {
        this.numberOfStarsGalaxy = numberOfStarsGalaxy;
    }

    public void setDiameterGalaxy(double diameterGalaxy) {
        this.diameterGalaxy = diameterGalaxy;
    }
}
