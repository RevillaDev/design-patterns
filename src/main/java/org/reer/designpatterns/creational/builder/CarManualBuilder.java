package org.reer.designpatterns.creational.builder;

import org.reer.designpatterns.creational.builder.concrete.Manual;
import org.reer.designpatterns.creational.builder.model.SportEngine;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(SportEngine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.setGPS(hasGPS);
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
