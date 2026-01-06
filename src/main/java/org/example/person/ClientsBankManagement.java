package org.example.person;

import java.util.ArrayList;

public class ClientsBankManagement {

    public static ArrayList<ClientBank> clientsBanks = new ArrayList<>();

    /*
    а) вывод информации о клиенте по номеру банковского счета;
     */
    public static void showCustomerInformation(int id){
        System.out.printf("Клиент по номеру банковского счета: %d\n", id);
        boolean found = false;
        for (ClientBank cl : clientsBanks){
            if (cl.getBankAccountNumber() == id){
                found = true;
                cl.show();
                System.out.println();
            }
        }

        if (!found){
            System.out.println("Такого id (" + id + ") - нет");
        }
    }

    /*
    б) вывод списка клиентов, количество денег на счете которых, меньше указанного;
     */
    public static void showCustomersWithLessMoney(double money){
        System.out.printf("Клиенты, количество денег на счете которых меньше указанного: %.2f\n", money);
        for (ClientBank cl : clientsBanks){
            if (cl.getAmountOfMoneyAccount() < money){
                cl.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка клиентов, без овердрафта
 */
    public static void showWithoutAnOverdraft(){
        System.out.println("Клиентов, без овердрафта:");
        for (ClientBank cl : clientsBanks){
            if (cl.getOverdraftLimit() == 0.0){
                cl.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        clientsBanks.add(new ClientBank("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", "+7-999-989-99-99", 1, 1000.0, 5000.0));
        clientsBanks.add(new ClientBank("Волков", "Андрей", "Алексеевич", "ул. Пушкинская", "+7-999-989-99-99", 2, 993.0, 5000.0));
        clientsBanks.add(new ClientBank("Федоров", "Артем", "Андреевич", "ул. Тверская", "+7-999-989-99-99", 3, 800.0, 5000.0));
        clientsBanks.add(new ClientBank("Лисицин", "Павел", "Александрович", "ул. Победы", "+7-999-989-99-99", 4, 800.0, 0.0));
        //showCustomerInformation(2);
        //showCustomersWithLessMoney(1000);
        showWithoutAnOverdraft();
    }
}
