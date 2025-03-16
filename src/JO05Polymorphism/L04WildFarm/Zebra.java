package JO05Polymorphism.L04WildFarm;

public class Zebra extends Mammal {


    public Zebra(String animalName, String animalType, double animalWeight, Integer foodEaten,
                 String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");

    }
}