public class BankApp {
    public static void main(String args[]) {
        Account account1 = new Account(123, 0, new Agency("Zakes"));
        Account account2 = new SpecialAccount(321, 0, new Agency("Simmy"), 2000);

        account1.deposit(10);
        account1.withDraw(10);

        account2.withDraw(200);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
