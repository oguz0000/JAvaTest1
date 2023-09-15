//import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new Org2CustomerManager(new MernisCheck());
	baseCustomerManager.Delete(new Customer("13895787604", "oğuz", "çiftcibaşı", 1986));

	}
}
