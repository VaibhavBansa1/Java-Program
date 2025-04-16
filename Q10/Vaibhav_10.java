// Q10. Write a program of constructor overloading? 
// vaibhav bansal 22017C04069

class Student {
    private String name;
    private int age;
    private String course;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // Constructor with name parameter
    public Student(String name) {
        this.name = name;
        age = 0;
        course = "Not Assigned";
    }

    // Constructor with name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }

    // Constructor with all parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("------------------------");
    }
}

public class Vaibhav_10{
    public static void main(String[] args) {
        // Creating one object and using different constructors
        System.out.println("Using different constructors with one object:");
        
        Student student = new Student();  // Default constructor
        student.displayDetails();
        
        student = new Student("Vaibhav");  // Constructor with name
        student.displayDetails();
        
        student = new Student("Vaibhav", 19);  // Constructor with name and age
        student.displayDetails();
        
        student = new Student("Vaibhav", 19, "Diploma");  // Constructor with all parameters
        student.displayDetails();
    }

}