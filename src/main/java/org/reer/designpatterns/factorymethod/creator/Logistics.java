package org.reer.designpatterns.factorymethod.creator;

import org.reer.designpatterns.factorymethod.concrete.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
