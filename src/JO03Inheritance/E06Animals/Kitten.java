package JO03Inheritance.E06Animals;

public class Kitten extends Cat{

    private static final String GENDER = "Female";

    public Kitten(String name, int age, String gender) {
        super(name, age, GENDER);
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}