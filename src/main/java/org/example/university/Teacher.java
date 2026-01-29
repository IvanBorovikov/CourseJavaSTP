package org.example.university;

import org.example.person.Person;

public class Teacher {
    private String lastName, firstName, middleName;
    /*
     Должность
     */
    private String post;
    /*
     Кафедра
     */
    private String department;
    /*
    Предмет
     */
    private String object;

    public Teacher(){

    }

    public Teacher(Teacher teacher){
        this.lastName = teacher.lastName;
        this.firstName = teacher.firstName;
        this.middleName = teacher.middleName;
        this.post = teacher.post;
        this.department = teacher.department;
        this.object = teacher.object;
    }

    public Teacher(String lastName, String firstName, String middleName, String post,
            String department, String object){
        if (lastName == null){
            throw new IllegalArgumentException("lastName");
        }

        if (firstName == null){
            throw new IllegalArgumentException("firstName");
        }

        if (middleName == null){
            throw new IllegalArgumentException("middleName");
        }

        if (post == null){
            throw new IllegalArgumentException("post");
        }

        if (department == null){
            throw new IllegalArgumentException("department");
        }

        if (object == null){
            throw new IllegalArgumentException("object");
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.post = post;
        this.department = department;
        this.object = object;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPost() {
        return post;
    }

    public String getDepartment() {
        return department;
    }

    public String getObject() {
        return object;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setObject(String object) {
        this.object = object;
    }


    public void show(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Должность: " + post);
        System.out.println("Кафедра: " + post);
        System.out.println("Предмет: " + object);
    }
}
