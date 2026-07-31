class Student {
    String name;
    int rollNumber;
    int age;
    String grade;

    // Constructor
    Student(String name, int rollNumber, int age, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {

        // Check if both references point to the same object
        if (this == obj) {
            return true;
        }

        // Check if obj is a Student object
        if (!(obj instanceof Student)) {
            return false;
        }

        // Type cast
        Student other = (Student) obj;

        // Compare roll numbers
        return this.rollNumber == other.rollNumber;
    }
}

public class question7 {
    public static void main(String[] args) {

        // Test Case 1
        Student a = new Student("Ronit", 1, 24, "A");
        Student b = new Student("Ronit K", 1, 25, "B");

        System.out.println(a.equals(b));

        // Test Case 2
        Student c = new Student("Romnit", 2, 24, "B");

        System.out.println(a.equals(c));

        // Test Case 3
        System.out.println(a.equals("Ronit"));
        System.out.println(a.equals(1));
    }
}