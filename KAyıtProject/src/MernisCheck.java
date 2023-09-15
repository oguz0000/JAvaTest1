import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheck implements ICheckServices{

	@Override
	public boolean CheckPersonIfReal(Customer customer) {
		 KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		 
		 try {
				return client.TCKimlikNoDogrula(
						Long.parseLong(customer.getNatonalIdString()), 
						customer.getFirstnameString().toUpperCase(),
						customer.getLastnameString().toUpperCase(), 
						customer.getDateofbirthDate());
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			return false;
		
	}

}
