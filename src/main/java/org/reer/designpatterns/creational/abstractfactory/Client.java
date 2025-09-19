package org.reer.designpatterns.creational.abstractfactory;

import org.reer.designpatterns.creational.abstractfactory.factory.ArtDecoFurnitureFactory;
import org.reer.designpatterns.creational.abstractfactory.factory.FurnitureFactory;
import org.reer.designpatterns.creational.abstractfactory.factory.ModernFurnitureFactory;
import org.reer.designpatterns.creational.abstractfactory.factory.VictorianFurnitureFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating furniture...");
        System.out.println("Select furniture style (1/2/3):");
        System.out.println("1. Modern Furniture");
        System.out.println("2. Victorian Furniture");
        System.out.println("3. Art Deco Furniture");
        String choice = input.nextLine().trim().toLowerCase();

        FurnitureType furnitureType = FurnitureType.getFurnitureType(choice);

        FurnitureFactory factory = switch (furnitureType) {
            case MODERN -> new ModernFurnitureFactory();
            case VICTORIAN -> new VictorianFurnitureFactory();
            case ART_DECO -> new ArtDecoFurnitureFactory();
            case null -> throw new IllegalArgumentException("Invalid choice");
        };

        Application application = new Application(factory);
        application.createFurniture();
    }

    enum FurnitureType {
        MODERN("1"),
        VICTORIAN("2"),
        ART_DECO("3");

        private final String value;

        FurnitureType(String value) {
            this.value = value;
        }

        public static FurnitureType getFurnitureType(String choice) {
            return Arrays.stream(values())
                    .filter(type -> type.getValue().equals(choice))
                    .findFirst()
                    .orElse(null);
        }

        public String getValue() {
            return value;
        }
    }
}
