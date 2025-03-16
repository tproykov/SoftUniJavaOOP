package JO05Polymorphism.E01Vehicles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = createVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = createVehicle(tokens);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicleType = tokens[1];

            switch (command) {
                case "Drive" -> {
                    double distance = Double.parseDouble(tokens[2]);
                    String driveMessage = vehicles.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                }
                case "Refuel" -> {
                    double fuelAmount = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                }
            }
        }

        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle createVehicle(String[] tokens) {
        String vehicleType = tokens[0];
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);

        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car" -> vehicle = new Car(fuelQuantity, fuelConsumption);
            case "Truck" -> vehicle = new Truck(fuelQuantity, fuelConsumption);
        }
        return vehicle;
    }
}