package org.example.NaturalObject;

public class NaturalObject {
    protected int age;

    protected NaturalObject(){

    }

    protected NaturalObject(NaturalObject naturalObject){
        this.age = naturalObject.age;
    }

    protected NaturalObject(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
