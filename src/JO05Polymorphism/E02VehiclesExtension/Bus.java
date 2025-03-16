package JO05Polymorphism.E02VehiclesExtension;

public class Bus extends Vehicle {

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distanceToDrive) {

        this.setFuelConsumption(getFuelConsumption() + 1.4);
        return super.drive(distanceToDrive);
    }

    public String driveEmpty(double distance) {
        return super.drive(distance);
    }
}