package org.example.Person.Applicant;

import org.example.Person.Person;

public class Applicant extends Person {
    private String [] subject;
    private int [] ratings;

    Applicant(){
        super();
    }

    Applicant(Applicant a){
        super(a);
        this.subject = a.subject;
        this.ratings = a.ratings;

    }

    Applicant(String lastName, String firstName, String middleName, String address,
              String subject, int ratings){
        super(lastName, firstName, middleName, address);
        this.subject = new String[]{subject};
        this.ratings = new int[]{ratings};

    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int[] getRatings() {
        return ratings;
    }

    public void setRatings(int[] ratings) {
        this.ratings = ratings;
    }

    public void show(){
        System.out.println("Студент: " + lastName + " " + firstName + " " + middleName);
        //System.out.println("Предметы: " + );
        //System.out.println("Оценки: " + );
    }
}
