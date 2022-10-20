package Encapsulation.ShoppingSpree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleAndMoney = Arrays.stream(scanner.nextLine().split(";"))
                .map(string -> string.split("="))
                .map(personAndMoney -> new Person(personAndMoney[0], Double.parseDouble(personAndMoney[1])))
                .collect(Collectors.toList());

        List<Product> productsAndCosts = Arrays.stream(scanner.nextLine().split(";"))
                .map(string -> string.split("="))
                .map(productAndCost -> new Product(productAndCost[0], Double.parseDouble(productAndCost[1])))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] commandArr = command.split(" ");

            peopleAndMoney.stream()
                    .filter(person -> person.getName().equals(commandArr[0]))
                    .findFirst().get()
                    .buyProduct(productsAndCosts.stream()
                            .filter(item -> item.getName().equals(commandArr[1]))
                            .findFirst().get());

            command = scanner.nextLine();
        }

        peopleAndMoney.forEach(person -> System.out.println(person.getName() + " - " + (person.getProducts()
                .isEmpty() ? "Nothing bought" : person.getProducts()
                .stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ")))));
    }
}
