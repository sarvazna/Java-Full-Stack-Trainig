package demo.client;

import java.util.HashMap;
import java.util.Map;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.RepoImpl;
import demo.service.WalletService;
import demo.service.ServiceImpl;

public class Client {
	public static void main(String[] args) {
		Map<String,Customer> data=new HashMap<>();
		WalletRepo repo=new RepoImpl(data);
		WalletService service=new ServiceImpl(repo);
	
		
		service.createAccount("Annapurnayya", "99887755", 98568.9f);
		service.createAccount("Madduri", "987654321", 19875.99f);
		
		System.out.println(service.showBalance("99887755"));
		service.depositAmount("99887755", 55555f);
		System.out.println(service.showBalance("99887755"));
		service.withDrawAmount("99887755", 55555f);
		System.out.println(service.showBalance("99887755"));
		
	}

}
