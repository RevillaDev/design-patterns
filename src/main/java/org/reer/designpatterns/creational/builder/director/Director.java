package org.reer.designpatterns.creational.builder.director;

import org.reer.designpatterns.creational.builder.Builder;
import org.reer.designpatterns.creational.builder.model.SportEngine;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
