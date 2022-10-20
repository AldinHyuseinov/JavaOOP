package Polymorphism.Vehicles;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm + 0.9, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(liters);
    }
}
