package wsiiz.geometry;

public class Cube {
    int edge;

    public Cube(int edge) {
        if(edge <= 0) throw new IllegalArgumentException("Edge must be greater than 0");
        this.edge = edge;
    }

    public double getArea() {
        return 6 * Math.pow(edge, 2);
    }

    public double getCircumference() {
        return Math.pow(edge, 3);
    }
}
