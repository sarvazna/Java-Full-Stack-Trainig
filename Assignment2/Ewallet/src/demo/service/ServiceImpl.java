package demo.service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;

public class ServiceImpl implements WalletService {
	private WalletRepo repo;

public Customer createAccount(String name, String mobileNumber, float amount) {
	Customer customer=new Customer();
	Wallet wallet=new Wallet();
	customer.setName(name);
	customer.setMobileNumber(mobileNumber);
	wallet.setBalance(amount);
	customer.setWallet(wallet);
	repo.save(customer);
		return customer;
	}

	public ServiceImpl(WalletRepo repo) {
	//super();
	this.repo = repo;
}

	

	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		
		return repo.findOne(mobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, float depositAmount) {
		// TODO Auto-generated method stub
		Customer customer = repo.findOne(mobileNumber);
		Wallet wallet = customer.getWallet();
		float amount = wallet.getBalance() + depositAmount;
		wallet.setBalance(amount);
		customer.setWallet(wallet);
		return customer;
	}

	@Override
	public Customer withDrawAmount(String mobileNumber, float withDrawAmount) {
		// TODO Auto-generated method stub
		Customer customer = repo.findOne(mobileNumber);
		Wallet wallet = customer.getWallet();
		float amount = wallet.getBalance() - withDrawAmount;
		wallet.setBalance(amount);
		customer.setWallet(wallet);
		repo.save(customer);
		return customer;
	}

}
