package shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Kör kerülete: " + circle.getPerimeter());
        System.out.println("Kör területe: " + circle.getArea());

        Square square = new Square(12);
        System.out.println("Négyzet kerülete: " + square.getPerimeter());
        System.out.println("Négyzet területe: " + square.getArea());

        Rectangle rectangle = new Rectangle(6, 9);
        System.out.println("Téglalap kerülete: " + rectangle.getPerimeter());
        System.out.println("Téglalap területe: " + rectangle.getArea());
    }
}
