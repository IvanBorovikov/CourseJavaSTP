package org.example.university;


import java.time.LocalDate;
import java.util.ArrayList;

public class StudentManagement {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void showFaculty(String faculty){
        boolean found = false;
        for (Student s : students){
            if (s.getFaculty().equals(faculty)){
                found = true;
                String str = String.format("ФИО: %s", s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
                System.out.println(str);
            }
        }
        if (!found){
            System.out.println("Студентов на таком факультете - нет");
        }
    }
    public static void showFacultyCourse(String faculty, int course){
        for (Student s : students){
            if (s.getFaculty().equals(faculty) && s.getCourse() == course){
                String str = String.format("ФИО: %s", s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
                System.out.println(str);
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

        students.add(new Student("Боровиков", "Иван", "Алексеевич", LocalDate.of(1999, 1, 20), "Ул. Новосёлов", "89081461708", "Информационная безопасность", 3, true));
        students.add(new Student("Волков", "Валерий", "Олегович", LocalDate.of(1929, 4, 20), "Ул. Пушкина", "88007767667", "Архитектура", 3, false));
        students.add(new Student("Волков", "Петр", "Олегович", LocalDate.of(1939, 2, 20), "Ул. Пушкина", "88007767667", "Архитектура", 3, false));


        showFacultyCourse("Архитектура", 3);

    }
}
