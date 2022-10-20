package Polymorphism.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Animal animal;
        Food food;

        while (!command.equals("End")) {
            String[] animalArr = command.split(" ");
            double weight = Double.parseDouble(animalArr[2]);

            if (animalArr.length == 4) {

                if (animalArr[0].equals("Mouse")) {
                    animal = new Mouse("Mouse", animalArr[1], weight, animalArr[3]);
                } else if (animalArr[0].equals("Zebra")) {
                    animal = new Zebra("Zebra", animalArr[1], weight, animalArr[3]);
                } else {
                    animal = new Tiger("Tiger", animalArr[1], weight, animalArr[3]);
                }
            } else {
                animal = new Cat("Mouse", animalArr[1], weight, animalArr[3], animalArr[4]);
            }
            animal.makeSound();

            String[] foodArr = scanner.nextLine().split(" ");
            int quantity = Integer.parseInt(foodArr[1]);

            if (foodArr[0].equals("Vegetable")) {
                food = new Vegetable(quantity);
            } else {
                food = new Meat(quantity);
            }
            animal.eat(food);
            System.out.println(animal);

            command = scanner.nextLine();
        }
    }
}
