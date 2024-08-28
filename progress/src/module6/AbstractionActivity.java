package module6;

public class AbstractionActivity {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "yellow");
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println("***Circle information***");
        printInfo(circle);
        System.out.println("***Rectangle information***");
        printInfo(rectangle);
    }

    static void printInfo(Shape shape) {
        System.out.println("Color: " + shape.getColor());
        System.out.println("Area: " + String.format("%.2f", shape.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", shape.calculatePerimeter()));
    }
}