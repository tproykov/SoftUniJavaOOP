package JO05Polymorphism.E01Vehicles;

public class Truck extends Vehicle {

    private static final double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private static final double FUEL_LEAK_CORRECTION_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = fuelConsumption + ADDITIONAL_AC_CONSUMPTION;
    }

    @Override
    public void refuel(double liters) {

        liters = liters * FUEL_LEAK_CORRECTION_PERCENTAGE;
        super.refuel(liters);
    }
}