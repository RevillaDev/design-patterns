package org.reer.designpatterns.creational.builder;

import org.reer.designpatterns.creational.builder.concrete.Car;
import org.reer.designpatterns.creational.builder.model.SportEngine;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(SportEngine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.setGPS(hasGPS);
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
