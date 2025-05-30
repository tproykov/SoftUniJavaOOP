package JO02Encapsulation.E03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getProductsCount() {
        return this.products.size();
    }

    public List<String> getProducts() {
        return this.products.stream().map(Product::getName).collect(Collectors.toList());
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            this.money -= product.getCost();
            this.products.add(product);
        }
        else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
    }
}