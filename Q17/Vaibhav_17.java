// Q 17. Write a program of hybrid inheritance? (Multiple + Multilevel)
// vaibhav bansal 22017C04069

interface Student {
    void study();
    int getStudyHours();
}

interface Worker {
    void work();
    int getSalary();
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Intern extends Person implements Student, Worker {
    private int studyHours;
    private int salary;
    private String company;
    
    // Constructor
    public Intern(String name, int age, int studyHours, int salary, String company) {
        super(name, age);
        this.studyHours = studyHours;
        this.salary = salary;
        this.company = company;
    }
    
    @Override
    public void study() {
        System.out.println("Studying for " + studyHours + " hours");
    }
    
    @Override
    public int getStudyHours() {
        return studyHours;
    }
    
    @Override
    public void work() {
        System.out.println("Working at " + company);
    }
    
    @Override
    public int getSalary() {
        return salary;
    }
    
    public void showAllDetails() {
        displayInfo();
        
        System.out.println("\nIntern Details:");
        System.out.println("---------------");
        study();
        work();
        System.out.println("Salary: Rs." + getSalary());
        System.out.println("Study Hours: " + getStudyHours() + " hours/day");
    }
}

public class Vaibhav_17 {
    public static void main(String[] args) {
        Intern intern = new Intern(
            "Vaibhav", 
            20, 
            4,
            15000,
            "Tech Corp"
        );
        
        intern.showAllDetails();
        
        System.out.println("\nDemonstrating Multiple Types:");
        System.out.println("----------------------------");
        
        Student student = intern;
        student.study();
        
        // As a Worker
        Worker worker = intern;
        worker.work();
        
        // As a Person
        Person person = intern;
        person.displayInfo();
    }
}