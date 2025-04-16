// Write a program to find volume of rectangle (using class)?
// Vaibhav Bansal 22017C04069

class Rectangle {
    private int length;
    private int breadth;
    private int height;
    
    // Constructor
    Rectangle(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    // Method to calculate volume
    int getVolume() {
        return length * breadth * height;
    }
}

public class Vaibhav_04 {

    public static void main(String[] args) {
        // Creating object and calculating volume
        Rectangle rect = new Rectangle(2, 3, 4);
        int volume = rect.getVolume();
        
        // Printing result
        System.out.println("Volume of the rectangle is: " + volume);
    }
}