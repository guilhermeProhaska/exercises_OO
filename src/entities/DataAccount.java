package entities;

public class DataAccount {
	
	private static double TAX = 5.00;
	private int account;
	private String name;
	private double balance;
	
	public DataAccount(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public DataAccount(int account, String name, double initialBalance) {
		this.account = account;
		this.name = name;
		depositAccount(initialBalance);
	}
	
	public int getAccount(){
		return account;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double depositAccount(double value) {
		return balance += value;
	}
	
	public double withdrawAccount(double value) {
		return balance -= value + TAX;
	}
	
	public String toString() {
		return "Account "
				+ account
				+ " , Holder: "
				+ name
				+ " , Balance: $ "
				+ String.format("%.2f", balance)
				+ "%n";
	}

}
