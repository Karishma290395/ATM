package test5;

public class FastATM {

	private int balance;
	private int withdraw;
	private String name;
	private String accountType;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccoutType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	FastATM() {
		System.out.println("Constructor Called");
	}

	FastATM(int balance, int withdraw, String name, String accountType) {

		this.balance = balance;
		this.withdraw = withdraw;
		this.name = name;
		this.accountType = accountType;
		System.out.println("this.balance = " + this.balance + "\nthis.withdraw " + this.withdraw + "\nthis.name "
				+ this.name + "\nthis.accountType " + this.accountType);
	}
}
