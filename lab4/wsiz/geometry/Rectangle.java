package wsiiz.geometry;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        if(width <= 0 || height <= 0) throw new IllegalArgumentException("Width/height must be greater than zero");
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getCircumference() {
        return (2 * width) + (2 * height);
    }
}
