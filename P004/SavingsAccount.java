package P004;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String firstName, String lastName, double balance) {
        super(firstName, lastName, balance);
    }

    public void report() {
        System.out.println("Savings Account Balance: " + getBalance());
    }
}