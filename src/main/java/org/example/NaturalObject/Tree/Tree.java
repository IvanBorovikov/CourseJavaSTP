package org.example.NaturalObject.Tree;

import org.example.NaturalObject.NaturalObject;

public class Tree extends NaturalObject {
    private String breed;
    private int height;
    private double trunkGirth;
    private boolean theCullMark;

    Tree(){
        super();
    }

    Tree(Tree tree){
        super(tree);
        this.breed = tree.breed;
        this.height = tree.height;
        this.trunkGirth = tree.trunkGirth;
        this.theCullMark = tree.theCullMark;
    }

    Tree(int age, String breed, int height, double trunkGirth, boolean theCullMark){
        super(age);
        this.breed = breed;
        this.height = height;
        this.trunkGirth = trunkGirth;
        this.theCullMark = theCullMark;
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
        System.out.println("Возраст: " + age);
        System.out.println("Порода: " + breed);
        System.out.println("Высота: " + height);
        System.out.println("Обхват ствола: " + trunkGirth);
        System.out.println("Отметка о выбраковке: " + (theCullMark ? "Нет" : "Да"));
    }
}
