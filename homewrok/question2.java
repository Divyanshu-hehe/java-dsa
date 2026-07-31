abstract class Person {

    // Abstract method
    abstract void doWork();
}

// Concrete class
class Student extends Person {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    void doWork() {
        System.out.println("Studying");
    }
}

public class question2 {

    // Reusable method
    public static void tryInstantiate(String className, String... args) {
        try {
            if (className.equals("Person")) {
                // Cannot instantiate an abstract class
                throw new InstantiationException("Person is abstract; cannot be instantiated.");
            } else if (className.equals("Student")) {

                if (args.length == 0) {
                    throw new IllegalArgumentException(
                            "Student constructor requires a name.");
                }

                Student s = new Student(args[0]);
                System.out.println("Object Created Successfully");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        tryInstantiate("Person");

        // Test Case 2
        tryInstantiate("Student", "Alice");

        // Test Case 3
        tryInstantiate("Student");
    }
}