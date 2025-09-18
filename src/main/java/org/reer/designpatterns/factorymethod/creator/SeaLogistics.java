package org.reer.designpatterns.factorymethod.creator;

import org.reer.designpatterns.factorymethod.concrete.Ship;
import org.reer.designpatterns.factorymethod.concrete.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
