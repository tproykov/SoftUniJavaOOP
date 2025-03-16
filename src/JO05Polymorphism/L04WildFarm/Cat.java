package JO05Polymorphism.L04WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %.1f, %s, %d]",
                this.getAnimalType(),
                this.getAnimalName(),
                this.getBreed(),
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}