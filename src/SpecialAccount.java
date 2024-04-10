public class SpecialAccount extends Account {

    private double specialLimit;

    public SpecialAccount(int number, double balance, Agency a, double specialLimit) {
        super(number, balance, a);
        this.specialLimit = specialLimit;
    }

    public void withDraw(double amount) {
        if(balance + specialLimit >= amount) balance -= amount;
    }
}
