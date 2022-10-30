package throwDemo;

public class AccountManager {
	private double balance;

	public void deposit(double amount) {

		balance = getBalance() + amount;

	}

	public void withraw(double amount) throws Exception{
		if(balance>=amount)  {
			balance = getBalance() - amount;
		}else {
			throw new BalanceInsufficentException("Bakiye yetersiz");
			//System.out.println("Hesaptan para šekilemedi. Bakiye yetersiz");
		}
		balance = getBalance() - amount;

	}

	double getBalance() {
		return balance;
	}
	
	
}
