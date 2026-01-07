package org.example.product;

public enum TireType {
    SUMMER("Лето"),
    WINTER("Зима");

    private final String type;

    TireType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
