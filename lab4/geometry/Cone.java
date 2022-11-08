package geometry;

public class Cone {
    double height, radius, slant;

    public Cone(double height, double radius) {
        if(height <= 0 || radius <= 0) throw new IllegalArgumentException("Height/radius must be greater than zero");
        this.height = height;
        this.radius = radius;
        this.slant = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
    }

    public double getArea() {
        return Math.PI * radius * slant + Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}
