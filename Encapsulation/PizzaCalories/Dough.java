package Encapsulation.PizzaCalories;

import java.util.Arrays;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {

        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {

        if (IsNotValid(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {

        if (IsNotValid(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        return (2 * weight) * findModifier(flourType) * findModifier(bakingTechnique);
    }

    private double findModifier(String doughModifier) {
        double modifier = 0;

        switch (doughModifier) {
            case "White":
                modifier = 1.5;
                break;
            case "Wholegrain":
            case "Homemade":
                modifier = 1.0;
                break;
            case "Crispy":
                modifier = 0.9;
                break;
            case "Chewy":
                modifier = 1.1;
                break;
        }
        return modifier;
    }

    private boolean IsNotValid(String doughModifier) {
        return Arrays.stream(new String[]{"White", "Wholegrain", "Crispy", "Chewy", "Homemade"})
                .noneMatch(e -> e.equals(doughModifier));
    }
}
