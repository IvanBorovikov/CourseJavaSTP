package org.example.Arrays;
import org.example.Classes.ClassStudents.*;

import java.util.ArrayList;

public class ManagementStudent {
    public static ArrayList<Students> st = new ArrayList<>();

    public static void showFaculty(String faculty){

        for (Students s : st){
            if (s.getFaculty().contains(faculty)){
                System.out.println("ФИО : " + s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
            }
        }
    }
    public static void showFacultyCourse(String faculty, int course){
        for (Students s : st){
            if (s.getFaculty().contains(faculty) && s.getCourse() == course){
                System.out.println("ФИО : " + s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName());
            }
        }

    }

    public void showNonresident(boolean nonresident){
        for (Students s : st){
            if (s.getNonresident() == nonresident){
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {

        st.add(new Students("Borowikov", "Ivan", "Alekseevich", "19.01.2003", "Ул. Новосёлов", "89081461708", "Информационная безопасность", 3, true));
        st.add(new Students("Volkov", "Valery", "Olegovich", "11.11.1992", "Ул. Пушкина", "88007767667", "Архитектура", 3, true));
        st.add(new Students("Volkov", "Petr", "Olegovich", "11.11.1992", "Ул. Пушкина", "88007767667", "Архитектура", 3, true));

        showFacultyCourse("Информационная безопасность", 3);



    }
}
