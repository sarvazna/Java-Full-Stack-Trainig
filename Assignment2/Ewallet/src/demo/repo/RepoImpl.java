package demo.repo;
import java.util.Map;

import demo.beans.Customer;

public class RepoImpl implements WalletRepo{
	Map<String,Customer> data;

	public RepoImpl(Map<String, Customer> data2) {
		// TODO Auto-generated constructor stub
	data=data2;
	}

	@Override
	public boolean save(Customer c) {
		data.put(c.getMobileNumber(),c);
		
		return true;
	}

	@Override
	public Customer findOne(String mobileNumber) {
		
		return data.get(mobileNumber);
	}

	
	
	

}
