//import java.util.Date;

public class Customer {
	private String natonalIdString;
	private String firstnameString;
	private String lastnameString;
	private int dateofbirthDate;
	
	
	public Customer(String natonalIdString, String firstnameString, String lastnameString, int dateofbirthDate) {
		super();
		this.natonalIdString = natonalIdString;
		this.firstnameString = firstnameString;
		this.lastnameString = lastnameString;
		this.dateofbirthDate = dateofbirthDate;
	}
	public String getNatonalIdString() {
		return natonalIdString;
	}
	public void setNatonalIdString(String natonalIdString) {
		this.natonalIdString = natonalIdString;
	}
	public String getFirstnameString() {
		return firstnameString;
	}
	public void setFirstnameString(String firstnameString) {
		this.firstnameString = firstnameString;
	}
	public String getLastnameString() {
		return lastnameString;
	}
	public void setLastnameString(String lastnameString) {
		this.lastnameString = lastnameString;
	}
	public int getDateofbirthDate() {
		return dateofbirthDate;
	}
	public void setDateofbirthDate(int dateofbirthDate) {
		this.dateofbirthDate = dateofbirthDate;
	}
	

}
