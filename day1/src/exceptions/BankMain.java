package exceptions;

public class BankMain {

	public static void main(String[] args) {

		Bank bank = new Bank(500);
		try {
			bank.withdraw(700);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
