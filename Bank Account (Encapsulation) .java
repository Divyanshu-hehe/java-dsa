// create a BankAccount class with deposit and withdraw methods.
class BankAccount {
    private double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(5000);
        b.withdraw(1500);
        b.display();
    }
}