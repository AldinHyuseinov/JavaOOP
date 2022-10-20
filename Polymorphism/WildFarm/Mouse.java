package Polymorphism.WildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
            return;
        }
        System.out.println("Mouses are not eating that type of food!");
    }
}
