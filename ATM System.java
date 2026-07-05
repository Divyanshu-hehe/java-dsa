// Create an ATM program using encapsulation.
class ATM {
    private double balance = 10000;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM a = new ATM();

        a.deposit(2000);
        a.withdraw(1500);
        a.checkBalance();
    }
}