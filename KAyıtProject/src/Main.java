//import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new Org2CustomerManager(new MernisCheck());
	baseCustomerManager.Delete(new Customer("**", "o**", "çif**", 1986));

	}
}
