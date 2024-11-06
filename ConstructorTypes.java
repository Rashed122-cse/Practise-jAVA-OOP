public class ConstructorTypes {
    
    // Instance variable
    private String name;
    private int age;

    // Default Constructor (provided by Java if no other constructors are defined)
    // If we define any constructor, we won't have this default constructor.

    // No-Argument Constructor
    public ConstructorTypes() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public ConstructorTypes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using No-Argument Constructor
        ConstructorTypes obj1 = new ConstructorTypes();
        obj1.displayInfo();  // Output: Name: Unknown, Age: 0

        // Using Parameterized Constructor
        ConstructorTypes obj2 = new ConstructorTypes("Alice", 30);
        obj2.displayInfo();  // Output: Name: Alice, Age: 30
    }
}
