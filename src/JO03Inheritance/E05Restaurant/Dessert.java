package JO03Inheritance.E05Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{

    public double calories;

    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}