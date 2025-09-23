package org.reer.designpatterns.creational.builder.concrete;

import org.reer.designpatterns.creational.builder.model.SportEngine;

public class Manual {
    private int seats;
    private SportEngine engine;
    private boolean tripComputer;
    private boolean GPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(SportEngine engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }
}
