package org.example.order;

public enum PaymentType {
    CASH("Наличные"),
    CARD("Карта");

    private final String type;


    PaymentType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
