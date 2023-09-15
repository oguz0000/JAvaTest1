
public class Org2CustomerManager extends BaseCustomerManager {
	ICheckServices checkServices;
	

	public Org2CustomerManager(ICheckServices checkServices) {
		super();
		this.checkServices = checkServices;
	}

	@Override
	public void Add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("veitabanına eklendi   "+customer.getFirstnameString());
	}

	@Override
	public void Delete(Customer customer) {
		if (checkServices.CheckPersonIfReal(customer)) {
			System.out.println("doğrulandı ve silindi");
			
		}
		else {
			System.out.println("silinemedi- böyle bir müşteri yok");
		}
	}

}
