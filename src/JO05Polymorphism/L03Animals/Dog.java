package JO05Polymorphism.L03Animals;

public class Dog extends Animal {


    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + "JAAF";
    }
}