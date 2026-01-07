package org.example.person;

import java.util.ArrayList;

public class HumanManagement {
    public static ArrayList<Human> humans = new ArrayList<>();

    /*
    а) вывод списка граждан, возраст которых превышает заданный;
     */
    public static void showExceedsTheSpecifiedAge(int age){
        System.out.printf("Граждане, возраст которых превышает заданный: %d\n", age);
        for (Human h : humans){
            if (h.getAge() > age){
                h.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка граждан с высшим образованием;
     */
    public static void showHigherEducation(String education){
        System.out.printf("Граждане с высшим образованием: %s\n", education);
        for (Human h : humans){
            if (h.getEducation().equalsIgnoreCase(education)){
                System.out.println();
                h.show();
            }
        }
    }

    /*
    в) вывод списка граждан заданного пола.
     */
    public static void showGender(Sex male){
        System.out.printf("Граждане с заданным полом: %s\n", male.getGender());
        for (Human h : humans){
            if(h.getMale() == male){
                h.show();
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
       humans.add(new Human("Зверева", "София", "Александровна", "ул. Северная", Sex.FEMALE, "Высшее", 23));
       humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Пушкинская", Sex.MALE, "Среднее", 24));
       humans.add(new Human("Глебов", "Кирилл", "Русланович", "ул. Победы", Sex.MALE, "Среднее", 20));
       humans.add(new Human("Теряев", "Максим", "Анатольевич", "ул. Степная", Sex.MALE, "Среднее", 20));


       showGender(Sex.MALE);
    }
}
