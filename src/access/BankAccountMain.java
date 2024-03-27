package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(50);
        account.deposit(-50);
        account.getBalance();
        account.withdraw(30);
        account.withdraw(-30);
        account.withdraw(30);
    }
}
