package org.example.order;

public class OrderRestaurant extends Order {
    /*
    Номер стола
     */
    private int tableNumber;
    /*
    Наименование блюда
     */
    private String dishName;
    /*
    Чаевые
     */
    private int tipAmount;
    /*
    Оплата наличными или по карте
     */
    private PaymentType paymentType;

    public OrderRestaurant(){
        super();
    }

    public OrderRestaurant(OrderRestaurant orderRestaurant){
        super(orderRestaurant);
        this.tableNumber = orderRestaurant.tableNumber;
        this.dishName = orderRestaurant.dishName;
        this.tipAmount = orderRestaurant.tipAmount;
        this.paymentType = orderRestaurant.paymentType;
    }

    public OrderRestaurant(String serviceProvider,  int tableNumber,
                    String dishName, double cost, int tipAmount, PaymentType paymentType){
        super(serviceProvider, cost);
        if (dishName == null){
            throw new IllegalArgumentException("dishName");
        }
        this.tableNumber = tableNumber;
        this.dishName = dishName;
        this.tipAmount = tipAmount;
        this.paymentType = paymentType;
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

    public PaymentType getPaymentType() {
        return paymentType;
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

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    public void show(){
        System.out.println("Фамилия официанта: " + serviceProvider);
        System.out.println("Номер столика: " + tableNumber);
        System.out.println("Блюдо: " + dishName);
        System.out.println("Стоимость: " + cost);
        System.out.println("Чаевые: " + tipAmount);
        System.out.println("Оплата: " + paymentType.getType());
    }
}
