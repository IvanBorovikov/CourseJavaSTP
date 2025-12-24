package org.example.order;

public class Order {
    protected String serviceProvider;
    protected double cost;

    protected Order(){

    }

    protected Order(Order order){
        this.serviceProvider = order.serviceProvider;
        this.cost = order.cost;
    }

    protected Order(String serviceProvider, double cost){
        this.serviceProvider = serviceProvider;
        this.cost = cost;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public double getCost() {
        return cost;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
