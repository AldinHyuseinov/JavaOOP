package Polymorphism.Vehicles;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm + 1.4, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(liters);
    }
}
