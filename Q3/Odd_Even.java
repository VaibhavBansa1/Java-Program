// Print even and odd b/w 1 to 100
// vaibhav bansal 22017C04069

class NumberSeparator {
    void findEvenOdd() {
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nOdd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Odd_Even {
    public static void main(String[] args) {
        NumberSeparator obj = new NumberSeparator();
        obj.findEvenOdd();
    }
}