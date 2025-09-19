package org.reer.designpatterns.creational.abstractfactory;

import org.reer.designpatterns.creational.abstractfactory.concrete.Chair;
import org.reer.designpatterns.creational.abstractfactory.concrete.CoffeTable;
import org.reer.designpatterns.creational.abstractfactory.concrete.Sofa;
import org.reer.designpatterns.creational.abstractfactory.factory.FurnitureFactory;

public class Application {
    private final FurnitureFactory furnitureFactory;

    public Application(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void createFurniture() {
        Chair chair = this.furnitureFactory.createChair();
        CoffeTable coffeTable = this.furnitureFactory.createCoffeTable();
        Sofa sofa = this.furnitureFactory.createSofa();
        System.out.println(chair);
        System.out.println(coffeTable);
        System.out.println(sofa);
    }
}
