public class Account {
    double balance;
    int number;

    void deposit(double amount) {
        balance += amount;
    }

    void withDraw(double amount) {
        if(balance >= amount) balance -= amount;
    }
}

