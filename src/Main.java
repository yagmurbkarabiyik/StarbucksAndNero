import Entities.Customer;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concrete.StarbucksCustomerManager;
public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		
		customer1.setId(1);
		customer1.setFirstName("Yaðmur Buse");
		customer1.setLastName("Karabýyýk");
		customer1.setDateOfBirth(2001);
		customer1.setNationaltyId("12345678911");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		baseCustomerManager.save(customer1);
		
		
	}

}
