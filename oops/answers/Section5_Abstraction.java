// ============================================================
//   SECTION 5 ANSWERS: Abstraction (Q21 - Q25)
// ============================================================

// -----------------------------------------------------------
// Q21. Abstract class Vehicle -> Bike, Car, Truck (fuelType())
// -----------------------------------------------------------
abstract class VehicleA {
    String brand;

    VehicleA(String brand) {
        this.brand = brand;
    }

    // Abstract method — must be implemented by subclasses
    abstract String fuelType();

    void display() {
        System.out.println(brand + " runs on: " + fuelType());
    }
}

class Bike extends VehicleA {
    Bike(String brand) { super(brand); }

    @Override
    String fuelType() { return "Petrol"; }
}

class CarA extends VehicleA {
    CarA(String brand) { super(brand); }

    @Override
    String fuelType() { return "Diesel"; }
}

class Truck extends VehicleA {
    Truck(String brand) { super(brand); }

    @Override
    String fuelType() { return "CNG"; }
}

// -----------------------------------------------------------
// Q22. Abstract Employee -> FullTime, PartTime (calculateSalary())
// -----------------------------------------------------------
abstract class EmployeeA {
    String name;

    EmployeeA(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void display() {
        System.out.printf("%-15s Salary = %.2f%n", name, calculateSalary());
    }
}

class FullTimeEmployee extends EmployeeA {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; // fixed monthly
    }
}

class PartTimeEmployee extends EmployeeA {
    double hourlyRate;
    int    hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate   = hourlyRate;
        this.hoursWorked  = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// -----------------------------------------------------------
// Q23. Abstract Payment -> CreditCard, UPI (process())
// -----------------------------------------------------------
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void process();

    void receipt() {
        System.out.println("Payment of Rs." + amount + " processed via "
            + getClass().getSimpleName());
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void process() {
        System.out.println("Processing credit card payment for card ending "
            + cardNumber.substring(cardNumber.length() - 4));
        receipt();
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void process() {
        System.out.println("Processing UPI payment to: " + upiId);
        receipt();
    }
}

// -----------------------------------------------------------
// Q24. Abstract class WITH a constructor
// -----------------------------------------------------------
abstract class ShapeA {
    String color;

    // Abstract classes CAN have constructors.
    // They are called via super() from the subclass constructor.
    ShapeA(String color) {
        this.color = color;
        System.out.println("ShapeA constructor called with color: " + color);
    }

    abstract double area();
}

class CircleA extends ShapeA {
    double radius;

    CircleA(String color, double radius) {
        super(color); // calls ShapeA's constructor
        this.radius = radius;
    }

    @Override
    double area() { return Math.PI * radius * radius; }
}

// -----------------------------------------------------------
// Q25. Abstract Class vs Interface — differences and when to use
//
//  ABSTRACT CLASS:
//  - Can have state (instance fields with values).
//  - Can have constructors.
//  - Can have concrete (non-abstract) methods.
//  - Supports single inheritance only.
//  - Use when classes share common STATE and BEHAVIOR.
//    e.g., Animal base class with a name field and eat() implementation.
//
//  INTERFACE:
//  - Cannot have instance state (only static/final constants by default).
//  - Cannot have constructors.
//  - All methods are implicitly abstract (before Java 8).
//    Java 8+ allows default & static methods.
//  - Supports multiple implementation (a class can implement many interfaces).
//  - Use to define a CONTRACT/capability shared by unrelated classes.
//    e.g., Serializable, Comparable, Runnable.
//
//  Rule of thumb:
//    "IS-A" relationship with shared code -> abstract class
//    "CAN-DO" capability contract          -> interface
// -----------------------------------------------------------
interface Printable {
    void print(); // contract
}

abstract class Document {
    String title; // shared state

    Document(String title) { this.title = title; }

    void open() { // shared concrete behaviour
        System.out.println("Opening: " + title);
    }

    abstract void save(); // subclass-specific behaviour
}

class Report extends Document implements Printable {
    Report(String title) { super(title); }

    @Override
    public void save()  { System.out.println("Saving report: " + title); }

    @Override
    public void print() { System.out.println("Printing report: " + title); }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section5_Abstraction {

    public static void main(String[] args) {

        System.out.println("===== Q21: Vehicle fuelType() =====");
        VehicleA[] vehicles = { new Bike("Hero"), new CarA("Maruti"), new Truck("Tata") };
        for (VehicleA v : vehicles) v.display();

        System.out.println("\n===== Q22: Employee Salary =====");
        EmployeeA[] employees = {
            new FullTimeEmployee("Alice",  60000),
            new PartTimeEmployee("Bob",    200, 80)
        };
        for (EmployeeA e : employees) e.display();

        System.out.println("\n===== Q23: Payment Processing =====");
        Payment[] payments = {
            new CreditCardPayment(1500, "1234567890123456"),
            new UPIPayment(800, "alice@upi")
        };
        for (Payment p : payments) p.process();

        System.out.println("\n===== Q24: Abstract Class Constructor =====");
        CircleA c = new CircleA("Red", 5);
        System.out.printf("Circle color=%s, area=%.2f%n", c.color, c.area());

        System.out.println("\n===== Q25: Abstract Class vs Interface Demo =====");
        Report report = new Report("Annual Report 2025");
        report.open();   // from abstract class
        report.save();   // overridden abstract method
        report.print();  // from interface
    }
}
