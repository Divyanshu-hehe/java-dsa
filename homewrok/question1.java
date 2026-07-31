abstract class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Normal method
    public String introduce() {
        return "My name is " + name + ".";
    }

    // Abstract method
    abstract String doWork();
}

// Subclass
class Doctor extends Person {
    String specialization;

    // Constructor
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Method overriding
    @Override
    public String introduce() {
        return "My name is " + name + ". I specialize in " + specialization + ".";
    }

    @Override
    public String doWork() {
        return name + " is treating patients.";
    }
}

// Main class
public class question1 {
    public static void main(String[] args) {

        Doctor p1 = new Doctor("Dr. Rao", 45, "Cardiology");
        System.out.println(p1.introduce());
        System.out.println(p1.doWork());

        Doctor p2 = new Doctor("Dr. Sharma", 38, "Neurology");
        System.out.println(p2.introduce());
        System.out.println(p2.doWork());

        Doctor p3 = new Doctor("Dr. Lin", 33, "");
        System.out.println(p3.introduce());
        System.out.println(p3.doWork());
    }
}