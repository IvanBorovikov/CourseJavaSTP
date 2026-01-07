package org.example.product;

public enum TireQuality {
    NEW("Новая"),
    BU("Б/у");

    private final String typeQuality;

    TireQuality(String typeQuality){
        this.typeQuality = typeQuality;
    }

    public String getTypeQuality() {
        return typeQuality;
    }
}
