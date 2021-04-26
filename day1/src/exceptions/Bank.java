package exceptions;

public class Bank {

	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amt) throws BalanceException{
		try {
			if (amt > balance) {
				// System.out.println("You do not have sufficient Balance");
				throw new BalanceException("Balance is Low");
			} else {
				balance = balance - amt;
				System.out.println("Transaction success, new Balance " + balance);

			}
		} catch (BalanceException e) {
			throw e;
		}
		return balance;
	}
}
