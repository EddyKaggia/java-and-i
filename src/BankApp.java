public class BankApp {
    public static void main(String args[]) {
        Account account1 = new Account();
        Account account2 = new Account();
        
        account1.number = 123;
        account1.deposit(10);
        account1.withDraw(10);

        account2.number = 321;
        account2.deposit(3000);
        account2.withDraw(200);

        System.out.println(account1.balance);
        System.out.println(account2.balance);
    }
}
