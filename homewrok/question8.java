class Student {

    String name;
    int rollNumber;

    // Static (Class) Attribute
    private static int totalStudents = 0;

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    // Static Method (Equivalent to @classmethod)
    public static int getTotalStudents() {
        return totalStudents;
    }
}

public class Question8 {

    public static void main(String[] args) {

        // Test Case 1
        System.out.println(Student.getTotalStudents());

        // Test Case 2
        Student s1 = new Student("A", 1);
        Student s2 = new Student("B", 2);
        Student s3 = new Student("C", 3);

        System.out.println(Student.getTotalStudents());

        // Test Case 3
        // Static methods can also be called using an object,
        // although calling them with the class name is recommended.
        System.out.println(s1.getTotalStudents());
    }
}