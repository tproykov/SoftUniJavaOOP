package JO03Inheritance.E06Animals;

public class Tomcat extends Cat{

    private static final String GENDER = "Male";
    private static final String SOUND = "MEOW";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}