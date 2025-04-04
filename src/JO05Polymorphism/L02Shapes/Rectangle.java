package JO05Polymorphism.L02Shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculatePerimeter();
        calculateArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}