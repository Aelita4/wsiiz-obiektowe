package wsiiz.geometry;

public class Cuboid {
    int a, b, c;

    public Cuboid(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Edge must be greater than 0");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        return 2 * (a * b) +
               2 * (b * c) +
               2 * (a * c);
    }

    public double getVolume() {
        return a * b * c;
    }
}
