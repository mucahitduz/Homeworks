package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) {
		
		System.out.println("Saved to database : " +customer.getFirstName());
		
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
