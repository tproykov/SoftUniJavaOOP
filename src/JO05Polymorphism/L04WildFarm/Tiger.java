package JO05Polymorphism.L04WildFarm;

public class Tiger extends Feline {


    public Tiger(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        }
        else {
            System.out.printf("%ss are not eating that type of food!\n", this.getAnimalType());
        }
    }
}