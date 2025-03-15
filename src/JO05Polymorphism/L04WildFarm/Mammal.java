package JO05Polymorphism.L04WildFarm;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }


}
