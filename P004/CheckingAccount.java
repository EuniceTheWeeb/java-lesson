package P004;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = 2500;
    }

    public CheckingAccount(String firstName, String lastName, double balance, double overdraftLimit) {
        super(firstName, lastName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient for this withdrawal.");
        }
    }

    public void report() {
        double difference = getBalance() - overdraftLimit;
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Balance: " + getBalance());
        System.out.println("Amt after Overdraft Limit: " + difference);
    }
}