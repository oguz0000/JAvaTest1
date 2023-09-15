
public class Org1CustomerManager extends BaseCustomerManager {

	ICheckServices checkServices;
	
	public Org1CustomerManager(ICheckServices checkServices) {
		super();
		this.checkServices = checkServices;
	}
	
	
	@Override
	public void Add(Customer customer) {
		if (checkServices.CheckPersonIfReal(customer))
			System.out.println("veitabanına eklendi   " + customer.getFirstnameString());

		else
			System.out.println("kayıt başarısız");

	}


	@Override
	public void Delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstnameString() + " Sİlindi");
	}

	

	

}
