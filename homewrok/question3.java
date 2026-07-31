abstract class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract methods
    abstract void doWork();
    abstract int getSalary();
}

// Student is still abstract because getSalary() is not implemented
abstract class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void doWork() {
        System.out.println(name + " is studying.");
    }

    // getSalary() is not implemented,
    // so Student must also be abstract.
}

// Teacher implements both abstract methods
class Teacher extends Person {
    String subject;
    int yearsExperience;

    Teacher(String name, int age, String subject, int yearsExperience) {
        super(name, age);
        this.subject = subject;
        this.yearsExperience = yearsExperience;
    }

    @Override
    void doWork() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    @Override
    int getSalary() {
        int basePay = 50000;
        int bonus = 2000;
        return basePay + (yearsExperience * bonus);
    }
}

public class question3 {
    public static void main(String[] args) {

        // Test Case 1
        Teacher t1 = new Teacher("Mr. Smith", 40, "Mathematics", 5);
        System.out.println(t1.getSalary());

        // Test Case 2
        Teacher t2 = new Teacher("Ms. Rai", 24, "Physics", 0);
        System.out.println(t2.getSalary());

        // Test Case 3
        // Student s = new Student("Alice", 20, 101);
        // ERROR:
        // Cannot instantiate the abstract class Student.
    }
}