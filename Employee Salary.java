// increase an employee's salary by a given percentage.
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    void display() {
        System.out.println(name + " Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Amit", 30000);
        e.increaseSalary(10);
        e.display();
    }
}