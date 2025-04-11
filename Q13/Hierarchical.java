// Hierarchical Inheritance 
// vaibhav bansal 22017C04069

class Animal {
    protected String species;
    
    Animal(String species) {
        this.species = species;
    }
    
    void display() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {
    private String breed;
    
    Dog(String breed) {
        super("Canine");
        this.breed = breed;
    }
    
    void showDog() {
        System.out.println("\nDog Information:");
        display();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;
    
    Cat(String color) {
        super("Feline");
        this.color = color;
    }
    
    void showCat() {
        System.out.println("\nCat Information:");
        display();
        System.out.println("Color: " + color);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog("German Shepherd");
        Cat cat = new Cat("White");
        
        dog.showDog();
        cat.showCat();
    }
}