
public class Property {
	private String postalcode;
	private String addressline1;
	private String city;
	private String state;
	private String policyNumber;
	private String ownerId;
	
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String toString() {
		return " ZIP_CODE: " + getPostalcode() + 
			   ", STREET_ADDRESS: " + getAddressline1() + 
			   ", CITY_NAME: " + getCity() + 
			   ", STATE_CODE: " + getState() + 
			   ", POLICY_NUMBER: " + getPolicyNumber() +
			   ", AGENT_OF_RECORD: " + getOwnerId();
	}
}
