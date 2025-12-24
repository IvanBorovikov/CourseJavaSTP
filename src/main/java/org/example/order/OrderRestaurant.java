package org.example.order;

public class OrderRestaurant extends Order {
    private int tableNumber;
    private String dishName;
    private int tipAmount;
    private boolean cashOrCard;

    OrderRestaurant(){
        super();
    }

    OrderRestaurant(OrderRestaurant orderRestaurant){
        super(orderRestaurant);
        this.tableNumber = orderRestaurant.tableNumber;
        this.dishName = orderRestaurant.dishName;
        this.tipAmount = orderRestaurant.tipAmount;
        this.cashOrCard = orderRestaurant.cashOrCard;
    }

    OrderRestaurant(String serviceProvider, double cost, int tableNumber,
                    String dishName, int tipAmount, boolean cashOrCard){
        super(serviceProvider, cost);
        this.tableNumber = tableNumber;
        this.dishName = dishName;
        this.tipAmount = tipAmount;
        this.cashOrCard = cashOrCard;

    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getDishName() {
        return dishName;
    }

    public int getTipAmount() {
        return tipAmount;
    }

    public boolean isCashOrCard() {
        return cashOrCard;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setTipAmount(int tipAmount) {
        this.tipAmount = tipAmount;
    }

    public void setCashOrCard(boolean cashOrCard) {
        this.cashOrCard = cashOrCard;
    }

    public void show(){
        System.out.println("Фамилия официанта: " + serviceProvider);
        System.out.println("Номер столика: " + tableNumber);
        System.out.println("Блюдо: " + dishName);
        System.out.println("Стоимость: " + cost);
        System.out.println("Чаевые: " + tipAmount);
        System.out.println("Оплата: " + (cashOrCard ? "Наличные" : "Карта"));
    }
}
