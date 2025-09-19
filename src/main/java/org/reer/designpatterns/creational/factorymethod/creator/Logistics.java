package org.reer.designpatterns.creational.factorymethod.creator;

import org.reer.designpatterns.creational.factorymethod.concrete.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
