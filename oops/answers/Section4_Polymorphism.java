// ============================================================
//   SECTION 4 ANSWERS: Polymorphism (Q16 - Q20)
// ============================================================

// -----------------------------------------------------------
// Q16. Method Overloading in MathUtils
// -----------------------------------------------------------
class MathUtils {

    // add two ints
    int add(int a, int b) {
        return a + b;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // add three ints
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// -----------------------------------------------------------
// Q17. Method Overriding: Printer -> LaserPrinter
// -----------------------------------------------------------
class Printer {
    void print(String doc) {
        System.out.println("Printer printing: " + doc);
    }
}

class LaserPrinter extends Printer {
    @Override
    void print(String doc) {
        System.out.println("LaserPrinter printing at high quality: " + doc);
    }
}

// -----------------------------------------------------------
// Q18. Runtime Polymorphism with Shape array
// -----------------------------------------------------------
class ShapeP {
    double area() { return 0; }
}

class CircleP extends ShapeP {
    double radius;
    CircleP(double r) { this.radius = r; }

    @Override
    double area() { return Math.PI * radius * radius; }
}

class RectangleP extends ShapeP {
    double l, b;
    RectangleP(double l, double b) { this.l = l; this.b = b; }

    @Override
    double area() { return l * b; }
}

class TriangleP extends ShapeP {
    double base, height;
    TriangleP(double base, double height) {
        this.base   = base;
        this.height = height;
    }

    @Override
    double area() { return 0.5 * base * height; }
}

// -----------------------------------------------------------
// Q19. Compile-time vs Runtime Polymorphism (explanation + example)
//
//  COMPILE-TIME (Static) Polymorphism:
//    - Achieved via method OVERLOADING.
//    - Method to call is resolved at compile time by the compiler
//      based on method signature (number/type of params).
//    - Example: MathUtils.add() above (Q16).
//
//  RUNTIME (Dynamic) Polymorphism:
//    - Achieved via method OVERRIDING + upcasting.
//    - The JVM decides at runtime which overridden method to call
//      based on the actual object type (not reference type).
//    - Example: ShapeP array loop in Q18.
// -----------------------------------------------------------

// -----------------------------------------------------------
// Q20. Static method hiding vs instance method overriding
// -----------------------------------------------------------
class ParentQ20 {
    // Static method — can be "hidden", NOT overridden
    static void staticMethod() {
        System.out.println("ParentQ20: static method");
    }

    // Instance method — can be overridden
    void instanceMethod() {
        System.out.println("ParentQ20: instance method");
    }
}

class ChildQ20 extends ParentQ20 {
    // This HIDES the parent static method (not overriding)
    static void staticMethod() {
        System.out.println("ChildQ20: static method (HIDING)");
    }

    // This OVERRIDES the parent instance method
    @Override
    void instanceMethod() {
        System.out.println("ChildQ20: instance method (OVERRIDING)");
    }
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section4_Polymorphism {

    public static void main(String[] args) {

        System.out.println("===== Q16: Method Overloading =====");
        MathUtils mu = new MathUtils();
        System.out.println("add(2, 3)       = " + mu.add(2, 3));
        System.out.println("add(2.5, 3.5)   = " + mu.add(2.5, 3.5));
        System.out.println("add(1, 2, 3)    = " + mu.add(1, 2, 3));

        System.out.println("\n===== Q17: Method Overriding =====");
        Printer p1 = new Printer();
        Printer p2 = new LaserPrinter();  // upcast
        p1.print("Report.pdf");
        p2.print("Report.pdf");           // calls LaserPrinter.print() at runtime

        System.out.println("\n===== Q18: Runtime Polymorphism (Shape array) =====");
        ShapeP[] shapes = {
            new CircleP(5),
            new RectangleP(4, 6),
            new TriangleP(3, 8)
        };
        for (ShapeP s : shapes) {
            System.out.printf("%-15s area = %.2f%n",
                s.getClass().getSimpleName(), s.area());
        }

        System.out.println("\n===== Q19: Compile-time vs Runtime Polymorphism =====");
        System.out.println("Compile-time: MathUtils.add() resolved at compile time.");
        MathUtils m = new MathUtils();
        System.out.println("  add(1,2) = " + m.add(1, 2));       // compile-time
        System.out.println("Runtime: ShapeP reference -> actual object decided at runtime.");
        ShapeP s = new CircleP(7);
        System.out.printf("  area = %.2f (Circle at runtime)%n", s.area()); // runtime

        System.out.println("\n===== Q20: Static Hiding vs Instance Overriding =====");
        ParentQ20 ref = new ChildQ20(); // upcast

        // Static method call — resolved at COMPILE TIME based on reference type
        // So ParentQ20.staticMethod() is called, NOT ChildQ20's
        ParentQ20.staticMethod();  // "ParentQ20: static method"
        ChildQ20.staticMethod();   // "ChildQ20:  static method (HIDING)"

        // Instance method — resolved at RUNTIME based on actual object
        ref.instanceMethod();      // "ChildQ20: instance method (OVERRIDING)"

        System.out.println("""
            
            Conclusion:
            - Static methods belong to the class, not the object.
              They are resolved at compile time -> method HIDING.
            - Instance methods are resolved at runtime based on
              the actual object -> method OVERRIDING (polymorphism).
            """);
    }
}
