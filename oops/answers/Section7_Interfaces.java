// ============================================================
//   SECTION 7 ANSWERS: Interfaces (Q31 - Q35)
// ============================================================

// -----------------------------------------------------------
// Q31. Drawable interface implemented by Circle, Square, Triangle
// -----------------------------------------------------------
interface Drawable {
    void draw();
}

class CircleD implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

class TriangleD implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

// -----------------------------------------------------------
// Q32. Flyable + Swimmable interfaces, Duck implements both
// -----------------------------------------------------------
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    String name;

    Duck(String name) { this.name = name; }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }
}

// -----------------------------------------------------------
// Q33. Interface with default method
// -----------------------------------------------------------
interface Logger {
    // Default method — provides a default implementation
    default void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

    // Abstract method — implementors can override log format
    void logError(String msg);
}

class ConsoleLogger implements Logger {
    @Override
    public void logError(String msg) {
        System.out.println("[ERROR] " + msg);
    }
    // log() is inherited from Logger (default method)
}

class FileLogger implements Logger {
    @Override
    public void logError(String msg) {
        System.out.println("[FILE ERROR] " + msg);
    }

    // Override the default log() method
    @Override
    public void log(String msg) {
        System.out.println("[FILE LOG] " + msg);
    }
}

// -----------------------------------------------------------
// Q34. Sortable interface -> BubbleSort, SelectionSort
// -----------------------------------------------------------
interface Sortable {
    void sort(int[] arr);

    // Utility default method to print array
    default void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j]   = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            // swap arr[i] with arr[minIdx]
            int temp      = arr[minIdx];
            arr[minIdx]   = arr[i];
            arr[i]        = temp;
        }
    }
}

// -----------------------------------------------------------
// Q35. Functional interface + lambda expression
//
//  A functional interface has exactly ONE abstract method.
//  It can be implemented using a lambda expression.
//  Java 8+ provides @FunctionalInterface annotation for clarity.
// -----------------------------------------------------------
@FunctionalInterface
interface Greeting {
    void greet(String name);
}

// -----------------------------------------------------------
// Main — run all demos
// -----------------------------------------------------------
public class Section7_Interfaces {

    public static void main(String[] args) {

        System.out.println("===== Q31: Drawable Interface =====");
        Drawable[] shapes = { new CircleD(), new Square(), new TriangleD() };
        for (Drawable d : shapes) d.draw();

        System.out.println("\n===== Q32: Flyable + Swimmable (Duck) =====");
        Duck duck = new Duck("Donald");
        duck.fly();
        duck.swim();

        System.out.println("\n===== Q33: Default Method in Logger =====");
        Logger console = new ConsoleLogger();
        console.log("Application started");     // uses default method
        console.logError("NullPointerException");

        Logger file = new FileLogger();
        file.log("Writing to file...");          // overridden default method
        file.logError("FileNotFoundException");

        System.out.println("\n===== Q34: Sortable — BubbleSort & SelectionSort =====");
        int[] arr1 = {5, 3, 8, 1, 2};
        int[] arr2 = {9, 4, 7, 6, 0};

        Sortable bubble = new BubbleSort();
        System.out.print("Before BubbleSort:    ");
        bubble.printArray(arr1);
        bubble.sort(arr1);
        System.out.print("After  BubbleSort:    ");
        bubble.printArray(arr1);

        Sortable selection = new SelectionSort();
        System.out.print("Before SelectionSort: ");
        selection.printArray(arr2);
        selection.sort(arr2);
        System.out.print("After  SelectionSort: ");
        selection.printArray(arr2);

        System.out.println("\n===== Q35: Functional Interface + Lambda =====");

        // 1. Lambda implementation
        Greeting formal = name -> System.out.println("Good morning, " + name + "!");
        Greeting casual = name -> System.out.println("Hey " + name + ", what's up?");

        formal.greet("Alice");
        casual.greet("Bob");

        // 2. Anonymous class (old style — for comparison)
        Greeting oldStyle = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + " (anonymous class style)");
            }
        };
        oldStyle.greet("Charlie");

        // 3. Store in array — shows functional interfaces are first-class
        Greeting[] greetings = { formal, casual, oldStyle };
        System.out.println("\nAll greetings for Dave:");
        for (Greeting g : greetings) g.greet("Dave");
    }
}
