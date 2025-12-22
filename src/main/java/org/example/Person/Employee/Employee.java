package org.example.Person.Employee;

import org.example.Person.Person;

public class Employee extends Person {
    private String position;
    private String department;
    private int yearOfEmployment;
    private double salary;

    Employee(){
        super();
    }

    Employee(Employee e){
        super(e);
        this.position = e.position;
        this.department = e.department;
        this.yearOfEmployment = e.yearOfEmployment;
        this.salary = e.salary;
    }

    Employee(String lastName, String firstName, String middleName, String position,
             String department, int yearOfEmployment, int salary){
        super(lastName, firstName, middleName, null);
        this.position = position;
        this.department = department;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;

    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void show(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Должность: " + position);
        System.out.println("Подразделение: " + department);
        System.out.println("Год постуаления на работу: " + yearOfEmployment);
        System.out.println("Зарплата: " + salary);
    }
}
