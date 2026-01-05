package org.example.person;

public class Employee {
    private String lastName, firstName, middleName;
    /*
    Должность
     */
    private String position;
    /*
    Подразделение
     */
    private String department;
    /*
    Год поступления на работу
     */
    private int yearOfEmployment;
    /*
    Зарплата
     */
    private double salary;

    public Employee(){

    }

    public Employee(Employee e){
        this.lastName = e.lastName;
        this.firstName = e.firstName;
        this.middleName = e.middleName;
        this.position = e.position;
        this.department = e.department;
        this.yearOfEmployment = e.yearOfEmployment;
        this.salary = e.salary;
    }

    public Employee(String lastName, String firstName, String middleName, String position,
             String department, int yearOfEmployment, int salary){
        if (lastName == null){
            throw new IllegalArgumentException("lastName");
        }

        if (firstName == null){
            throw new IllegalArgumentException("firstName");
        }

        if (middleName == null){
            throw new IllegalArgumentException("middleName");
        }

        if (position == null){
            throw new IllegalArgumentException("position");
        }

        if (department == null){
            throw new IllegalArgumentException("department");
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.department = department;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;
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
        System.out.println("Год поступления на работу: " + yearOfEmployment);
        System.out.println("Зарплата: " + salary);
    }
}
