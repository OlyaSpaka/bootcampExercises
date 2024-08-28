package module6;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(6, "yellow");

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.calculatePerimeter()));
    }
}
