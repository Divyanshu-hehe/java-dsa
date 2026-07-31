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

    // Override toString()
    @Override
    public String toString() {
        return "Name: " + name +
               ", Roll Number: " + rollNumber +
               ", Age: " + age +
               ", Grade: " + grade;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return this.rollNumber == other.rollNumber;
    }
}

// Subclass
class GraduateStudent extends Student {

    // Private attribute
    private String thesisTitle;

    // Constructor
    GraduateStudent(String name, int rollNumber, int age,
                    String grade, String thesisTitle) {

        super(name, rollNumber, age, grade);
        this.thesisTitle = thesisTitle;
    }

    // Getter
    public String getThesisTitle() {
        return thesisTitle;
    }

    // Override toString() using super
    @Override
    public String toString() {
        return super.toString() + ", Thesis: " + thesisTitle;
    }
}

public class question10 {

    public static void main(String[] args) {

        // Test Case 1
        GraduateStudent gs = new GraduateStudent(
                "Meera", 10, 24, "A",
                "Deep Learning for Healthcare");

        System.out.println(gs);
        System.out.println(gs.getThesisTitle());

        System.out.println();

        // Test Case 2
        GraduateStudent gs2 = new GraduateStudent(
                "Zara", 11, 23, "B", "");

        System.out.println(gs2);

        System.out.println();

        // Test Case 3
        GraduateStudent gs3 = new GraduateStudent(
                "Zara K", 11, 26, "C",
                "Other Topic");

        System.out.println(gs2.equals(gs3));
    }
}