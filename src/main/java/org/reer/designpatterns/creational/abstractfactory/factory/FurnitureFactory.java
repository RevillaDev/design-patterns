package org.reer.designpatterns.creational.abstractfactory.factory;

import org.reer.designpatterns.creational.abstractfactory.concrete.Chair;
import org.reer.designpatterns.creational.abstractfactory.concrete.CoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    CoffeTable createCoffeTable();

    Sofa createSofa();
}
