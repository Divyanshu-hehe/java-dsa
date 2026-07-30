// ============================================================
//   SECTION 8 ANSWERS: Static & Final (Q36 - Q40)
// ============================================================

// -----------------------------------------------------------
// Q36. Static variable to count total objects created
// -----------------------------------------------------------
class CounterS {
    private static int count = 0; // shared across ALL instances
    private int id;

    CounterS() {
        count++;
        this.id = count;
        System.out.println("Object #" + id + " created.");
    }

    static int getCount() {
        return count;
    }
}

// -----------------------------------------------------------
// Q37. Static final constants in MathConstants
// -----------------------------------------------------------
class MathConstants {
    public static final double PI   = 3.141592653589793;
    public static final double E    = 2.718281828459045;
    public static final double SQRT2 = 1.4142135623730951;

    static double circleArea(double radius) {
        return PI * radius * radius;
    }

    static double circleCircumference(double radius) {
        return 2 * PI * radius;
    }
}

// -----------------------------------------------------------
// Q38. Final class Utility (cannot be extended)
// -----------------------------------------------------------
final class Utility {

    // Private constructor — prevent instantiation
    private Utility() {}

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

// Trying to extend Utility would cause a compile error:
// class ExtendedUtility extends Utility {}   // ERROR: cannot inherit from final class

// -----------------------------------------------------------
// Q39. Static initialization block
//
//  A static block runs ONCE when the class is first loaded into memory,
//  BEFORE any object is created or static method is called.
//  Used for complex static field initialization.
// -----------------------------------------------------------
class DatabaseConfig {
    static String url;
    static int    port;
    static String driver;

    // Static block — runs once at class loading
    static {
        System.out.println("[Static Block] Initializing DatabaseConfig...");
        url    = "jdbc:mysql://localhost";
        port   = 3306;
        driver = "com.mysql.cj.jdbc.Driver";
        System.out.println("[Static Block] Done.");
    }

    static void display() {
        System.out.println("URL: " + url + ", Port: " + port + ", Driver: " + driver);
    }
}

// -----------------------------------------------------------
// Q40. final variable, final method, final class — differences
//
//  1. final VARIABLE:
//     - Value cannot be changed after initialization.
//     - Instance final: set in constructor or at declaration.
//     - Static final: a constant (e.g., PI).
//
//  2. final METHOD:
//     - Cannot be overridden in a subclass.
//     - The implementation is locked.
//
//  3. final CLASS:
//     - Cannot be subclassed (extended).
//     - e.g., java.lang.String is final.
// -----------------------------------------------------------
class ParentFinal {
    final int MAX_SIZE = 100;          // final variable

    final void show() {                // final method
        System.out.println("ParentFinal.show() — cannot be overridden. MAX_SIZE=" + MAX_SIZE);
    }

    void normalMethod() {
        System.out.println("ParentFinal.normalMethod() — can be overridden.");
    }
}

class ChildFinal extends ParentFinal {
    // Cannot override show() — would cause compile error:
    // void show() {}  // ERROR

    @Override
    void normalMethod() {
        System.out.println("ChildFinal.normalMethod() — overridden successfully.");
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section8_StaticAndFinal {

    public static void main(String[] args) {

        System.out.println("===== Q36: Static Object Counter =====");
        CounterS o1 = new CounterS();
        CounterS o2 = new CounterS();
        CounterS o3 = new CounterS();
        System.out.println("Total objects created: " + CounterS.getCount());

        System.out.println("\n===== Q37: MathConstants =====");
        System.out.println("PI   = " + MathConstants.PI);
        System.out.println("E    = " + MathConstants.E);
        System.out.printf("Circle (r=5): area=%.4f, circumference=%.4f%n",
            MathConstants.circleArea(5), MathConstants.circleCircumference(5));

        System.out.println("\n===== Q38: Final Utility Class =====");
        System.out.println("isPrime(7)   = " + Utility.isPrime(7));
        System.out.println("isPrime(10)  = " + Utility.isPrime(10));
        System.out.println("factorial(5) = " + Utility.factorial(5));
        System.out.println("reverse('hello') = " + Utility.reverse("hello"));

        System.out.println("\n===== Q39: Static Initialization Block =====");
        // First access triggers the static block
        DatabaseConfig.display();
        // Second access — static block does NOT run again
        System.out.println("Accessing again (no static block re-run):");
        DatabaseConfig.display();

        System.out.println("\n===== Q40: final variable / method / class =====");
        ChildFinal cf = new ChildFinal();
        cf.show();           // calls ParentFinal's final method
        cf.normalMethod();   // calls ChildFinal's overridden method

        System.out.println("""
            
            Summary:
              final variable -> value cannot be reassigned
              final method   -> cannot be overridden in subclass
              final class    -> cannot be subclassed (e.g. String)
            """);
    }
}
