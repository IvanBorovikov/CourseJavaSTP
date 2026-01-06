package org.example.person;

import java.util.ArrayList;

public class EmployeeManagement {
    public static ArrayList<Employee> employees = new ArrayList<>();

    /*
    а) вывод списка сотрудников, работающих в заданном подразделении;
     */
    public static void WorkingInTheDepartment(String department){
        System.out.printf("Сотрудники, работающие в заданном подразделении: %s\n", department);
        for (Employee emp : employees){
            if (emp.getDepartment().equalsIgnoreCase(department)){
                emp.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка сотрудников, зарплата которых больше заданной;
     */
    public static void SalaryHigherThanTheSetOne(double salary1){
        System.out.printf("Сотрудники, зарплата которых больше заданной: %.2f\n", salary1);
        for (Employee emp : employees){
            if (emp.getSalary() > salary1){
                emp.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка сотрудников, занимающих заданную должность.
     */
    public static void currentPositions (String position1){
        System.out.printf("Сотрудники, занимающих заданную должность: %s\n", position1);
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
