import java.util.List;

public class RoofElementPart {
	private String roofElementType = null;
	private String roofMaterialPercentage = null;
	public String getRoofElementType() {
		return roofElementType;
	}
	public void setRoofElementType(String roofElementType) {
		this.roofElementType = roofElementType;
	}
	public String getRoofMaterialPercentage() {
		return roofMaterialPercentage;
	}
	public void setRoofMaterialPercentage(String roofMaterialPercentage) {
		this.roofMaterialPercentage = roofMaterialPercentage;
	}
	
	public String toString(List<RoofElementPart> roofElementPartL) {
		String rString = "";
		int i = 0;
		for (RoofElementPart roofElementPart : roofElementPartL) {
			i++;
			rString += ", ROOF_TYPE_CD" + i + ": " + roofElementPart.getRoofElementType() + ", ROOF_TYPE_PCT" + i + ": "  + roofElementPart.getRoofMaterialPercentage();
		}
		return rString;
	}
}
