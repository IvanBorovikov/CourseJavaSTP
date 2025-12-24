package org.example.university;

import org.example.person.Person;

import java.time.LocalDate;



public class Student extends Person {

    private String faculty;
    private int course;
    private boolean resident;
    private String phone;
    private LocalDate dateOfBirth;

    public Student() {
        super();
    }

    public Student(Student s) {
        super(s);
        this.dateOfBirth = s.dateOfBirth;
        this.faculty = s.faculty;
        this.course = s.course;
        this.resident = s.resident;
        this.phone = s.phone;
    }

    public Student(String lastName, String firstName, String middleName,
                   LocalDate dateOfBirth, String address, String phone,
                   String faculty, int course, boolean resident) {

        super(lastName, firstName, middleName, address);
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.resident = resident;
        this.phone = phone;
    }



    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public boolean getResident() {
        return resident;
    }

    public String getPhone() {
        return phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setNonresident(boolean resident) {
        this.resident = resident;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void show() {

        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Иногородний: " + (resident ? "Нет" : "Да"));
    }

}