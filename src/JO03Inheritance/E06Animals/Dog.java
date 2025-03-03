package JO03Inheritance.E06Animals;

public class Dog extends Animal {

    private static final String SOUND = "Woof!";

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}