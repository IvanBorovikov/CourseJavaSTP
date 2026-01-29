package org.example.university;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
    public static List<Teacher> teachers = new ArrayList<>();

    /*
    а) Вывод списка преподавателей, работающих на выбранной кафедре
     */
    public static void findTeachersByDepartment(String department){
        System.out.printf("Преподаватели работающие на выбранной кафедре: %s\n", department);
        for (Teacher t : teachers){
            if (t.getDepartment().equalsIgnoreCase(department)){
                t.show();
            }
        }
    }

    /*
    б) Вывод фамилии, должности и кафедры преподавателя, ведущих заданный предмет
     */
    public static void findTeachersBySubject(String object){
        System.out.printf("Преподаватели работающие на выбранной кафедре: %s\n", object);
        for (Teacher t : teachers){
            if (t.getObject().equalsIgnoreCase(object)){
                t.show();
                System.out.println();
            }
        }
    }

    /*
    в) Вывести список кафедр и работающих на них преподавателей
     */
    public static void getDepartmentsWithTeachers(){
        System.out.println("Кафедры и работающие на них преподаватели");
        for (Teacher t : teachers){
            System.out.println("Кафедра: " + t.getDepartment());
            System.out.println("Преподаватель: " + t.getLastName() + " " + t.getFirstName() + " " + t.getMiddleName());
            System.out.println("-------------------------------------");
        }
    }


//    public static void main(String[] args) {
//        teachers.add(new Teacher("Иванов", "Александр", "Петрович", "Профессор", "Высшей математики", "Математический анализ"));
//        teachers.add(new Teacher("Петров", "Дмитрий", "Сергеевич", "Старший преподаватель", "Иностранных языков", "Английский язык для профессиональных целей"));
//        teachers.add(new Teacher("Смирнова", "Елена", "Владимировна", "Доцент", "Программной инженерии", "Базы данных"));
//
//    }
}
