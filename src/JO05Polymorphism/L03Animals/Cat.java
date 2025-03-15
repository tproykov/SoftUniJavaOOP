package JO05Polymorphism.L03Animals;

public class Cat extends Animal {


    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + "MEEOW";
    }
}