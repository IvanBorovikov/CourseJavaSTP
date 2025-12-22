package org.example.NaturalObject.Galaxy;

import org.example.NaturalObject.NaturalObject;

public class Galaxy extends NaturalObject {
    private String nameOfTheGalaxy;
    private Long distanceFromSolarSystem;
    private Long numberOfStarsGalaxy;
    private double diameterGalaxy;

    Galaxy(){
        super();
    }

    Galaxy(Galaxy galaxy){
        super(galaxy);
        this.nameOfTheGalaxy = galaxy.nameOfTheGalaxy;
        this.distanceFromSolarSystem = galaxy.distanceFromSolarSystem;
        this.numberOfStarsGalaxy = galaxy.numberOfStarsGalaxy;
        this.diameterGalaxy = galaxy.diameterGalaxy;
    }

    Galaxy(int age, String nameOfTheGalaxy, Long distanceFromSolarSystem, Long numberOfStarsGalaxy, double diameterGalaxy){
        super(age);
        this.nameOfTheGalaxy = nameOfTheGalaxy;
        this.distanceFromSolarSystem = distanceFromSolarSystem;
        this.numberOfStarsGalaxy = numberOfStarsGalaxy;
        this.diameterGalaxy = diameterGalaxy;
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
