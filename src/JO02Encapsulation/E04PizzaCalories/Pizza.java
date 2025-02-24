package JO02Encapsulation.E04PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.name = name;
        this.dough = new Dough();
        this.toppings = new ArrayList<>();

    }


}
