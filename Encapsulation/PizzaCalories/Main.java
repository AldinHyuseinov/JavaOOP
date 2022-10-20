package Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaArr = scanner.nextLine().split(" ");
        Pizza pizza = new Pizza(pizzaArr[1], Integer.parseInt(pizzaArr[2]));
        String[] doughArr = scanner.nextLine().split(" ");
        pizza.setDough(new Dough(doughArr[1], doughArr[2], Double.parseDouble(doughArr[3])));

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] toppingArr = command.split(" ");
            pizza.addToppings(new Topping(toppingArr[1], Double.parseDouble(toppingArr[2])));
            command = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
