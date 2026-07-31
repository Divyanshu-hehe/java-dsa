abstract class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract methods
    abstract String introduce();
    abstract String doWork();
}

// Student Class
class Student extends Person {

    Student(String name, int age) {
        super(name, age);
    }

    @Override
    String introduce() {
        return "My name is " + name + ". I am " + age + " years old and I am a student.";
    }

    @Override
    String doWork() {
        return name + " is studying.";
    }
}

// Teacher Class
class Teacher extends Person {

    Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    String introduce() {
        return "My name is " + name + ". I am " + age + " years old and I am a teacher.";
    }

    @Override
    String doWork() {
        return name + " is teaching.";
    }
}

// Doctor Class
class Doctor extends Person {

    Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    String introduce() {
        return "My name is " + name + ". I am " + age + " years old and I am a doctor.";
    }

    @Override
    String doWork() {
        return name + " is treating patients.";
    }
}

public class Question4 {

    // Function
    public static void runDailyRoutine(Person[] people) {
        for (Person person : people) {
            System.out.println(person.introduce());
            System.out.println(person.doWork());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Objects
        Student student1 = new Student("Alice", 20);
        Teacher teacher1 = new Teacher("Mr. Smith", 40);
        Doctor doctor1 = new Doctor("Dr. Rao", 45);

        // Test Case 1
        System.out.println("Test Case 1:");
        runDailyRoutine(new Person[]{student1, teacher1});

        // Test Case 2
        System.out.println("Test Case 2:");
        runDailyRoutine(new Person[]{student1, teacher1, doctor1});

        // Test Case 3
        System.out.println("Test Case 3:");
        runDailyRoutine(new Person[]{});
    }
}