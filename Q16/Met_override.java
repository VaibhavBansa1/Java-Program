// method overriding
// vaibhav bansal 22017C04069

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void makeSound() {
        System.out.println(name + " makes a generic sound");
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void makeSound() {
        System.out.println(getName() + " the " + breed + " barks: Woof!");
    }

    void sleep() {
        System.out.println(getName() + " the " + breed + " sleeps in its kennel");
    }
}

class Cat extends Animal {
    private String color;

    Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    void makeSound() {
        System.out.println(getName() + " the " + color + " cat meows: Meow!");
    }

    void sleep() {
        System.out.println(getName() + " the " + color + " cat sleeps on the windowsill");
    }
}

public class Met_override {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Max", "German Shepherd");
        Cat cat = new Cat("Luna", "White");

        System.out.println("Method Overriding Example:");
        System.out.println("-------------------------");
        
        genericAnimal.makeSound();
        genericAnimal.sleep();
        System.out.println();
        
        dog.makeSound();
        dog.sleep();
        System.out.println();
        
        cat.makeSound();
        cat.sleep();
    }
}