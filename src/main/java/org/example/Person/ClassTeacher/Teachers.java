package org.example.Person.ClassTeacher;

import org.example.Person.Person;

public class Teachers extends Person {
    private String post;
    private String department;
    private String object;

    Teachers(){
        super();
    }

    Teachers(Teachers teachers){
        super(teachers);
        this.post = teachers.post;
        this.department = teachers.department;
        this.object = teachers.object;
    }

    Teachers(String lastName, String firstName, String middleName, String post,
             String department, String object){
        super(lastName, firstName, middleName, null);
        this.post = post;
        this.department = department;
        this.object = object;

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
