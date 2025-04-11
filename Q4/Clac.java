// Multiply 3 number using object 
// vaibhav bansal 22017C04069

class Multiply {
    private int num1;
    private int num2;
    private int num3;
    
    // Constructor
    Multiply(int n1, int n2, int n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    
    // Method to calculate multiplication
    int getMultiplication() {
        return num1 * num2 * num3;
    }
}

public class Clac{

    public static void main(String[] args) {
        // Creating object and calculating multiplication
        Multiply obj = new Multiply(2, 3, 4);
        int result = obj.getMultiplication();
        
        // Printing result
        System.out.println("Multiplication of three numbers is: " + result);
    }
}