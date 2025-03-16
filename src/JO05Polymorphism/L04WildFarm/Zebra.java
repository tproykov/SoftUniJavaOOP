package JO05Polymorphism.L04WildFarm;

class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }
}