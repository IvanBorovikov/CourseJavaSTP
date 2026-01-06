package org.example.tornado;

public class Tornado {
    /*
    Категория урагана
     */
    private String hurricaneCategory;
    /*
    длительность существования
     */
    private int duration;
    /*
   высота
     */
    private double height;
    /*
    фамилия наблюдателя
     */
    private String lastNameOfTheObserver;
    /*
    наземный/надводный.
     */
    private boolean landOrSurface;

    public Tornado(){

    }

    public Tornado(Tornado tornado){
        this.hurricaneCategory = tornado.hurricaneCategory;
        this.duration = tornado.duration;
        this.height = tornado.height;
        this.lastNameOfTheObserver = tornado.lastNameOfTheObserver;
        this.landOrSurface = tornado.landOrSurface;
    }

    public Tornado(String hurricaneCategory, int duration, double height,
            String lastNameOfTheObserver, boolean landOrSurface){
        if (hurricaneCategory == null){
            throw new IllegalArgumentException("hurricaneCategory");
        }

        if (lastNameOfTheObserver == null){
            throw new IllegalArgumentException("lastNameOfTheObserver");
        }
        this.hurricaneCategory = hurricaneCategory;
        this.duration = duration;
        this.height = height;
        this.lastNameOfTheObserver = lastNameOfTheObserver;
        this.landOrSurface = landOrSurface;
    }

    public String getHurricaneCategory() {
        return hurricaneCategory;
    }

    public int getDuration() {
        return duration;
    }

    public double getHeight() {
        return height;
    }

    public String getLastNameOfTheObserver() {
        return lastNameOfTheObserver;
    }

    public boolean isLandOrSurface() {
        return landOrSurface;
    }

    public void setHurricaneCategory(String hurricaneCategory) {
        this.hurricaneCategory = hurricaneCategory;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLastNameOfTheObserver(String lastNameOfTheObserver) {
        this.lastNameOfTheObserver = lastNameOfTheObserver;
    }

    public void setLandOrSurface(boolean landOrSurface) {
        this.landOrSurface = landOrSurface;
    }

    public void show(){
        System.out.println("Категория урагана: " + hurricaneCategory);
        System.out.println("Длительность существования: " + duration);
        System.out.println("Высота: " + height);
        System.out.println("Фамилия наблюдателя: " + lastNameOfTheObserver);
        System.out.println("Тип торнадо: " + (landOrSurface ? "Наземный" : "Надводный"));
    }
}
