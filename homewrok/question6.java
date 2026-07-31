class Student {
    String name;
    int rollNumber;
    int age;
    int batch;
    String community;

    // Constructor with all parameters
    Student(String name, int rollNumber, int age, int batch, String community) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.batch = batch;
        this.community = community;
    }

    // Constructor with default values
    Student(String name, int rollNumber) {
        this(name, rollNumber, 18, 2025, "theuniques");
    }

    // Constructor with custom age
    Student(String name, int rollNumber, int age) {
        this(name, rollNumber, age, 2025, "theuniques");
    }

    // Override toString()
    @Override
    public String toString() {
        return "Name: " + name +
               ", Roll Number: " + rollNumber +
               ", Age: " + age +
               ", Batch: " + batch +
               ", Community: " + community;
    }
}

public class question6 {
    public static void main(String[] args) {

        // Test Case 1
        Student student1 = new Student("Ronit", 1, 24);
        System.out.println(student1);

        System.out.println();

        // Test Case 2
        Student s = new Student("Priya", 55);
        System.out.println(s);

        System.out.println();

        // Test Case 3
        System.out.println("Record -> " + student1);
    }
}