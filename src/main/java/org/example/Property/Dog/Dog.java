package org.example.Property.Dog;

import org.example.Property.Property;

public class Dog extends Property {
    private String nickname;
    private String breed;
    private double weight;
    private String color;
    private boolean male;
    private int height;
    private int age;

    Dog(){
        super();
    }

    Dog(Dog dog){
        super(dog);
        this.nickname = dog.nickname;
        this.breed = dog.breed;
        this.weight = dog.weight;
        this.color = dog.color;
        this.male = dog.male;
        this.height = dog.height;
        this.age = dog.age;
    }

    Dog(String nickname, String breed, double weight, String ownerLastName,
        String color, boolean male, int height, int age){
        super(ownerLastName);
        this.nickname = nickname;
        this.breed = breed;
        this.weight = weight;
        this.color = color;
        this.male = male;
        this.height = height;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isMale() {
        return male;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("Кличка: " + nickname);
        System.out.println("Порода: " + breed);
        System.out.println("Вес: " + weight);
        System.out.println("Фамилия хозяина: " + ownerLastName);
        System.out.println("Окрас: " + color);
        System.out.println("Пол: " + (male ? "Мужской" : "Женский"));
        System.out.println("Рост: " + height);
        System.out.println("Возраст: " + age);
    }
}
