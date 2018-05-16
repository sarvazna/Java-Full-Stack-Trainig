package demo.beans;

public class Customer {
	private String name;
	private String mobileNumber;
	private Wallet wallet;
	public String getName() {
		return name;
	}
	public Customer() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public String toString()
	{
		return name+" "+mobileNumber+" "+" "+wallet.getBalance();
	}
}
