package JO03Inheritance.E05Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{

    private final static double CAKE_GRAMS = 250;
    private final static double CAKE_CALORIES = 1000;
    private final static BigDecimal CAKE_PRICE = new BigDecimal("5");

    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
    }
}
