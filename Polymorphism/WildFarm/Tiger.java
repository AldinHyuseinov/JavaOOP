package Polymorphism.WildFarm;

public class Tiger extends Feline {
    private String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
            return;
        }
        System.out.println("Tigers are not eating that type of food!");
    }
}
