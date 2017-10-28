
public class FullDwelling {
	private String occupiedArea = "";
	private String occupiedAreaValueSrc = "";
	private String constructionYear = ""; 
	private String constructionYearValueSrc = "";
	
	private String includesFinishedBasementIndicator = "";
	private String includesFinishedBasementIndicatorValueSrc = "";
	private String numberOfUnitsAsString = "";
	private String numberOfUnitsAsStringValueSrc = "";
	private String roofShape = "";
	private String roofShapeValueSrc = "";
	private String constructionQuality = "";
	private String constructionQualityValueSrc = "";

	public String getOccupiedArea() {
		return occupiedArea;
	}
	public void setOccupiedArea(String occupiedArea) {
		this.occupiedArea = occupiedArea;
	}
	public String getOccupiedAreaValueSrc() {
		return occupiedAreaValueSrc;
	}
	public void setOccupiedAreaValueSrc(String occupiedAreaValueSrc) {
		this.occupiedAreaValueSrc = occupiedAreaValueSrc;
	}
	public String getConstructionYear() {
		return constructionYear;
	}
	public void setConstructionYear(String constructionYear) {
		this.constructionYear = constructionYear;
	}
	public String getConstructionYearValueSrc() {
		return constructionYearValueSrc;
	}
	public void setConstructionYearValueSrc(String constructionYearValueSrc) {
		this.constructionYearValueSrc = constructionYearValueSrc;
	}
		
	public String getConstructionQuality() {
		return constructionQuality;
	}
	public void setConstructionQuality(String constructionQuality) {
		this.constructionQuality = constructionQuality;
	}
	public String getConstructionQualityValueSrc() {
		return constructionQualityValueSrc;
	}
	public void setConstructionQualityValueSrc(String constructionQualityValueSrc) {
		this.constructionQualityValueSrc = constructionQualityValueSrc;
	}
	public String getRoofShape() {
		return roofShape;
	}
	public void setRoofShape(String roofShape) {
		this.roofShape = roofShape;
	}
	public String getRoofShapeValueSrc() {
		return roofShapeValueSrc;
	}
	public void setRoofShapeValueSrc(String roofShapeValueSrc) {
		this.roofShapeValueSrc = roofShapeValueSrc;
	}
	public String getNumberOfUnitsAsString() {
		return numberOfUnitsAsString;
	}
	public void setNumberOfUnitsAsString(String numberOfUnitsAsString) {
		this.numberOfUnitsAsString = numberOfUnitsAsString;
	}
	public String getNumberOfUnitsAsStringValueSrc() {
		return numberOfUnitsAsStringValueSrc;
	}
	public void setNumberOfUnitsAsStringValueSrc(String numberOfUnitsAsStringValueSrc) {
		this.numberOfUnitsAsStringValueSrc = numberOfUnitsAsStringValueSrc;
	}
	public String getIncludesFinishedBasementIndicator() {
		return includesFinishedBasementIndicator;
	}
	public void setIncludesFinishedBasementIndicator(String includesFinishedBasementIndicator) {
		this.includesFinishedBasementIndicator = includesFinishedBasementIndicator;
	}
	public String getIncludesFinishedBasementIndicatorValueSrc() {
		return includesFinishedBasementIndicatorValueSrc;
	}
	public void setIncludesFinishedBasementIndicatorValueSrc(String includesFinishedBasementIndicatorValueSrc) {
		this.includesFinishedBasementIndicatorValueSrc = includesFinishedBasementIndicatorValueSrc;
	}
	
	public String toString() {
		return  
				", LIV_AREA_SQ_FT_AMT: " + getOccupiedArea() +
				", LIV_AREA_SQ_FT_SRC: " + getOccupiedAreaValueSrc() +
				", CNSTRCT_YR: " + getConstructionYear() +
				", CNSTRCT_YR_SRC: " + getConstructionYearValueSrc() +
				
				", BASEMENT_IND: " + getIncludesFinishedBasementIndicator() + 
				", BASEMENT_SRC: " + getIncludesFinishedBasementIndicatorValueSrc() +
				", NUM_UNITS: " + getNumberOfUnitsAsString() + 
				", NUM_UNITS_SRC: " + getNumberOfUnitsAsStringValueSrc() +
				", ROOF_GEOMETRY_CD: " + getRoofShape() + 
				", ROOF_GEOMETRY_SRC: " + getRoofShapeValueSrc() +
				", OVERALL_QLTY_CD: " + getConstructionQuality() +
				", OVERALL_QLTY_SRC: " + getConstructionQualityValueSrc();
				
	}
	
}
