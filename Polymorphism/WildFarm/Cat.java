package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return "Cat[" + getAnimalName() + ", " + breed + ", "
                + decimalFormat.format(getAnimalWeight()).replaceAll(",", ".")
                + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
