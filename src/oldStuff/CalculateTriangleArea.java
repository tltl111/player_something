package oldStuff;

public class CalculateTriangleArea {
    private double base;
    private double height;

    public CalculateTriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }
}
