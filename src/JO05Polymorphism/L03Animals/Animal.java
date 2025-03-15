package JO05Polymorphism.L03Animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s\n", this.name,
                this.favouriteFood);
    }
}