package JO03Inheritance.E05Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = new BigDecimal("3.50");

    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
