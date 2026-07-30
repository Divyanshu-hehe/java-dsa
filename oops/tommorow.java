class Student {
    // Static (Class) Variables
    static String batch = "2025";
    static String community = "The uniques";

    // Instance Variables
    String name;
    int age;
    int rollNumber;
    private String marks;

    // Constructor with all parameters
    Student(String name, int rollNumber, String marks, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.age = age;
    }

    // Constructor with default age = 18
    Student(String name, int rollNumber, String marks) {
        this(name, rollNumber, marks, 18);
    }

    // Method
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    // Method
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday " + name);
    }

    // Getter
    public String getMarks() {
        return marks;
    }

    // Setter
    public void setMarks(String marks) {
        if (marks.equals("A") || marks.equals("B") || marks.equals("C")) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}

public class tommorow {
    public static void main(String[] args) {
          Student student1 = new Student("divyanshu", 20, "A", 34);
        Student student2 = new Student("ramesh", 21, "B");

        System.out.println(student1.name);
        System.out.println(student1.rollNumber);
        System.out.println(student1.age);

        System.out.println(student2.name);
        System.out.println(student2.rollNumber);
        System.out.println(student2.age);

        System.out.println(student1.greet());

        student1.celebrateBirthday();
        System.out.println(student1.age);

        System.out.println(student1.getMarks());

        student1.setMarks("H"); // Invalid
        System.out.println(student1.getMarks());

        student1.setMarks("C"); // Valid
        System.out.println(student1.getMarks());
    }
    
}
