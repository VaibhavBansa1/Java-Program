// Multiple Inheritance using Interfaces
// vaibhav bansal 22017C04069

interface Printable {
    void print();

    default void printWithTimestamp() {
        System.out.println("Timestamp: " + java.time.LocalDateTime.now());
        print();
    }
}

interface Showable {
    void show();

    default void showFormatted() {
        System.out.println("=================");
        show();
        System.out.println("=================");
    }
}

class Information implements Printable, Showable {
    private String message;
    private String author;
    private java.util.Date creationDate;
    
    Information(String msg, String author) {
        this.message = msg;
        this.author = author;
        this.creationDate = new java.util.Date();
    }
    
    public void print() {
        System.out.println("Printing Message: " + message);
        System.out.println("Created by: " + author);
    }
    
    public void show() {
        System.out.println("Displaying Message: " + message);
        System.out.println("Creation Date: " + creationDate);
    }
    
    void displayAll() {
        System.out.println("\nMultiple Inheritance Example Output:");
        System.out.println("----------------------------------");
        System.out.println("Message Details:");
        printWithTimestamp();
        System.out.println();
        showFormatted();
    }
}

public class Multiple {
    public static void main(String[] args) {
        Information info1 = new Information("Hello from Multiple Inheritance!", "Vaibhav");
        Information info2 = new Information("Another message example", "System");
        
        info1.displayAll();
        System.out.println("\n");
        info2.displayAll();
    }
}