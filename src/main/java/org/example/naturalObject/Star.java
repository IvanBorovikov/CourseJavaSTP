package org.example.naturalObject;

public class Star {
    private int age;
    private double brightness;
    private double diameter;
    private Long distanceFromTheSun;
    private String belongingToTheGalaxy;

    public Star(){

    }

    public Star(Star star){
        this.age = star.age;
        this.brightness = star.brightness;
        this.diameter = star.diameter;
        this.distanceFromTheSun = star.distanceFromTheSun;
        this.belongingToTheGalaxy = star.belongingToTheGalaxy;
    }

    public Star(int age, double brightness, double diameter, Long distanceFromTheSun, String belongingToTheGalaxy){
        this.age = age;
        this.brightness = brightness;
        this.diameter = diameter;
        this.distanceFromTheSun = distanceFromTheSun;
        this.belongingToTheGalaxy = belongingToTheGalaxy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBrightness() {
        return brightness;
    }

    public double getDiameter() {
        return diameter;
    }

    public Long getDistanceFromTheSun() {
        return distanceFromTheSun;
    }

    public String getBelongingToTheGalaxy() {
        return belongingToTheGalaxy;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setDistanceFromTheSun(Long distanceFromTheSun) {
        this.distanceFromTheSun = distanceFromTheSun;
    }

    public void setBelongingToTheGalaxy(String belongingToTheGalaxy) {
        this.belongingToTheGalaxy = belongingToTheGalaxy;
    }

    public void show(){
        System.out.println("Возраст: " + age);
        System.out.println("Яркость: " + brightness);
        System.out.println("Диаметр: " + diameter);
        System.out.println("Удаленность от Солнца: " + distanceFromTheSun);
        System.out.println("Принадлежность галактике: " + belongingToTheGalaxy);
    }
}
