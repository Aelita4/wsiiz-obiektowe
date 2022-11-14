package wsiiz.geometry;

public class Circle {
    int radius;

    public Circle(int radius) {
        if(radius <= 0) throw new IllegalArgumentException("Radius must be greater than 0");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
