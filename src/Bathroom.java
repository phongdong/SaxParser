import java.util.List;

public class Bathroom {
	private String bathroomSize;
	private String bathroomSizeValueSrc;
	
	public String getBathroomSize() {
		return bathroomSize;
	}
	public void setBathroomSize(String bathroomSize) {
		this.bathroomSize = bathroomSize;
	}
	public String getBathroomSizeValueSrc() {
		return bathroomSizeValueSrc;
	}
	public void setBathroomSizeValueSrc(String bathroomSizeValueSrc) {
		this.bathroomSizeValueSrc = bathroomSizeValueSrc;
	}
	
	public String groupBathroom(List<Bathroom> bathrooms) {
		int fullBath = 0;
		int halfBath = 0;
		int custFullBath = 0;
		for (Bathroom bathroom : bathrooms) {
			if (bathroom.getBathroomSize().toString().equalsIgnoreCase("BTH34"))
				custFullBath++;
			else if (bathroom.getBathroomSize().toString().equalsIgnoreCase("BTH10") 
					|| bathroom.getBathroomSize().toString().equalsIgnoreCase("BTH15"))
				fullBath ++;
			else if (bathroom.getBathroomSize().toString().equalsIgnoreCase("BTH12"))
				halfBath ++;
		}
		return ", STD_FULL_BATH_QTY: " + fullBath + ", STD_HALF_BATH_QTY: " + halfBath + ", CUST_FULL_BATH_QTY: " + custFullBath;
	}
		
	
}
