package org.reer.designpatterns.creational.builder;

import org.reer.designpatterns.creational.builder.model.SportEngine;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(SportEngine engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
