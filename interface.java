// implement an interface named Vehicle.
interface Vehicle {
    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}