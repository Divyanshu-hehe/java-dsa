// Calculate the area of a circle using an abstract class.
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Area = " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}