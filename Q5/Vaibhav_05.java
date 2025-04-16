// Q5. Write a program to add 4 numbers, subtract 2 numbers, and multiply 3 numbers (using separate classes)
// Vaibhav Bansal 22017C04069

class Addition {
    private int num1, num2, num3, num4;

    // Constructor
    Addition(int n1, int n2, int n3, int n4) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
        num4 = n4;
    }

    // Method to calculate addition
    int getAddition() {
        return num1 + num2 + num3 + num4;
    }
}

class Subtraction {
    private int num1, num2;

    // Constructor
    Subtraction(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate subtraction
    int getSubtraction() {
        return num1 - num2;
    }
}

class Multiplication {
    private int num1, num2, num3;

    // Constructor
    Multiplication(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    // Method to calculate multiplication
    int getMultiplication() {
        return num1 * num2 * num3;
    }
}

public class Vaibhav_05 {

    public static void main(String[] args) {
        // Addition of 4 numbers
        Addition addObj = new Addition(2, 3, 4, 5);
        int addResult = addObj.getAddition();
        System.out.println("Addition of four numbers is: " + addResult);

        // Subtraction of 2 numbers
        Subtraction subObj = new Subtraction(10, 4);
        int subResult = subObj.getSubtraction();
        System.out.println("Subtraction of two numbers is: " + subResult);

        // Multiplication of 3 numbers
        Multiplication mulObj = new Multiplication(2, 3, 4);
        int mulResult = mulObj.getMultiplication();
        System.out.println("Multiplication of three numbers is: " + mulResult);
    }
}