package JO05Polymorphism.L02Shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}