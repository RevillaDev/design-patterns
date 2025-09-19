package org.reer.designpatterns.creational.abstractfactory.factory;

import org.reer.designpatterns.creational.abstractfactory.concrete.Chair;
import org.reer.designpatterns.creational.abstractfactory.concrete.CoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.Sofa;
import org.reer.designpatterns.creational.abstractfactory.concrete.VictorianChair;
import org.reer.designpatterns.creational.abstractfactory.concrete.VictorianCoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
