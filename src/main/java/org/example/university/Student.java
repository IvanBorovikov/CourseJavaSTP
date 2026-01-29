package org.example.university;

import org.example.person.Person;
import java.time.LocalDate;

public class Student extends Person {


    /*
     * Дата рождения
     */
    private LocalDate dateOfBirth;

    /*
     * Телефон
     */
    private String phone;

    /*
     * Факультет
     */
    private String faculty;

    /*
     * Курс
     */
    private int course;

    /*
     * Иногородний или нет
     */
    private boolean resident;

    public Student() {
        super();
    }

    public Student(Student s) {
        super(s);
        this.dateOfBirth = s.dateOfBirth;
        this.phone = s.phone;
        this.faculty = s.faculty;
        this.course = s.course;
        this.resident = s.resident;
    }

    public Student(String lastName, String firstName, String middleName,
                   String address,
                   LocalDate dateOfBirth, String phone,
                   String faculty, int course, boolean resident) {

        super(lastName, firstName, middleName, address);

        if (phone == null) {
            throw new IllegalArgumentException("phone");
        }

        if (faculty == null) {
            throw new IllegalArgumentException("faculty");
        }

        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.resident = resident;
    }



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public boolean isResident() {
        return resident;
    }



    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }



    public void show() {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Телефон: " + phone);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Иногородний: " + (resident ? "Да" : "Нет"));
    }
}
