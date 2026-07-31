class Student {
    String name;
    int rollNo;
    private int age;      // Private attribute
    String grade;

    // Constructor
    Student(String name, int rollNo, int age, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.grade = grade;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter (default minimum age = 5)
    public void setAge(int newAge) {
        setAge(newAge, 5);
    }

    // Setter with configurable minimum age
    public void setAge(int newAge, int minimum) {
        if (newAge < minimum) {
            System.out.println("Invalid age. Please enter an age of " + minimum + " or above.");
        } else {
            age = newAge;
        }
    }

    // Overloaded method to handle invalid (non-integer) input
    public void setAge(String newAge) {
        System.out.println("Invalid age. Age must be an integer.");
    }
}

public class question5 {
    public static void main(String[] args) {

        // Test Case 1
        Student s = new Student("Kabir", 3, 22, "B");
        s.setAge(23);
        System.out.println(s.getAge());

        System.out.println();

        // Test Case 2
        s.setAge(-5);
        System.out.println(s.getAge());

        System.out.println();

        // Test Case 3
        s.setAge("twenty");
        System.out.println(s.getAge());
    }
}