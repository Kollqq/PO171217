public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 1000;
        b1.deposit(500);
        b1.withdraw(200);

        System.out.println(b1.balance);
    }
}

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}
