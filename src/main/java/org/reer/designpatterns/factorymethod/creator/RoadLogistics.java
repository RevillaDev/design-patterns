package org.reer.designpatterns.factorymethod.creator;

import org.reer.designpatterns.factorymethod.concrete.Transport;
import org.reer.designpatterns.factorymethod.concrete.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
