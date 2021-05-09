package coffeeShopProject;

public class Main {

	public static void main(String[] args) {
		
		CustomerCheckService checkService=new MernisServiceAdapter();
		Customer customer= new Customer();
		customer.setFirstName("Gonca");
		customer.setLastName("Bal");
		customer.setNationalityId("13513513513");
		customer.setDateOfBirth(1994);
		BaseCustomerManager customerManager= new StarbucksCustomerManager(checkService);
		customerManager.save(customer);

	}

}
