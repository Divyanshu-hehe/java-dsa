// ============================================================
//   SECTION 3 ANSWERS: Inheritance (Q11 - Q15)
// ============================================================

// -----------------------------------------------------------
// Q11. Animal -> Dog, Cat (override sound())
// -----------------------------------------------------------
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

// -----------------------------------------------------------
// Q12. Shape -> Circle, Triangle, Rectangle (override area())
// -----------------------------------------------------------
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(String color, double base, double height) {
        super(color);
        this.base   = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class RectangleShape extends Shape {
    double length, breadth;

    RectangleShape(String color, double length, double breadth) {
        super(color);
        this.length  = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// -----------------------------------------------------------
// Q13. Person -> Teacher, Student
// -----------------------------------------------------------
class PersonBase {
    String name;
    int    age;

    PersonBase(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends PersonBase {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class StudentPerson extends PersonBase {
    String grade;

    StudentPerson(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

// -----------------------------------------------------------
// Q14. Multilevel inheritance: Vehicle -> Car -> ElectricCar
// -----------------------------------------------------------
class Vehicle {
    String brand;
    int    speed;  // km/h

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void info() {
        System.out.println("Brand: " + brand + ", Max Speed: " + speed + " km/h");
    }
}

class CarV extends Vehicle {
    int numDoors;

    CarV(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Doors: " + numDoors);
    }
}

class ElectricCar extends CarV {
    int batteryCapacity; // kWh

    ElectricCar(String brand, int speed, int numDoors, int batteryCapacity) {
        super(brand, speed, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

// -----------------------------------------------------------
// Q15. Account -> SavingsAccount, CurrentAccount (interestRate())
// -----------------------------------------------------------
class Account {
    String ownerName;
    double balance;

    Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance   = balance;
    }

    double interestRate() {
        return 0.0;
    }

    void display() {
        System.out.println("Owner: " + ownerName
            + ", Balance: " + balance
            + ", Interest Rate: " + interestRate() + "%");
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    double interestRate() {
        return 4.5; // 4.5%
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    double interestRate() {
        return 2.0; // 2%
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section3_Inheritance {

    public static void main(String[] args) {

        System.out.println("===== Q11: Animal Hierarchy =====");
        Animal[] animals = { new Dog("Rex"), new Cat("Whiskers"), new Animal("Generic") };
        for (Animal a : animals) a.sound();

        System.out.println("\n===== Q12: Shape Hierarchy =====");
        Shape[] shapes = {
            new Circle("Red", 5),
            new Triangle("Blue", 6, 4),
            new RectangleShape("Green", 5, 3)
        };
        for (Shape s : shapes) {
            System.out.printf("%s (%s) area = %.2f%n",
                s.getClass().getSimpleName(), s.color, s.area());
        }

        System.out.println("\n===== Q13: Person -> Teacher / Student =====");
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        StudentPerson s = new StudentPerson("Alice", 20, "A+");
        t.display();
        System.out.println("---");
        s.display();

        System.out.println("\n===== Q14: Multilevel - Vehicle -> Car -> ElectricCar =====");
        ElectricCar ec = new ElectricCar("Tesla", 250, 4, 100);
        ec.info();

        System.out.println("\n===== Q15: Account -> Savings / Current =====");
        Account sa = new SavingsAccount("Alice", 50000);
        Account ca = new CurrentAccount("Bob",   100000);
        sa.display();
        ca.display();
    }
}
