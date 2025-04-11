// Hybrid Inheritance Example (Multiple + Multilevel)
// vaibhav bansal 22017C04069

// First interface - defines studying behavior
interface Student {
    // Method declaration - no implementation
    void study();  // Any class implementing Student MUST define this method
    
    // Method to get study hours
    int getStudyHours();
}

// Second interface - defines working behavior
interface Worker {
    // Method declarations
    void work();  // Any class implementing Worker MUST define this method
    int getSalary();
}

// Base class for all persons
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person details
    public void displayInfo() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Intern class inherits Person class AND implements both interfaces
// This is Hybrid Inheritance (Multilevel through class + Multiple through interfaces)
class Intern extends Person implements Student, Worker {
    private int studyHours;
    private int salary;
    private String company;
    
    // Constructor
    public Intern(String name, int age, int studyHours, int salary, String company) {
        super(name, age);  // Call Person constructor
        this.studyHours = studyHours;
        this.salary = salary;
        this.company = company;
    }
    
    // Implementing Student interface methods
    @Override
    public void study() {
        System.out.println("Studying for " + studyHours + " hours");
    }
    
    @Override
    public int getStudyHours() {
        return studyHours;
    }
    
    // Implementing Worker interface methods
    @Override
    public void work() {
        System.out.println("Working at " + company);
    }
    
    @Override
    public int getSalary() {
        return salary;
    }
    
    // Additional method to show all details
    public void showAllDetails() {
        // Call parent class method
        displayInfo();
        
        System.out.println("\nIntern Details:");
        System.out.println("---------------");
        // Use interface methods
        study();
        work();
        System.out.println("Salary: Rs." + getSalary());
        System.out.println("Study Hours: " + getStudyHours() + " hours/day");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        // Create an Intern object
        Intern intern = new Intern(
            "Vaibhav", 
            20, 
            4,      // study hours
            15000,  // salary
            "Tech Corp"
        );
        
        // Display all information
        intern.showAllDetails();
        
        // We can also use the intern object as any of its types:
        System.out.println("\nDemonstrating Multiple Types:");
        System.out.println("----------------------------");
        
        // As a Student
        Student student = intern;
        student.study();  // Only Student methods available here
        
        // As a Worker
        Worker worker = intern;
        worker.work();    // Only Worker methods available here
        
        // As a Person
        Person person = intern;
        person.displayInfo();  // Only Person methods available here
    }
}