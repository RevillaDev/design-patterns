package org.reer.designpatterns.creational.builder;

import org.reer.designpatterns.creational.builder.concrete.Car;
import org.reer.designpatterns.creational.builder.concrete.Manual;
import org.reer.designpatterns.creational.builder.director.Director;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();

        System.out.println(car);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();

        System.out.println(manual);
    }
}
