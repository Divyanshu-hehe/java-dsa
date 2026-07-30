// ============================================================
//   SECTION 9 ANSWERS: Mixed / Advanced (Q41 - Q50)
// ============================================================

import java.util.ArrayList;
import java.util.List;

// ============================================================
// Q41. Mini Library System
// ============================================================
class BookLib {
    String title;
    String author;
    boolean isIssued;

    BookLib(String title, String author) {
        this.title    = title;
        this.author   = author;
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return "[" + (isIssued ? "ISSUED" : "AVAILABLE") + "] "
            + title + " by " + author;
    }
}

class Member {
    String name;
    int    memberId;

    Member(String name, int memberId) {
        this.name     = name;
        this.memberId = memberId;
    }
}

class Library {
    private List<BookLib> books = new ArrayList<>();

    void addBook(BookLib b) {
        books.add(b);
        System.out.println("Added: " + b.title);
    }

    void issueBook(String title, Member member) {
        for (BookLib b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (b.isIssued) {
                    System.out.println("'" + title + "' is already issued.");
                } else {
                    b.isIssued = true;
                    System.out.println("'" + title + "' issued to " + member.name);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    void returnBook(String title) {
        for (BookLib b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isIssued) {
                    System.out.println("'" + title + "' was not issued.");
                } else {
                    b.isIssued = false;
                    System.out.println("'" + title + "' returned successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    void listBooks() {
        System.out.println("--- Library Catalog ---");
        for (BookLib b : books) System.out.println("  " + b);
    }
}

// ============================================================
// Q42. ATM System
// ============================================================
class BankAccountATM {
    private String owner;
    private double balance;
    private String pin;

    BankAccountATM(String owner, double balance, String pin) {
        this.owner   = owner;
        this.balance = balance;
        this.pin     = pin;
    }

    boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    double getBalance()             { return balance; }
    void   deposit(double amount)   { balance += amount; }
    boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    String getOwner() { return owner; }
}

class ATM {
    private BankAccountATM account;

    ATM(BankAccountATM account) {
        this.account = account;
    }

    void checkBalance(String pin) {
        if (!account.validatePin(pin)) {
            System.out.println("ATM: Invalid PIN.");
            return;
        }
        System.out.printf("ATM: Balance for %s = Rs. %.2f%n",
            account.getOwner(), account.getBalance());
    }

    void deposit(double amount, String pin) {
        if (!account.validatePin(pin)) { System.out.println("ATM: Invalid PIN."); return; }
        account.deposit(amount);
        System.out.printf("ATM: Deposited Rs. %.2f. New balance: Rs. %.2f%n",
            amount, account.getBalance());
    }

    void withdraw(double amount, String pin) {
        if (!account.validatePin(pin)) { System.out.println("ATM: Invalid PIN."); return; }
        if (account.withdraw(amount)) {
            System.out.printf("ATM: Dispensing Rs. %.2f. Remaining: Rs. %.2f%n",
                amount, account.getBalance());
        } else {
            System.out.println("ATM: Insufficient funds.");
        }
    }
}

// ============================================================
// Q43. Hospital Management System
// ============================================================
class Patient {
    int    patientId;
    String name;
    String disease;

    Patient(int patientId, String name, String disease) {
        this.patientId = patientId;
        this.name      = name;
        this.disease   = disease;
    }

    @Override public String toString() {
        return "Patient[" + patientId + "] " + name + " (" + disease + ")";
    }
}

class Doctor {
    int    doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId       = doctorId;
        this.name           = name;
        this.specialization = specialization;
    }

    @Override public String toString() {
        return "Dr. " + name + " [" + specialization + "]";
    }
}

class Appointment {
    Patient patient;
    Doctor  doctor;
    String  date;

    Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor  = doctor;
        this.date    = date;
    }

    void display() {
        System.out.println("Appointment: " + patient.name
            + " -> " + doctor + " on " + date);
    }
}

// ============================================================
// Q44. Abstract class + Interface: Shape hierarchy
// ============================================================
interface Resizable {
    void resize(double factor);
}

abstract class ShapeHierarchy {
    String color;

    ShapeHierarchy(String color) { this.color = color; }

    abstract double area();

    void display() {
        System.out.printf("%s [%s] area = %.2f%n",
            getClass().getSimpleName(), color, area());
    }
}

class ResizableCircle extends ShapeHierarchy implements Resizable {
    double radius;

    ResizableCircle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override public double area()              { return Math.PI * radius * radius; }
    @Override public void resize(double factor) { radius *= factor; }
}

class ResizableRectangle extends ShapeHierarchy implements Resizable {
    double length, width;

    ResizableRectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width  = width;
    }

    @Override public double area()              { return length * width; }
    @Override public void resize(double factor) { length *= factor; width *= factor; }
}

// ============================================================
// Q45. instanceof operator with hierarchy
// ============================================================
class AnimalH {}
class DogH extends AnimalH {}
class GoldenRetriever extends DogH {}

// ============================================================
// Q46. Upcasting and Downcasting
// ============================================================
class VehicleUD {
    void move() { System.out.println("Vehicle is moving"); }
}

class CarUD extends VehicleUD {
    void honk() { System.out.println("Car is honking!"); }
}

// ============================================================
// Q47. Stack implementation using OOP
// ============================================================
class Stack {
    private int[] data;
    private int   top;
    private int   capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        this.data     = new int[capacity];
        this.top      = -1;
    }

    void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + val);
            return;
        }
        data[++top] = val;
    }

    int pop() {
        if (isEmpty()) throw new RuntimeException("Stack Underflow!");
        return data[top--];
    }

    int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty!");
        return data[top];
    }

    boolean isEmpty() { return top == -1; }
    int     size()    { return top + 1; }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) sb.append(data[i]).append(" ");
        return sb.toString();
    }
}

