package org.reer.designpatterns.creational.abstractfactory.factory;

import org.reer.designpatterns.creational.abstractfactory.concrete.Chair;
import org.reer.designpatterns.creational.abstractfactory.concrete.CoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.ModenSofa;
import org.reer.designpatterns.creational.abstractfactory.concrete.ModernChair;
import org.reer.designpatterns.creational.abstractfactory.concrete.ModernCoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModenSofa();
    }
}
