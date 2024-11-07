package P004;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
	
	public BankAccount() {
		firstName = "N/A";
		lastName = "N/A";
	}

	public BankAccount(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public void getFirstName() {
		return firstName;
	}
	public void getLastName() {
		return lastName;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance = balance;
	}
}

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Jon", "Snow", 500);
		
	}
}