package org.example.person;

import java.util.ArrayList;

public class EmployeeManagement {
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void WorkingInTheDepartment(String department){
        for (Employee emp : employees){
            if (emp.getDepartment().equalsIgnoreCase(department)){
                emp.show();
                System.out.println();
            }
        }
    }

    public static void SalaryHigherThanTheSetOne(double salary1){
        for (Employee emp : employees){
            if (emp.getSalary() > salary1){
                emp.show();
                System.out.println();
            }
        }
    }

    public static void currentPositions (String position1){
        for (Employee emp : employees){
            if (emp.getPosition().equalsIgnoreCase(position1)){
                emp.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        employees.add(new Employee("Шатунов", "Валерий", "Алексеевич", "Руководитель", "Управление", 2020, 2000));
        employees.add(new Employee("Бегунов", "Алексей", "Дмитриевич", "PM", "Отдел разработки", 2018, 2500));
        employees.add(new Employee("Варапаева", "Галина", "Генадьевна", "Тестировщик", "Отдел разработки", 2021, 1900));

        currentPositions("pm");
    }
}
