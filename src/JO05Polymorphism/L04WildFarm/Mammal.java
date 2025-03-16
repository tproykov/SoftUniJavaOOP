package JO05Polymorphism.L04WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %.1f, %s, %d]",
                this.getAnimalType(),
                this.getAnimalName(),
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}