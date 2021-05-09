package coffeeShopProject;

public class NeroCustomerManager extends BaseCustomerManager  {

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database: "+customer.getFirstName());
		
	}
	

}
