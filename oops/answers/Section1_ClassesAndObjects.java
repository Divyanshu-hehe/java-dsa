// ============================================================
//   SECTION 1 ANSWERS: Classes & Objects (Q1 - Q5)
// ============================================================

// -----------------------------------------------------------
// Q1. Car class with brand, model, year and displayInfo()
// -----------------------------------------------------------
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// -----------------------------------------------------------
// Q2. Rectangle with area() and perimeter()
// -----------------------------------------------------------
class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length  = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

// -----------------------------------------------------------
// Q3. Student with grade()
// -----------------------------------------------------------
class Student {
    String name;
    int    rollNo;
    int    marks;

    Student(String name, int rollNo, int marks) {
        this.name   = name;
        this.rollNo = rollNo;
        this.marks  = marks;
    }

    String grade() {
        return marks >= 40 ? "Pass" : "Fail";
    }
}

// -----------------------------------------------------------
// Q4. BankAccount with deposit() and withdraw()
// -----------------------------------------------------------
class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
    }
}

// -----------------------------------------------------------
// Q5. Temperature with toFahrenheit() and toKelvin()
// -----------------------------------------------------------
class Temperature {
    double celsius;

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    double toFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    double toKelvin() {
        return celsius + 273.15;
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section1_ClassesAndObjects {

    public static void main(String[] args) {

        System.out.println("===== Q1: Car =====");
        Car c1 = new Car("Toyota", "Camry", 2022);
        Car c2 = new Car("Honda",  "Civic", 2021);
        c1.displayInfo();
        c2.displayInfo();

        System.out.println("\n===== Q2: Rectangle =====");
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Area      : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());

        System.out.println("\n===== Q3: Student =====");
        Student s1 = new Student("Alice", 101, 75);
        Student s2 = new Student("Bob",   102, 35);
        System.out.println(s1.name + " -> " + s1.grade());
        System.out.println(s2.name + " -> " + s2.grade());

        System.out.println("\n===== Q4: BankAccount =====");
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);

        System.out.println("\n===== Q5: Temperature =====");
        Temperature t = new Temperature(100);
        System.out.println(t.celsius + "°C = " + t.toFahrenheit() + "°F");
        System.out.println(t.celsius + "°C = " + t.toKelvin()     + " K");
    }
}
