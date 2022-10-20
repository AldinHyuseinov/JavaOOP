package Encapsulation.PizzaCalories;

import java.util.Arrays;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {

        if (Arrays.stream(new String[]{"Meat", "Veggies", "Cheese", "Sauce"})
                .noneMatch(topping -> topping.equals(toppingType))) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {

        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double modifier = 0;

        switch (toppingType) {
            case "Meat":
                modifier = 1.2;
                break;
            case "Veggies":
                modifier = 0.8;
                break;
            case "Cheese":
                modifier = 1.1;
                break;
            case "Sauce":
                modifier = 0.9;
                break;
        }
        return (2 * weight) * modifier;
    }
}
