// Q6. Write a program to calculate area of circle, square, rectangle, and triangle (using return type function)?
// vaibhav bansal 22017C04069

class Circle {
    double r;
    int area() {
        return (int) (Math.PI * r * r);
    }
}

class Square {
    int s;
    int area(){
        return (s * s);
    }
}

class Rectangle{
    int a, b;
    int area(){
        return (a * b);
    }
}

class Triangle {
    int h, b;
    int area(){
        return (int) (0.5 * h * b);
    }
}

public class Vaibhav_06 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.r = 5;

        square.s = 4;
        
        rectangle.a = 5;
        rectangle.b = 3;
        
        triangle.h = 6;
        triangle.b = 4;

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area: " + triangle.area());
    }
    
}