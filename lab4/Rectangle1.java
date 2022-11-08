public class Rectangle1 {
    int width, height;

    public Rectangle1(int width, int height) {
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

    public double getAxis() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
