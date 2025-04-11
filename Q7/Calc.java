// Find Area of Circle, Square, Rectangle, Triangle using int return type with parametrized constructor
// vaibhav bansal 22017C04069

class Circle {
    double r;

    Circle(double radius) {
        r = radius;
    }

    int area() {
        return (int) (Math.PI * r * r);
    }
}

class Square {
    int s;

    Square(int side ) {
        s = side;
    }

    int area(){
        return (s * s);
    }
}

class Rectangle{
    int a, b;

    Rectangle(int len, int wid ) {
        a = len;
        b = wid;
    }

    int area(){
        return (a * b);
    }
}

class Triangle {
    int h, b;
    Triangle( int height, int base) {
        h = height;
        b = base;
    }

    int area(){
        return (int) (0.5 * h * b);
    }
}

public class Calc {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(6, 4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area: " + triangle.area());
    }
    
}