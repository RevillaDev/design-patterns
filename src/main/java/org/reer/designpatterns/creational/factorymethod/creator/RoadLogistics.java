package org.reer.designpatterns.creational.factorymethod.creator;

import org.reer.designpatterns.creational.factorymethod.concrete.Transport;
import org.reer.designpatterns.creational.factorymethod.concrete.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
