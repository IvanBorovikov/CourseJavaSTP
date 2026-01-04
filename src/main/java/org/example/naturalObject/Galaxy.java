package org.example.naturalObject;

public class Galaxy {
    private String nameOfTheGalaxy;
    private Long age;
    private Long distanceFromSolarSystem; // расстояние от нее до солнечной системы
    private Long numberOfStarsGalaxy; // количество звезд в галактике
    private double diameterGalaxy; // диаметр галактики

   public Galaxy(){

    }

    public Galaxy(Galaxy galaxy){
        this.age = galaxy.age;
        this.nameOfTheGalaxy = galaxy.nameOfTheGalaxy;
        this.distanceFromSolarSystem = galaxy.distanceFromSolarSystem;
        this.numberOfStarsGalaxy = galaxy.numberOfStarsGalaxy;
        this.diameterGalaxy = galaxy.diameterGalaxy;
    }

    public Galaxy(String nameOfTheGalaxy, Long age, Long distanceFromSolarSystem, Long numberOfStarsGalaxy, double diameterGalaxy){
       if (nameOfTheGalaxy == null){
           throw new IllegalArgumentException("nameOfTheGalaxy");
       }
        this.age = age;
        this.nameOfTheGalaxy = nameOfTheGalaxy;
        this.distanceFromSolarSystem = distanceFromSolarSystem;
        this.numberOfStarsGalaxy = numberOfStarsGalaxy;
        this.diameterGalaxy = diameterGalaxy;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
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

    public void show(){
        System.out.println("Наименование галактики: " + nameOfTheGalaxy);
        System.out.println("Возраст галактики: " + age);
        System.out.println("Расстояние от галактики до солнечной системы: " + distanceFromSolarSystem);
        System.out.println("Количество звезд в галактике: " + numberOfStarsGalaxy);
        System.out.println("Диаметр галактики: " + diameterGalaxy);
    }
}
