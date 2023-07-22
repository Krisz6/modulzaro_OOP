package shape;

public class Square extends Shape{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }
}
