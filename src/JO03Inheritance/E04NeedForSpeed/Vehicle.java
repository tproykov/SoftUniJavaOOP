package JO03Inheritance.E04NeedForSpeed;

public class Vehicle {

    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    private double fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers) {

        double neededFuel = this.fuelConsumption * kilometers;
        double remainingFuel = this.fuel - neededFuel;

        if (remainingFuel >= 0) {
            this.setFuel(remainingFuel);
        }

    }
}