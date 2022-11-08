package geometry;

public class Square {
    int edge;

    public Square(int edge) {
        if(edge <= 0) throw new IllegalArgumentException("Edge must be greater than zero");
        this.edge = edge;
    }

    public double getArea() {
        return Math.pow(edge, 2);
    }

    public double getCircumference() {
        return 4 * edge;
    }
}
