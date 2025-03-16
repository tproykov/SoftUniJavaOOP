package JO05Polymorphism.L04WildFarm;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, Integer foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }
}