package org.example.university;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    public static List<Student> students = new ArrayList<>();

    /*
     * а) вывод списка студентов запрошенного факультета
     */
    public static void showByFaculty(String faculty) {
        System.out.println("Студенты факультета: " + faculty);

        boolean found = false;
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(faculty)) {
                s.show();
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Студентов на этом факультете нет.");
        }
    }

    /*
     * б) вывод списка студентов запрошенного факультета и курса
     */
    public static void showByFacultyAndCourse(String faculty, int course) {
        System.out.println("Студенты факультета " + faculty + ", курс " + course);

        boolean found = false;
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(faculty) && s.getCourse() == course) {
                s.show();
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Таких студентов не найдено.");
        }
    }

    /*
     * в) вывод списка иногородних студентов
     */
    public static void showResidentStudents() {
        System.out.println("Иногородние студенты:");

        boolean found = false;
        for (Student s : students) {
            if (s.isResident()) {
                s.show();
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Иногородних студентов нет.");
        }
    }

    /*
    Просмотр всех студентов
     */
    public static void showAllStudents() {
        System.out.println("=== ВСЕ СТУДЕНТЫ ===");

        for (int i = 0; i < students.size(); i++) {
            System.out.println("[" + i + "]");
            students.get(i).show();
            System.out.println("-------------------");
        }
    }

    /*
    Редактирование
     */
    public static void editStudent(int index,
                                   String lastName, String firstName, String middleName,
                                   String address,
                                   LocalDate dateOfBirth, String phone,
                                   String faculty, int course, boolean resident) {

        if (index < 0 || index >= students.size()) {
            System.out.println("Неверный номер студента!");
            return;
        }

        Student s = students.get(index);

        s.setLastName(lastName);
        s.setFirstName(firstName);
        s.setMiddleName(middleName);
        s.setAddress(address);
        s.setDateOfBirth(dateOfBirth);
        s.setPhone(phone);
        s.setFaculty(faculty);
        s.setCourse(course);
        s.setResident(resident);

        System.out.println("=====================");

        System.out.println("ПОСЛЕ РЕДАКТИРОВАНИЯ:");
        s.show();
        System.out.println("Студент успешно отредактирован.");
    }

    /*
    Удаление
     */
    public static boolean deleteStudentByIndex(int index) {
        if (index < 0 || index >= students.size()) {
            return false;
        }
        students.remove(index);
        return true;
    }

}
