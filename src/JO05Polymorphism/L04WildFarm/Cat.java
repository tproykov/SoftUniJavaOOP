package JO05Polymorphism.L04WildFarm;

public class Cat extends Feline {


    public Cat(String animalName, String animalType, double animalWeight, Integer foodEaten,
               String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }
}