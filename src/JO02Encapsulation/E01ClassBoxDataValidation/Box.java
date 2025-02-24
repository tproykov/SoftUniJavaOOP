package JO02Encapsulation.E01ClassBoxDataValidation;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private void setLength(double length) {
        this.length = length;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * height * width + 2 * length * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * height * width + 2 * length * height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}