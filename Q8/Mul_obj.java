// multiple object one constructor
// vaibhav bansal 22017C04069
class Student {
    String name;
    int rollNo;
    int age;

    // Constructor with parameters
    Student(String n, int r, int a) {
        name = n;
        rollNo = r;
        age = a;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }
}

public class Mul_obj {
    public static void main(String[] args) {
        // Creating multiple objects using the same constructor
        Student student1 = new Student("John Doe", 101, 20);
        Student student2 = new Student("Jane Smith", 102, 21);
        Student student3 = new Student("Bob Wilson", 103, 19);

        // Displaying details of all students
        System.out.println("Student 1 Details:");
        student1.display();

        System.out.println("Student 2 Details:");
        student2.display();

        System.out.println("Student 3 Details:");
        student3.display();
    }
}