package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return getAnimalType() + "[" + getAnimalName() + ", "
                + decimalFormat.format(getAnimalWeight()).replaceAll(",", ".")
                + ", " + livingRegion + ", " + getFoodEaten() + "]";
    }
}