// ============================================================
// Q48. School System: Person -> Teacher, Student + Gradable interface
// ============================================================
interface Gradable {
    String getGrade();
}

class PersonS {
    protected String name;
    PersonS(String name) { this.name = name; }
    void introduce() { System.out.println("Hi, I'm " + name); }
}

class TeacherS extends PersonS {
    String subject;
    TeacherS(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm " + name + ", I teach " + subject);
    }
}

class StudentS extends PersonS implements Gradable {
    int marks;

    StudentS(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    @Override
    public String getGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 75) return "A";
        if (marks >= 60) return "B";
        if (marks >= 40) return "C";
        return "F";
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm student " + name + " | Grade: " + getGrade());
    }
}

// ============================================================
// Q49. SOLID Principles — one example each
//
//  S — Single Responsibility Principle (SRP)
//      A class should have only one reason to change.
//
//  O — Open/Closed Principle (OCP)
//      Open for extension, closed for modification.
//
//  L — Liskov Substitution Principle (LSP)
//      Subtypes must be substitutable for their base types.
//
//  I — Interface Segregation Principle (ISP)
//      Prefer small, focused interfaces over one fat interface.
//
//  D — Dependency Inversion Principle (DIP)
//      Depend on abstractions, not concretions.
// ============================================================

// S — SRP: separate class per responsibility
class Invoice {
    double amount;
    Invoice(double amount) { this.amount = amount; }
}

class InvoicePrinter {           // Only prints
    void print(Invoice inv) { System.out.println("Invoice: Rs." + inv.amount); }
}

class InvoiceSaver {             // Only saves
    void save(Invoice inv) { System.out.println("Invoice saved to DB: Rs." + inv.amount); }
}

// O — OCP: add new discount via extension, not modification
abstract class Discount {
    abstract double apply(double price);
}
class NoDiscount       extends Discount { double apply(double p) { return p; } }
class TenPercentOff    extends Discount { double apply(double p) { return p * 0.9; } }
class TwentyPercentOff extends Discount { double apply(double p) { return p * 0.8; } }

// L — LSP: subtype must honor base-type contract
class BirdLSP  { void move() { System.out.println("Bird moves"); } }
class Eagle    extends BirdLSP { @Override void move() { System.out.println("Eagle flies"); } }
class Penguin  extends BirdLSP { @Override void move() { System.out.println("Penguin walks"); } }

// I — ISP: segregated interfaces
interface Workable   { void work(); }
interface Eatable    { void eat(); }
class HumanWorker implements Workable, Eatable {
    public void work() { System.out.println("Human works"); }
    public void eat()  { System.out.println("Human eats"); }
}
class RobotWorker implements Workable {
    public void work() { System.out.println("Robot works"); }
    // Robot does NOT eat — not forced to implement eat()
}

// D — DIP: depend on abstraction (Notifier), not concrete (EmailService)
interface Notifier { void send(String message); }
class EmailNotifier implements Notifier {
    public void send(String msg) { System.out.println("Email: " + msg); }
}
class SMSNotifier implements Notifier {
    public void send(String msg) { System.out.println("SMS: " + msg); }
}
class OrderService {
    private Notifier notifier; // depends on abstraction
    OrderService(Notifier notifier) { this.notifier = notifier; }
    void placeOrder(String item) {
        System.out.println("Order placed: " + item);
        notifier.send("Your order '" + item + "' is confirmed.");
    }
}

// ============================================================
// Q50. Singleton Pattern — AppConfig
// ============================================================
class AppConfig {
    private static AppConfig instance = null; // single instance

    private String appName;
    private String version;

    // Private constructor — prevents direct instantiation
    private AppConfig() {
        appName = "MyJavaApp";
        version = "1.0.0";
    }

    // Global access point
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
            System.out.println("AppConfig instance created.");
        }
        return instance;
    }

    public String getAppName() { return appName; }
    public String getVersion() { return version; }
    public void   setAppName(String name) { this.appName = name; }
}

// ============================================================
// Main — run all demos
// ============================================================
public class Section9_MixedAdvanced {

