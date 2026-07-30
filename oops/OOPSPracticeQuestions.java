// ============================================================
//         OOP IN JAVA - PRACTICE QUESTIONS
// ============================================================

/*
 * This file contains categorized OOP practice questions in Java.
 * Topics covered:
 *   1. Classes & Objects
 *   2. Constructors
 *   3. Inheritance
 *   4. Polymorphism
 *   5. Abstraction
 *   6. Encapsulation
 *   7. Interfaces
 *   8. Static & Final
 *   9. Mixed / Advanced
 */

public class OOPSPracticeQuestions {

    // -------------------------------------------------------
    // SECTION 1: Classes & Objects
    // -------------------------------------------------------
    /*
     * Q1. Create a class `Car` with fields: brand, model, year.
     *     Add a method `displayInfo()` that prints all details.
     *     Create two objects and call displayInfo().
     *
     * Q2. Create a class `Rectangle` with length and breadth.
     *     Add methods area() and perimeter(). Test them.
     *
     * Q3. Create a class `Student` with name, rollNo, marks.
     *     Add a method grade() that returns "Pass" if marks >= 40, else "Fail".
     *
     * Q4. Create a class `BankAccount` with balance field.
     *     Add methods deposit(amount) and withdraw(amount) with proper validation.
     *
     * Q5. Create a class `Temperature` with a value in Celsius.
     *     Add methods toFahrenheit() and toKelvin().
     */

    // -------------------------------------------------------
    // SECTION 2: Constructors
    // -------------------------------------------------------
    /*
     * Q6.  Create a class `Book` with title and price.
     *      Write a default constructor and a parameterized constructor.
     *
     * Q7.  Create a class `Employee` with name, id, salary.
     *      Use constructor overloading — one with only name, another with all three.
     *
     * Q8.  Create a class `Box` with length, width, height.
     *      Write a copy constructor that copies one Box to another.
     *
     * Q9.  Create a class `Counter` with count = 0.
     *      Use a constructor to start counting from a given number.
     *      Add increment() and decrement() methods.
     *
     * Q10. Explain and demonstrate constructor chaining using `this()`.
     */

    // -------------------------------------------------------
    // SECTION 3: Inheritance
    // -------------------------------------------------------
    /*
     * Q11. Create a base class `Animal` with method sound().
     *      Extend it in `Dog` and `Cat`, overriding sound() in each.
     *
     * Q12. Create a class `Shape` with a method area().
     *      Extend it in `Circle`, `Triangle`, and `Rectangle`.
     *      Override area() in each subclass.
     *
     * Q13. Create a class `Person` with name and age.
     *      Extend it in `Teacher` (add subject) and `Student` (add grade).
     *
     * Q14. Demonstrate multilevel inheritance:
     *      Vehicle -> Car -> ElectricCar
     *      Add relevant fields at each level and call super().
     *
     * Q15. Create a class `Account` and extend it in `SavingsAccount` and
     *      `CurrentAccount`. Override the interestRate() method in each.
     */

    // -------------------------------------------------------
    // SECTION 4: Polymorphism
    // -------------------------------------------------------
    /*
     * Q16. Demonstrate method overloading in a class `MathUtils`:
     *      add(int, int), add(double, double), add(int, int, int).
     *
     * Q17. Demonstrate method overriding with a parent class `Printer`
     *      and child class `LaserPrinter`. Override print().
     *
     * Q18. Create an array of `Shape` references holding
     *      Circle, Rectangle, Triangle objects. Call area() on each
     *      using a loop — demonstrate runtime polymorphism.
     *
     * Q19. What is the difference between compile-time and runtime
     *      polymorphism? Give one Java example of each.
     *
     * Q20. Can we override a static method in Java? Demonstrate
     *      method hiding vs method overriding.
     */

    // -------------------------------------------------------
    // SECTION 5: Abstraction
    // -------------------------------------------------------
    /*
     * Q21. Create an abstract class `Vehicle` with an abstract method
     *      fuelType(). Implement it in `Bike`, `Car`, `Truck`.
     *
     * Q22. Create an abstract class `Employee` with abstract method
     *      calculateSalary(). Implement for `FullTimeEmployee` and
     *      `PartTimeEmployee`.
     *
     * Q23. Design an abstract class `Payment` with process() as abstract.
     *      Extend it in `CreditCardPayment` and `UPIPayment`.
     *
     * Q24. Can an abstract class have a constructor? Demonstrate with an example.
     *
     * Q25. What is the difference between abstract class and interface?
     *      Give a practical example of when to use each.
     */

