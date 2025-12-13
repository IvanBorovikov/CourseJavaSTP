package org.example.Classes.ClassStudents;

import org.example.Arrays.ManagementStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays.*;

public class Students {


    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private boolean nonresident;

    public Students(Students s){
        this.lastName = s.lastName;
        this.firstName = s.firstName;
        this.middleName = s.middleName;
        this.dateOfBirth = s.dateOfBirth;
        this.address = s.address;
        this.phone = s.phone;
        this.faculty = s.faculty;
        this.course = s.course;
        this.nonresident = s.nonresident;

    }

    public Students(String lastName, String firstName, String middleName, String dateOfBirth, String address, String phone, String faculty, int course, boolean nonresident){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.nonresident = nonresident;

    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }



    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;

    }

    public boolean getNonresident(){
        return nonresident;
    }

    public void setNonresident(boolean nonresident) {
        this.nonresident = nonresident;
    }

    public void show(){
        System.out.println(lastName + " " + firstName + " " + middleName);
        System.out.println("Факультет: " + faculty + " Курс: " + course);
        System.out.println("Иногородний: " + nonresident);
    }


}
