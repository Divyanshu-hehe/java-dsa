// ============================================================
//   SECTION 2 ANSWERS: Constructors (Q6 - Q10)
// ============================================================

// -----------------------------------------------------------
// Q6. Book with default and parameterized constructor
// -----------------------------------------------------------
class Book {
    String title;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

// -----------------------------------------------------------
// Q7. Employee with constructor overloading
// -----------------------------------------------------------
class Employee {
    String name;
    int    id;
    double salary;

    // Constructor with only name
    Employee(String name) {
        this.name   = name;
        this.id     = 0;
        this.salary = 0.0;
    }

    // Constructor with all three fields
    Employee(String name, int id, double salary) {
        this.name   = name;
        this.id     = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// -----------------------------------------------------------
// Q8. Box with a copy constructor
// -----------------------------------------------------------
class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width  = width;
        this.height = height;
    }

    // Copy constructor
    Box(Box other) {
        this.length = other.length;
        this.width  = other.width;
        this.height = other.height;
    }

    void display() {
        System.out.println("Box [" + length + " x " + width + " x " + height + "]");
    }
}

// -----------------------------------------------------------
// Q9. Counter starting from a given number
// -----------------------------------------------------------
class Counter {
    int count;

    Counter(int startFrom) {
        this.count = startFrom;
    }

    void increment() { count++; }
    void decrement() { count--; }

    void display() {
        System.out.println("Count: " + count);
    }
}

// -----------------------------------------------------------
// Q10. Constructor chaining using this()
// -----------------------------------------------------------
class Person {
    String name;
    int    age;
    String city;

    // Calls the 3-arg constructor via this()
    Person() {
        this("Unknown", 0, "Unknown");
        System.out.println("No-arg constructor called");
    }

    Person(String name, int age) {
        this(name, age, "Unknown");
        System.out.println("Two-arg constructor called");
    }

    Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
        System.out.println("Three-arg constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section2_Constructors {

    public static void main(String[] args) {

        System.out.println("===== Q6: Book =====");
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 499.0);
        b1.display();
        b2.display();

        System.out.println("\n===== Q7: Employee Overloading =====");
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob", 101, 55000);
        e1.display();
        e2.display();

        System.out.println("\n===== Q8: Box Copy Constructor =====");
        Box original = new Box(3, 4, 5);
        Box copy     = new Box(original);
        original.display();
        copy.display();
        System.out.println("Are they same object? " + (original == copy)); // false

        System.out.println("\n===== Q9: Counter =====");
        Counter c = new Counter(10);
        c.display();
        c.increment();
        c.increment();
        c.display();
        c.decrement();
        c.display();

        System.out.println("\n===== Q10: Constructor Chaining =====");
        System.out.println("-- Creating with no-arg --");
        Person p1 = new Person();
        p1.display();

        System.out.println("-- Creating with two-arg --");
        Person p2 = new Person("Alice", 25);
        p2.display();

        System.out.println("-- Creating with three-arg --");
        Person p3 = new Person("Bob", 30, "Delhi");
        p3.display();
    }
}
