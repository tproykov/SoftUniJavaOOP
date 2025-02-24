package JO02Encapsulation.E04PizzaCalories;

public enum BakingTechniqueModifier {

    crispy(0.9),
    chewy(1.1),
    homemade(1.0);

    private final double modifier;

    BakingTechniqueModifier(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return this.modifier;
    }
}