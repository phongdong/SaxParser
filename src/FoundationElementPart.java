import java.util.List;

public class FoundationElementPart {
	private String foundationType;
	private String foundationTypePercentage;
	
	public String getFoundationType() {
		return foundationType;
	}
	public void setFoundationType(String foundationType) {
		this.foundationType = foundationType;
	}
	public String getFoundationTypePercentage() {
		return foundationTypePercentage;
	}
	public void setFoundationTypePercentage(String foundationTypePercentage) {
		this.foundationTypePercentage = foundationTypePercentage;
	}
	
	public String toString(List<FoundationElementPart> FoundationElementPartL) {
		String rString = "";
		int i = 0;
		for (FoundationElementPart foundationElementPart : FoundationElementPartL) {
			i++;
			rString += ", FNDTN_TYPE_CD" + i + ": " + foundationElementPart.getFoundationType() + ", FNDTN_TYPE_PCT" + i + ": "  + foundationElementPart.getFoundationTypePercentage();
		}
		return rString;
	}
}
