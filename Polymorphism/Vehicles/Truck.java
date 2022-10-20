package Polymorphism.Vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm + 1.6, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(0.95 * liters);
    }
}
