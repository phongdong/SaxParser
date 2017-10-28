import java.util.List;

public class ExteriorWallElementPart {
	private String exteriorWallMaterialType = "";
	private String exteriorWallMaterialPercentage = "";
	
	public String getExteriorWallMaterialType() {
		return exteriorWallMaterialType;
	}
	public void setExteriorWallMaterialType(String exteriorWallMaterialType) {
		this.exteriorWallMaterialType = exteriorWallMaterialType;
	}
	public String getExteriorWallMaterialPercentage() {
		return exteriorWallMaterialPercentage;
	}
	public void setExteriorWallMaterialPercentage(String exteriorWallMaterialPercentage) {
		this.exteriorWallMaterialPercentage = exteriorWallMaterialPercentage;
	}
	
	public String toString(List<ExteriorWallElementPart> exteriorWallElementParts) {
		int i = 0;
		String rString = "";
		for (ExteriorWallElementPart e : exteriorWallElementParts) {
			i++;
			rString += ", EWALL_MTRL_CD" + i + ": " + e.getExteriorWallMaterialType() +
					   ", EWALL_MTRL_PCT" + i + ": " + e.getExteriorWallMaterialPercentage();
		}
		return rString;
	}
}
