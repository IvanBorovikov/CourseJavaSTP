package org.example.university;

import org.example.person.Person;

import java.util.Arrays;

public class Applicant extends Person {
    /*
    Предмет
     */
    private String[] subject;
    /*
    Оценка
     */
    private int[] grades;

    public Applicant(){
        super();
    }

    public Applicant(Applicant a){
        super(a);
        this.subject = a.subject.clone();
        this.grades = a.grades.clone();

    }

    public Applicant(String lastName, String firstName, String middleName, String address,
              String []subject, int [] grades){
        super(lastName, firstName, middleName, address);
        this.subject = subject;
        this.grades = grades;

    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = new String[0];
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = new int[0];
    }

    public void show(){
        System.out.println("Студент: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Предметы: " + Arrays.toString(subject));
        System.out.println("Оценки: " + Arrays.toString(grades));
        System.out.println();
    }
}
