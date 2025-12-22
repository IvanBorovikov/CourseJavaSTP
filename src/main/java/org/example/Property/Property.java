package org.example.Property;

public class Property {
    protected String ownerLastName;

    protected Property(){

    }

    protected Property(Property property){
        this.ownerLastName = property.ownerLastName;
    }

    protected Property(String ownerLastName){
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }
}
