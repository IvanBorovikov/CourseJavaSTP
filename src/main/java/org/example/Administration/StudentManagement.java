package org.example.Administration;
import org.example.Person.Student.Student;


import java.time.LocalDate;
import java.util.ArrayList;

public class StudentManagement {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void showFaculty(String faculty){
        boolean found = false;
        for (Student s : students){
            if (s.getFaculty().contains(faculty)){
                found = true;
                System.out.println("ФИО : " + s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
            }
        }
        if (!found){
            System.out.println("Студентов на таком факультете - нет");
        }
    }
    public static void showFacultyCourse(String faculty, int course){
        for (Student s : students){
            if (s.getFaculty().contains(faculty) && s.getCourse() == course){
                System.out.println("ФИО : " + s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
            }
        }

    }

    public static void showResident(boolean resident){
        boolean found = false;
        for (Student s : students){
            if (s.getResident() == resident && resident != found){
                System.out.println("Да");
            }

        }
        for (Student s : students){
            if (s.getResident() == resident && resident == found){
                System.out.println("Нет");
            }
        }




    }
    public static void main(String[] args) {

        students.add(new Student("Borowikov", "Ivan", "Alekseevich", LocalDate.of(1999, 1, 20), "Ул. Новосёлов", "89081461708", "Информационная безопасность", 3, true));
        students.add(new Student("Volkov", "Valery", "Olegovich", LocalDate.of(1929, 4, 20), "Ул. Пушкина", "88007767667", "Архитектура", 3, false));
        students.add(new Student("Volkov", "Petr", "Olegovich", LocalDate.of(1939, 2, 20), "Ул. Пушкина", "88007767667", "Архитектура", 3, false));


        showResident(true);

    }
}
