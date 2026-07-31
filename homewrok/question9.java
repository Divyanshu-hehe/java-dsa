class Student {

    String name;
    int rollNumber;
    String grade;

    // Constructor
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Static Method
    public static boolean isValidGrade(Object grade) {

        String[] validGrades = {"A", "B", "C", "D", "E", "F"};

        // Check if input is a String
        if (!(grade instanceof String)) {
            return false;
        }

        String g = (String) grade;

        // Check if grade is valid
        for (String valid : validGrades) {
            if (valid.equals(g)) {
                return true;
            }
        }

        return false;
    }
}

public class question9 {

    public static void main(String[] args) {

        // Test Case 1
        System.out.println(Student.isValidGrade("A"));
        System.out.println(Student.isValidGrade("F"));

        // Test Case 2
        System.out.println(Student.isValidGrade("Z"));

        // Test Case 3
        System.out.println(Student.isValidGrade(95));
        System.out.println(Student.isValidGrade(null));
    }
}