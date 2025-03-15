package JO05Polymorphism.L04WildFarm;

public class Feline extends Mammal {

    public Feline(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());

    }


}
