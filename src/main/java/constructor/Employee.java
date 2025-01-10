package constructor;

public class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Test Copy Constructor
    public static void main(String[] args) {
        Employee original = new Employee("John", 30);
        Employee copy = new Employee(original);

        System.out.println("Original: " + original.getName() + ", " + original.getAge());
        System.out.println("Copy: " + copy.getName() + ", " + copy.getAge());
    }
}