package org.example.NaturalObject.Star;

import org.example.NaturalObject.NaturalObject;

public class Star extends NaturalObject {
    private double brightness;
    private double diameter;
    private Long distanceFromTheSun;
    private String belongingToTheGalaxy;

    Star(){
        super();
    }

    Star(Star star){
        super(star);
        this.brightness = star.brightness;
        this.diameter = star.diameter;
        this.distanceFromTheSun = star.distanceFromTheSun;
        this.belongingToTheGalaxy = star.belongingToTheGalaxy;
    }

    Star(int age, double brightness, double diameter, Long distanceFromTheSun, String belongingToTheGalaxy){
        super(age);
        this.brightness = brightness;
        this.diameter = diameter;
        this.distanceFromTheSun = distanceFromTheSun;
        this.belongingToTheGalaxy = belongingToTheGalaxy;
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
