package org.example.person;

public abstract class Person {
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String address;

    protected Person(){

    }

    protected Person(String lastName, String firstName, String middleName, String address){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
    }

    protected Person(Person p){
        this.lastName = p.lastName;
        this.firstName = p.firstName;
        this.middleName = p.middleName;
        this.address = p.address;
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

    public String getAddress() {
        return address;
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


    public void setAddress(String address) {
        this.address = address;
    }

}

