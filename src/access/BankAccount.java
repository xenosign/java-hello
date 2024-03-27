package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드들
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println("현재 잔고 : " + balance);
        } else {
            System.out.println("유효하지 않은 금액 입니다");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount)) {
            if (isPossibleWithdraw(amount)) {
                balance -= amount;
                System.out.println("현재 잔고 : " + balance);
            } else {
                System.out.println("잔고가 부족합니다. 현재 잔고 : " + balance);
            }
        } else {
            System.out.println("유효하지 않은 금액 입니다");
        }
    }

    public int getBalance() {
        return balance;
    }

    // private 메서드들
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    private boolean isPossibleWithdraw(int amount) {
        return balance >= amount;
    }
}
