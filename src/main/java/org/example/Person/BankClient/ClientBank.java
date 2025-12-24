package org.example.Person.BankClient;

import org.example.Person.Person;

public class ClientBank extends Person {
    private String phone;
    private int bankAccountNumber;
    private double amountOfMoneyAccount;
    private double overdraftLimit;

    public ClientBank(){
        super();
    }

    public ClientBank(ClientBank clientBank){
        super(clientBank);
        this.phone = clientBank.phone;
        this.bankAccountNumber = clientBank.bankAccountNumber;
        this.amountOfMoneyAccount = clientBank.amountOfMoneyAccount;
        this.overdraftLimit = clientBank.overdraftLimit;
    }

    public ClientBank(String lastName, String firstName, String middleName, String address,
               String phone, int bankAccountNumber, double amountOfMoneyAccount,
               double overdraftLimit){
        super(lastName, firstName, middleName, address);
        this.phone = phone;
        this.bankAccountNumber = bankAccountNumber;
        this.amountOfMoneyAccount = amountOfMoneyAccount;
        this.overdraftLimit = overdraftLimit;
    }

    public String getPhone() {
        return phone;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getAmountOfMoneyAccount() {
        return amountOfMoneyAccount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setAmountOfMoneyAccount(double amountOfMoneyAccount) {
        this.amountOfMoneyAccount = amountOfMoneyAccount;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void show(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println("Номер банковского счёта: " + bankAccountNumber);
        System.out.println("Кол-во денег: " + amountOfMoneyAccount);
        System.out.println("Лимит овердрафта: " + overdraftLimit);
    }
}
