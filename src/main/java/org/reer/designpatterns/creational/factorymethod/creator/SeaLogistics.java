package org.reer.designpatterns.creational.factorymethod.creator;

import org.reer.designpatterns.creational.factorymethod.concrete.Ship;
import org.reer.designpatterns.creational.factorymethod.concrete.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
