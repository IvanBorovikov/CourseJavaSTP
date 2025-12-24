package org.example.administration;

import org.example.person.Human;

import java.util.ArrayList;

public class HumanManagement {
    public static ArrayList<Human> humans = new ArrayList<>();

    public static void showExceedsTheSpecifiedAge(int age){
        for (Human h : humans){
            if (h.getAge() > age){
                h.show();
                System.out.println();
            }
        }
    }

    public static void showHigherEducation(String education){
        for (Human h : humans){
            if (h.getEducation().equalsIgnoreCase(education)){
                System.out.println();
                h.show();
            }
        }
    }

    public static void showGender(boolean male){
        for (Human h : humans){
            if(h.isMale() == male){
                System.out.println();
                h.show();
            }
        }

    }



    public static void main(String[] args) {
       humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", false, "Высшее", 23));
       humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", false, "Среднее", 24));
       humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", true, "Среднее", 20));
       humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", true, "Среднее", 20));


       showGender(true);
    }
}
