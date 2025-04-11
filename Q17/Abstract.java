// simple abstract class example
// vaibhav bansal 22017C04069

abstract class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract double getArea();
    abstract double getPerimeter();

    void displayInfo() {
        System.out.println("\nShape: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle("My Circle", 5);
        Rectangle rectangle = new Rectangle("My Rectangle", 4, 6);

        System.out.println("Abstract Class Example:");
        System.out.println("----------------------");
        
        circle.displayInfo();
        rectangle.displayInfo();
    }
}