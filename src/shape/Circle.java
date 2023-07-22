package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}
