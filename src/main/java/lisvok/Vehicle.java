package lisvok;

// Base Class for all vehicles
abstract class Vehicle {
    public abstract void start();
}

// Class for vehicles with engines
class EngineVehicle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the engine...");
    }
}

// Class for vehicles without engines
class NonEngineVehicle extends Vehicle {
    @Override
    public void start() {
        System.out.println("This vehicle does not need an engine to start.");
    }
}

// Specific implementation for Car (inherits from EngineVehicle)
class Car extends EngineVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with the ignition key.");
    }
}

// Specific implementation for Motorcycle (inherits from EngineVehicle)
class Motorcycle extends EngineVehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting with a button press.");
    }
}

// Specific implementation for Bicycle (inherits from NonEngineVehicle)
class Bicycle extends NonEngineVehicle {
    @Override
    public void start() {
        System.out.println("Bicycle does not require starting. Just pedal!");
    }
}

// Test class

class Main {
    public static void main(String[] args) {
        // Using Vehicle references for different types of vehicles
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        // Test: Start each vehicle
        System.out.println("Starting vehicles...");
        car.start();         // Output: Car is starting with the ignition key.
        motorcycle.start();  // Output: Motorcycle is starting with a button press.
        bicycle.start();     // Output: Bicycle does not require starting. Just pedal!

        // Test: Polymorphism - Replacing Vehicle with different child classes
        Vehicle[] vehicles = {car, motorcycle, bicycle};
        System.out.println("\nTesting polymorphism:");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
