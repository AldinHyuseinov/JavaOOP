package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double litersPerKm;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double litersPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {

        if (fuelQuantity <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        } else if (fuelQuantity + this.fuelQuantity > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public void drive(double distance) {
        double fuelUsed = distance * litersPerKm;

        if (fuelUsed <= fuelQuantity) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println(this.getClass().getSimpleName() + " travelled " + decimalFormat.format(distance) + " km");
            fuelQuantity -= fuelUsed;
        } else {
            System.out.println(this.getClass().getSimpleName() + " needs refueling");
        }
    }

    public abstract void refuel(double liters);
}
