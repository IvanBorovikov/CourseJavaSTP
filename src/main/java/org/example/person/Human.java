package org.example.person;

public class Human extends Person {


    protected boolean male;
    protected String education;
    protected int age;



    public Human() {
        super();
    }


    public Human(String lastName, String firstName, String middleName,
                 String address, boolean male, String education, int age) {

        super(lastName, firstName, middleName, address);
        this.male = male;
        this.education = education;
        this.age = age;

    }

    public Human(Human h) {
        super(h);
        this.male = h.male;
        this.education = h.education;
        this.age = h.age;

    }


    public boolean isMale() {
        return male;
    }

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }



    public void setMale(boolean male) {
        this.male = male;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Пол: " + (male ? "Женский" : "Мужской"));
        System.out.println("Образование: " + education);
        System.out.println("Возраст: " + age);

    }


}