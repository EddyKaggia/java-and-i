public class Account {
    private double balance;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withDraw(double amount) {
        if(balance >= amount) balance -= amount;
    }
}