    // -------------------------------------------------------
    // SECTION 6: Encapsulation
    // -------------------------------------------------------
    /*
     * Q26. Create a class `Person` with private fields name, age, email.
     *      Use getters and setters with validation (age must be > 0).
     *
     * Q27. Create a class `BankAccount` with a private balance.
     *      Only allow deposit/withdraw through public methods.
     *      Prevent balance from going negative.
     *
     * Q28. Create a fully encapsulated class `Product` with
     *      id, name, price. Ensure price cannot be set to a negative value.
     *
     * Q29. Explain why encapsulation is important with a real-world example.
     *
     * Q30. Create a class `Config` where all fields are private and final,
     *      set only via constructor. Demonstrate an immutable class.
     */

    // -------------------------------------------------------
    // SECTION 7: Interfaces
    // -------------------------------------------------------
    /*
     * Q31. Create an interface `Drawable` with draw(). Implement it
     *      in `Circle`, `Square`, `Triangle`.
     *
     * Q32. Create interfaces `Flyable` and `Swimmable`.
     *      Create a `Duck` class that implements both.
     *
     * Q33. Demonstrate interface with default method. Create interface
     *      `Logger` with a default log(String msg) method.
     *
     * Q34. Create interface `Sortable` with sort(int[] arr).
     *      Implement in `BubbleSort` and `SelectionSort` classes.
     *
     * Q35. Demonstrate functional interface and lambda expression.
     *      Create a functional interface `Greeting` with greet(String name).
     */

    // -------------------------------------------------------
    // SECTION 8: Static & Final
    // -------------------------------------------------------
    /*
     * Q36. Create a class `Counter` with a static variable count.
     *      Every time an object is created, count should increment.
     *      Display total objects created.
     *
     * Q37. Create a class `MathConstants` with static final values
     *      like PI, E. Use them in area/perimeter calculations.
     *
     * Q38. Create a final class `Utility` with static helper methods.
     *      (e.g., isPrime, factorial, reverse)
     *      Show that it cannot be extended.
     *
     * Q39. What is a static block? Demonstrate static initialization block.
     *
     * Q40. Explain the difference between final variable, final method,
     *      and final class with examples.
     */

    // -------------------------------------------------------
    // SECTION 9: Mixed / Advanced
    // -------------------------------------------------------
    /*
     * Q41. Design a mini Library System using OOP:
     *      Classes: Book, Member, Library
     *      Features: addBook, issueBook, returnBook, listBooks
     *
     * Q42. Implement a simple ATM system using OOP with:
     *      BankAccount (encapsulated), ATM (operations: deposit, withdraw, balance)
     *
     * Q43. Design a Hospital Management System with:
     *      Patient, Doctor, Appointment classes
     *
     * Q44. Create a Shape hierarchy using abstract class + interface:
     *      - Abstract class: Shape (color, area())
     *      - Interface: Resizable (resize(double factor))
     *      - Classes: Circle, Rectangle implement both
     *
     * Q45. Demonstrate the `instanceof` operator with a class hierarchy.
     *      Create Animal > Dog > GoldenRetriever and test instanceof.
     *
     * Q46. What is upcasting and downcasting in Java? Demonstrate with
     *      a Vehicle -> Car example. Handle ClassCastException.
     *
     * Q47. Implement a simple Stack class using OOP with:
     *      push(), pop(), peek(), isEmpty(), size()
     *
     * Q48. Design a School system with:
     *      Person (base) -> Teacher, Student
     *      Use an interface `Gradable` for students.
     *      Demonstrate polymorphism in a list of Person objects.
     *
     * Q49. Explain and demonstrate the SOLID principles with small
     *      Java examples (one per principle).
     *
     * Q50. Create a Singleton class `AppConfig` that holds application
     *      configuration and ensures only one instance exists.
     */

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   OOP in Java - Practice Questions");
        System.out.println("========================================");
        System.out.println("50 questions across 9 OOP topics.");
        System.out.println("Start solving from Section 1 and work up!");
        System.out.println("Good luck!");
    }
}
