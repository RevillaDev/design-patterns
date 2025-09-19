package org.reer.designpatterns.creational.factorymethod;

import org.reer.designpatterns.creational.factorymethod.creator.Logistics;
import org.reer.designpatterns.creational.factorymethod.creator.RoadLogistics;
import org.reer.designpatterns.creational.factorymethod.creator.SeaLogistics;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select logistics method (road/sea):");
        System.out.println("1. Road Logistics");
        System.out.println("2. Sea Logistics");
        String choice = input.nextLine().trim().toLowerCase();

        LogisticsType logisticsType = LogisticsType.getLogicalType(choice);

        Logistics logistics = switch (logisticsType) {
            case ROAD -> new RoadLogistics();
            case SEA -> new SeaLogistics();
            case null -> throw new IllegalArgumentException("Invalid logistics type");
        };

        logistics.planDelivery();
    }

    enum LogisticsType {
        ROAD("1"),
        SEA("2");

        private final String value;

        LogisticsType(String value) {
            this.value = value;
        }

        public static LogisticsType getLogicalType(String choice) {
            return Arrays.stream(values()).filter(type -> type.getValue().equals(choice)).findFirst()
                    .orElse(null);
        }

        public String getValue() {
            return value;
        }
    }
}
