package org.example.Transport;

public class Transport {
    protected int numberOfTransport;

    protected Transport(){

    }
    protected Transport(Transport transport){
        this.numberOfTransport = transport.numberOfTransport;
    }

    protected Transport(int numberOfTransport){
        this.numberOfTransport = numberOfTransport;
    }

    public int getNumberOfTransport() {
        return numberOfTransport;
    }

    public void setNumberOfTransport(int numberOfTransport) {
        this.numberOfTransport = numberOfTransport;
    }
}
