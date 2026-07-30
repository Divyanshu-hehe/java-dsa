// ============================================================
//   SECTION 6 ANSWERS: Encapsulation (Q26 - Q30)
// ============================================================

// -----------------------------------------------------------
// Q26. Encapsulated Person with validated getters/setters
// -----------------------------------------------------------
class PersonE {
    private String name;
    private int    age;
    private String email;

    public String getName()  { return name; }
    public int    getAge()   { return age; }
    public String getEmail() { return email; }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new IllegalArgumentException("Age must be greater than 0.");
        this.age = age;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Invalid email address.");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}

// -----------------------------------------------------------
// Q27. BankAccount — private balance, public deposit/withdraw
// -----------------------------------------------------------
class BankAccountE {
    private double balance;

    public BankAccountE(double initialBalance) {
        if (initialBalance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        this.balance = initialBalance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited %.2f | New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.printf("Withdrawn %.2f | New balance: %.2f%n", amount, balance);
        }
    }
}

// -----------------------------------------------------------
// Q28. Encapsulated Product (price cannot be negative)
// -----------------------------------------------------------
class Product {
    private int    id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id   = id;
        this.name = name;
        setPrice(price); // use setter for validation even in constructor
    }

    public int    getId()    { return id; }
    public String getName()  { return name; }
    public double getPrice() { return price; }

    public void setId(int id)       { this.id = id; }
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Product name cannot be empty.");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

// -----------------------------------------------------------
// Q29. Why Encapsulation Matters (real-world analogy in code)
//
//  REAL-WORLD ANALOGY: ATM Machine
//  - You interact with the ATM only through its buttons/screen.
//  - You cannot directly touch the cash inside.
//  - The internal mechanism (balance, authentication) is hidden.
//  - The ATM exposes only safe, controlled operations.
//
//  BENEFITS:
//  1. Data hiding  — internal state cannot be corrupted from outside.
//  2. Validation   — setters enforce rules before changing state.
//  3. Flexibility  — internal implementation can change without
//                    breaking external code (callers use getters/setters).
//  4. Readability  — clear API surface tells users what is allowed.
//
//  BAD (no encapsulation):
//      student.marks = -50;  // nothing stops invalid data
//
//  GOOD (encapsulated):
//      student.setMarks(-50); // throws IllegalArgumentException
// -----------------------------------------------------------

// -----------------------------------------------------------
// Q30. Immutable class — all fields private final, set via constructor
// -----------------------------------------------------------
final class Config {           // final class: cannot be subclassed
    private final String dbUrl;
    private final int    port;
    private final String appName;

    public Config(String dbUrl, int port, String appName) {
        this.dbUrl   = dbUrl;
        this.port    = port;
        this.appName = appName;
    }

    // Only getters — no setters (immutable)
    public String getDbUrl()   { return dbUrl; }
    public int    getPort()    { return port; }
    public String getAppName() { return appName; }

    @Override
    public String toString() {
        return "Config{dbUrl='" + dbUrl + "', port=" + port
            + ", appName='" + appName + "'}";
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section6_Encapsulation {

    public static void main(String[] args) {

        // Q26
        System.out.println("===== Q26: Person with Validation =====");
        PersonE p = new PersonE();
        p.setName("Alice");
        p.setAge(25);
        p.setEmail("alice@example.com");
        System.out.println(p);

        try {
            p.setAge(-5); // should throw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Q27
        System.out.println("\n===== Q27: BankAccount =====");
        BankAccountE acc = new BankAccountE(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(5000); // should fail
        System.out.println("Final balance: " + acc.getBalance());

        // Q28
        System.out.println("\n===== Q28: Product =====");
        Product prod = new Product(1, "Laptop", 75000);
        System.out.println(prod);
        try {
            prod.setPrice(-100); // should throw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Q29
        System.out.println("\n===== Q29: Why Encapsulation Matters =====");
        System.out.println("""
            Encapsulation hides internal state and exposes only
            safe, validated operations — like an ATM machine.
            Bad:  student.marks = -50  (no protection)
            Good: student.setMarks(-50) throws IllegalArgumentException
            """);

        // Q30
        System.out.println("===== Q30: Immutable Config Class =====");
        Config cfg = new Config("jdbc:mysql://localhost:3306/mydb", 8080, "MyApp");
        System.out.println(cfg);
        // cfg.dbUrl = "hack"; // compile error — field is private final
        System.out.println("Config is immutable — no setters available.");
    }
}
