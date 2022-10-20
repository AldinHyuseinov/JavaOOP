package Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carArr = scanner.nextLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carArr[1]), Double.parseDouble(carArr[2]), Double.parseDouble(carArr[3]));

        String[] truckArr = scanner.nextLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckArr[1]), Double.parseDouble(truckArr[2]), Double.parseDouble(truckArr[3]));

        String[] busArr = scanner.nextLine().split(" ");
        Vehicle bus = new Bus(Double.parseDouble(busArr[1]), Double.parseDouble(busArr[2]), Double.parseDouble(busArr[3]));

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String[] lines = scanner.nextLine().split(" ");

            if (lines[0].equals("Drive")) {
                double distance = Double.parseDouble(lines[2]);

                if (lines[1].equals("Car")) {
                    car.drive(distance);
                } else if (lines[1].equals("Truck")) {
                    truck.drive(distance);
                } else {
                    bus.drive(distance);
                }
            } else if (lines[0].equals("Refuel")) {
                double liters = Double.parseDouble(lines[2]);

                if (lines[1].equals("Car")) {
                    car.refuel(liters);
                } else if (lines[1].equals("Truck")) {
                    truck.refuel(liters);
                } else {
                    bus.refuel(liters);
                }
            } else if (lines[0].equals("DriveEmpty")) {
                bus.setLitersPerKm(bus.getLitersPerKm() + 1.4);
                bus.drive(Double.parseDouble(lines[2]));
            }
        }
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
