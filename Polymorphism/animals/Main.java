package Polymorphism.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("Beast!")) {
            String[] animalArr = scanner.nextLine().split(" ");
            int animalAge = Integer.parseInt(animalArr[1]);
            Animal animal;

            try {
                switch (command) {
                    case "Dog":
                        animal = new Dog(animalArr[0], animalAge, animalArr[2]);
                        break;
                    case "Frog":
                        animal = new Frog(animalArr[0], animalAge, animalArr[2]);
                        break;
                    case "Cat":
                        animal = new Cat(animalArr[0], animalAge, animalArr[2]);
                        break;
                    case "Kitten":
                        animal = new Kitten(animalArr[0], animalAge);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(animalArr[0], animalAge);
                        break;
                    default:
                        animal = null;
                        break;
                }
                System.out.println(command);
                System.out.println(animal);
                System.out.println(animal.produceSound());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }
    }
}
