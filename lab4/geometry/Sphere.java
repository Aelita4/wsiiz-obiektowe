package geometry;

public class Sphere {
    int radius;

    public Sphere(int radius) {
        if(radius <= 0) throw new IllegalArgumentException("Radius must be greater than 0");
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
