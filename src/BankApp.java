public class BankApp {
    public static void main(String args[]) {
        Account account1 = new Account(123, 0, new Agency("Zakes"));
        Account account2 = new Account(321, 1000, new Agency("Simmy"));

        account1.setNumber("124");
        account1.deposit(10);
        account1.withDraw(10);

        account2.deposit(3000);
        account2.withDraw(200);

        System.out.println(account1.getNumber());
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
