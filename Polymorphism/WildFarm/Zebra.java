package Polymorphism.WildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
            return;
        }
        System.out.println("Zebras are not eating that type of food!");
    }
}
