package shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    double getArea() {
        return length * width;
    }
}