    public static void main(String[] args) {

        // Q41
        System.out.println("===== Q41: Library System =====");
        Library lib = new Library();
        lib.addBook(new BookLib("Clean Code", "Robert Martin"));
        lib.addBook(new BookLib("Effective Java", "Joshua Bloch"));
        lib.addBook(new BookLib("Design Patterns", "Gang of Four"));
        Member m1 = new Member("Alice", 1);
        lib.issueBook("Clean Code", m1);
        lib.issueBook("Clean Code", m1); // already issued
        lib.listBooks();
        lib.returnBook("Clean Code");
        lib.listBooks();

        // Q42
        System.out.println("\n===== Q42: ATM System =====");
        BankAccountATM acc = new BankAccountATM("Bob", 10000, "1234");
        ATM atm = new ATM(acc);
        atm.checkBalance("1234");
        atm.deposit(2000, "1234");
        atm.withdraw(5000, "1234");
        atm.withdraw(50000, "1234"); // insufficient
        atm.checkBalance("0000");   // wrong pin

        // Q43
        System.out.println("\n===== Q43: Hospital Management =====");
        Patient  p   = new Patient(1, "John", "Fever");
        Doctor   d   = new Doctor(101, "Smith", "General Medicine");
        Appointment a = new Appointment(p, d, "2025-08-01");
        a.display();

        // Q44
        System.out.println("\n===== Q44: Resizable Shape Hierarchy =====");
        ResizableCircle    rc = new ResizableCircle("Red", 5);
        ResizableRectangle rr = new ResizableRectangle("Blue", 4, 3);
        rc.display();
        rr.display();
        rc.resize(2);  // double the radius
        rr.resize(1.5);
        System.out.println("After resize:");
        rc.display();
        rr.display();

        // Q45
        System.out.println("\n===== Q45: instanceof Operator =====");
        GoldenRetriever gr = new GoldenRetriever();
        System.out.println("gr instanceof GoldenRetriever : " + (gr instanceof GoldenRetriever));
        System.out.println("gr instanceof DogH            : " + (gr instanceof DogH));
        System.out.println("gr instanceof AnimalH         : " + (gr instanceof AnimalH));

        AnimalH ah = new DogH();
        System.out.println("ah instanceof DogH            : " + (ah instanceof DogH));
        System.out.println("ah instanceof GoldenRetriever : " + (ah instanceof GoldenRetriever));

        // Q46
        System.out.println("\n===== Q46: Upcasting & Downcasting =====");
        // Upcasting (implicit — always safe)
        VehicleUD v = new CarUD();   // upcast: CarUD -> VehicleUD
        v.move();
        // v.honk(); // compile error — VehicleUD reference can't see honk()

        // Downcasting (explicit — may throw ClassCastException)
        if (v instanceof CarUD) {
            CarUD c = (CarUD) v;     // safe downcast
            c.honk();
        }

        // Unsafe downcast — guarded with instanceof
        VehicleUD v2 = new VehicleUD();
        if (v2 instanceof CarUD) {
            CarUD c2 = (CarUD) v2;
            c2.honk();
        } else {
            System.out.println("v2 is not a CarUD — skipping downcast.");
        }

        // Q47
        System.out.println("\n===== Q47: Stack =====");
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop : " + stack.pop());
        System.out.println(stack);
        System.out.println("Size: " + stack.size());

        // Q48
        System.out.println("\n===== Q48: School System =====");
        List<PersonS> people = new ArrayList<>();
        people.add(new TeacherS("Mr. Sharma", "Math"));
        people.add(new StudentS("Alice", 92));
        people.add(new StudentS("Bob",   55));
        people.add(new TeacherS("Ms. Priya", "Science"));

        // Polymorphic loop
        for (PersonS person : people) {
            person.introduce();
        }

        // Q49
        System.out.println("\n===== Q49: SOLID Principles =====");

        System.out.println("-- S: Single Responsibility --");
        Invoice inv = new Invoice(1500);
        new InvoicePrinter().print(inv);
        new InvoiceSaver().save(inv);

        System.out.println("-- O: Open/Closed --");
        Discount d1 = new TenPercentOff();
        Discount d2 = new TwentyPercentOff();
        System.out.println("10% off 1000 = " + d1.apply(1000));
        System.out.println("20% off 1000 = " + d2.apply(1000));

        System.out.println("-- L: Liskov Substitution --");
        BirdLSP[] birds = { new Eagle(), new Penguin() };
        for (BirdLSP b : birds) b.move(); // both work as BirdLSP

        System.out.println("-- I: Interface Segregation --");
        new HumanWorker().work();
        new HumanWorker().eat();
        new RobotWorker().work();
        // RobotWorker has no eat() — not forced by ISP

        System.out.println("-- D: Dependency Inversion --");
        OrderService emailOrder = new OrderService(new EmailNotifier());
        OrderService smsOrder   = new OrderService(new SMSNotifier());
        emailOrder.placeOrder("Laptop");
        smsOrder.placeOrder("Phone");

        // Q50
        System.out.println("\n===== Q50: Singleton AppConfig =====");
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance(); // same instance
        System.out.println("App: " + config1.getAppName() + " v" + config1.getVersion());
        System.out.println("Same instance? " + (config1 == config2)); // true

        config1.setAppName("UpdatedApp");
        System.out.println("config2.getAppName() = " + config2.getAppName()); // UpdatedApp (same object)
    }
}
