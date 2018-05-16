package demo.service;

import demo.beans.Customer;

public interface WalletService {
	public  Customer createAccount(String name,String mobileNumber,float amount);
	public  Customer showBalance(String mobileNumber);
	public Customer depositAmount(String mobileNumber, float depositAmount);
	public Customer withDrawAmount(String mobileNumber, float withDrawAmount);

}
