// Q 12. Write a program of multi-level inheritance? 
// vaibhav bansal 22017C04069

class Vehicle {
    private String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private int wheels;
    
    Car(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }
    
    void displayWheels() {
        System.out.println("Number of wheels: " + wheels);
    }
}

class Motorcycle extends Vehicle {
    private String type;
    
    Motorcycle(String brand, String type) {
        super(brand);
        this.type = type;
    }
    
    void displayType() {
        System.out.println("Motorcycle Type: " + type);
    }
}

class SportsCar extends Car {
    private int topSpeed;
    
    SportsCar(String brand, int wheels, int topSpeed) {
        super(brand, wheels);
        this.topSpeed = topSpeed;
    }
    
    void showDetails() {
        System.out.println("Sports Car Details:");
        System.out.println("------------------");
        displayBrand();
        displayWheels();
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;
    
    ElectricCar(String brand, int wheels, int batteryCapacity) {
        super(brand, wheels);
        this.batteryCapacity = batteryCapacity;
    }
    
    void displayBatteryInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Vaibhav_12 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari", 4, 320);
        sportsCar.showDetails();
        
        System.out.println("\nElectric Car Details:");
        ElectricCar electricCar = new ElectricCar("Tesla", 4, 100);
        electricCar.displayBrand();
        electricCar.displayWheels();
        electricCar.displayBatteryInfo();
        
        System.out.println("\nMotorcycle Details:");
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Cruiser");
        bike.displayBrand();
        bike.displayType();
    }
}