package org.example.naturalObject;

public class Tree {
    private String breed;
    private int height;
    private double trunkGirth;
    private boolean theCullMark;
    private int age;

    public Tree(){

    }

    public Tree(Tree tree){
        this.age = tree.age;
        this.breed = tree.breed;
        this.height = tree.height;
        this.trunkGirth = tree.trunkGirth;
        this.theCullMark = tree.theCullMark;
    }

    public Tree(String breed, int height, double trunkGirth, boolean theCullMark, int age){
        this.age = age;
        this.breed = breed;
        this.height = height;
        this.trunkGirth = trunkGirth;
        this.theCullMark = theCullMark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public int getHeight() {
        return height;
    }

    public double getTrunkGirth() {
        return trunkGirth;
    }

    public boolean isTheCullMark() {
        return theCullMark;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTrunkGirth(double trunkGirth) {
        this.trunkGirth = trunkGirth;
    }

    public void setTheCullMark(boolean theCullMark) {
        this.theCullMark = theCullMark;
    }

    public void show(){
        System.out.println("Порода: " + breed);
        System.out.println("Высота: " + height);
        System.out.println("Обхват ствола: " + trunkGirth);
        System.out.println("Отметка о выбраковке: " + (theCullMark ? "Да" : "Нет"));
        System.out.println("Возраст: " + age);
    }
}
