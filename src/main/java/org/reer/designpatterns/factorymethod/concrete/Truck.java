package org.reer.designpatterns.factorymethod.concrete;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
