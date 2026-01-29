package org.example.product;

public enum TireCondition {
    NEW("Новая"),
    USED("Б/у");

    private final String typeQuality;

    TireCondition(String typeQuality){
        this.typeQuality = typeQuality;
    }

    public String getTypeQuality() {
        return typeQuality;
    }
}
