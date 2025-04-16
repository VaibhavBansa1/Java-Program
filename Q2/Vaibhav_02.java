// Q2. Write a program to find the greatest number among three numbers (using nested if-else)?
// Vaibhav Bansal 22017C04069

class Cal {
    double a, b, c;

    void findGreatest() {
        if (a > b) {
            if (a > c) {
                System.out.println("a: " + a + " is the greatest");
            } else {
                System.out.println("c: " + c + " is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println("b: " + b + " is the greatest");
            } else {
                System.out.println("c: " + c + " is the greatest");
            }
        }
    }
}

public class Vaibhav_02 {
    public static void main(String[] args) {
        Cal obj1 = new Cal();
        Cal obj2 = new Cal();

        obj1.a = 2;
        obj1.b = 1;
        obj1.c = 8;

        obj1.findGreatest();

        obj2.a = 56;
        obj2.b = 10;
        obj2.c = 46;

        obj2.findGreatest();
    }
}
