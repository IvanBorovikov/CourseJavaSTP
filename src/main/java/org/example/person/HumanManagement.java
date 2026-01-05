package org.example.person;

import java.util.ArrayList;

public class HumanManagement {
    public static ArrayList<Human> humans = new ArrayList<>();

    /*
    а) вывод списка граждан, возраст которых превышает заданный;
     */
    public static void showExceedsTheSpecifiedAge(int age){
        System.out.printf("Граждане, возраст которых превышает заданный: %d", age);
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
        System.out.printf("Граждане с высшим образованием: %s", education);
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
    public static void showGender(boolean male){
        System.out.printf("Граждане с заданным полом: %b", male);
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
