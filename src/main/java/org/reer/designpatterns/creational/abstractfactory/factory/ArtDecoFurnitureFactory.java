package org.reer.designpatterns.creational.abstractfactory.factory;

import org.reer.designpatterns.creational.abstractfactory.concrete.ArtDecoChair;
import org.reer.designpatterns.creational.abstractfactory.concrete.ArtDecoCoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.ArtDecoSofa;
import org.reer.designpatterns.creational.abstractfactory.concrete.Chair;
import org.reer.designpatterns.creational.abstractfactory.concrete.CoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
