// Copy constructor
// We must implement them manually in JAVA || Deep copy recommended: Especially for objects containing arrays or other objects || Null checking: Always check for null input
// NEED => When you need to create independent copies of objects.

public class Student {
    private String name;
    private int age;
    private String[] subjects;
    private Address address; // Reference to another object

    // Regular constructor
    public Student(String name, int age, String[] subjects, Address address) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.address = address;
    }

    // Copy constructor - creates a new Student by copying another Student
    public Student(Student other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy from null object");
        }
        
        this.name = other.name;  // String is immutable, so direct assignment is fine
        this.age = other.age;    // Primitive types are copied by value
        
        // Deep copy of array
        if (other.subjects != null) {
            this.subjects = new String[other.subjects.length];
            System.arraycopy(other.subjects, 0, this.subjects, 0, other.subjects.length);
        }
        
        // Deep copy of reference object
        this.address = new Address(other.address);
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String[] getSubjects() { return subjects; }
    public Address getAddress() { return address; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSubjects(String[] subjects) { this.subjects = subjects; }
    public void setAddress(Address address) { this.address = address; }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.print("Subjects: ");
        if (subjects != null) {
            for (int i = 0; i < subjects.length; i++) {
                System.out.print(subjects[i]);
                if (i < subjects.length - 1) System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Address: " + address);
    }
}

// Supporting class for demonstration
class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Copy constructor for Address
    public Address(Address other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy from null address");
        }
        this.street = other.street;
        this.city = other.city;
        this.zipCode = other.zipCode;
    }

    // Getters and setters
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getZipCode() { return zipCode; }
    
    public void setStreet(String street) { this.street = street; }
    public void setCity(String city) { this.city = city; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    @Override
    public String toString() {
        return street + ", " + city + " " + zipCode;
    }
}

// Demo class
class CopyConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Copy Constructor Demo ===\n");

        // Create original student
        String[] subjects = {"Math", "Physics", "Chemistry"};
        Address address = new Address("123 Main St", "New York", "10001");
        Student original = new Student("Alice", 20, subjects, address);

        System.out.println("Original Student:");
        original.displayInfo();
        System.out.println();

        // Create copy using copy constructor
        Student copy = new Student(original);
        System.out.println("Copied Student:");
        copy.displayInfo();
        System.out.println();

        // Modify the original to show they are independent
        original.setName("Alice Modified");
        original.getSubjects()[0] = "Advanced Math";
        original.getAddress().setCity("Boston");

        System.out.println("After modifying original:");
        System.out.println("Original Student:");
        original.displayInfo();
        System.out.println();
        System.out.println("Copied Student (unchanged):");
        copy.displayInfo();
    }
}
