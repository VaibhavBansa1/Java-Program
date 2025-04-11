// Method Overloading 
// vaibhav bansal 22017C04069

class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

}

public class Met_overload {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
    
        // Testing different overloaded methods
        System.out.println("Method Overloading Examples:");
        System.out.println("---------------------------");
    
        // Using add method with 2 integers
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);
    
        // Using add method with 3 integers
        int sum2 = calc.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);
    
        // Using add method with 2 doubles
        double sum3 = calc.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    
        // Using add method with 2 strings
        String combined = calc.add("Hello ", "World!");
        System.out.println("Concatenated strings: " + combined);
    }
}