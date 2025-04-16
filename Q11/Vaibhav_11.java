// Q 11. Write a program of single level inheritance? 
// vaibhav bansal 22017C04069

class A {
    private int value;
    
    A(int value) {
        this.value = value;
    }
    
    int getValue() {
        return value;
    }
    
    void displayA() {
        System.out.println("Class A value: " + value);
    }
}

// Class B inherits from Class A
class B extends A {
    private String message;
    
    // Constructor
    B(int value, String message) {
        super(value); 
        this.message = message;
    }
    
    void displayB() {
        System.out.println("Class B message: " + message);
        System.out.println("Inherited value from A: " + getValue());
    }
    
    void showInfo() {
        System.out.println("Complete Object Information:");
        System.out.println("---------------------------");
        displayA();
        displayB();
    }
}

public class Vaibhav_11 {
    public static void main(String[] args) {
        B obj = new B(100, "Hello from Class B");
        
        obj.showInfo();
    }
}
