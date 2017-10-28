
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser extends DefaultHandler {
	
	private Property property = new Property();
	private FullDwelling fullDwelling = null;
	private FoundationElementPart foundationElementPart = null;
	private List<FoundationElementPart> foundationElementPartList = new ArrayList<FoundationElementPart>();
	private Bathroom bathroom = null;
	private List<Bathroom> bathroomList = new ArrayList<Bathroom>();
	private RoofElementPart roofElementPart = null;
	private List<RoofElementPart> roofElementPartList = new ArrayList<RoofElementPart>();
	private Garage garage = null;
	private List<Garage> garageList = new ArrayList<Garage>();
	private DeckMaterial deckMaterial = null;
	private List<DeckMaterial> deckMaterialList = new ArrayList<DeckMaterial>();
	private ExteriorWallElementPart exteriorWallElementPart = null;
	private List<ExteriorWallElementPart> exteriorWallElementPartList = new ArrayList<ExteriorWallElementPart>();
	
	@Override
	public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException 
	{	
		if (elementName.equalsIgnoreCase("prop:fullDwelling")) 
			fullDwelling = new FullDwelling();
		if (elementName.equalsIgnoreCase("phy:foundationElementPart")) 
			foundationElementPart = new FoundationElementPart();
		if (elementName.equalsIgnoreCase("phy:bathroom")) 
			bathroom = new Bathroom();
		if (elementName.equalsIgnoreCase("phy:roofElementPart")) 
			roofElementPart = new RoofElementPart();
		if (elementName.equalsIgnoreCase("phy:garage")) 
			garage = new Garage();
		if (elementName.equalsIgnoreCase("phy:deck")) 
			deckMaterial = new DeckMaterial();
		if (elementName.equalsIgnoreCase("phy:exteriorWallElementPart")) 
			exteriorWallElementPart = new ExteriorWallElementPart();
	}

	@Override
	public void endElement(String s, String s1, String element) throws SAXException 
	{
		if (element.equalsIgnoreCase("par:postalCode"))
			property.setPostalcode(tmpValue);
		if (element.equalsIgnoreCase("par:addressLine1"))
			property.setAddressline1(tmpValue);
		if (element.equalsIgnoreCase("par:city"))
			property.setCity(tmpValue);		
		if (element.equalsIgnoreCase("par:region")) 
			property.setState(tmpValue);
		if (element.equalsIgnoreCase("fin:policyNumber")) 
			property.setPolicyNumber(tmpValue);
		if (element.equalsIgnoreCase("prop:ownerId"))
			property.setOwnerId(tmpValue);
		
		if (element.equalsIgnoreCase("phy:occupiedArea"))
			fullDwelling.setOccupiedArea(tmpValue);
		if (element.equalsIgnoreCase("phy:occupiedAreaValueSrc"))
			fullDwelling.setOccupiedAreaValueSrc(tmpValue);
		if (element.equalsIgnoreCase("phy:constructionYear"))
			fullDwelling.setConstructionYear(tmpValue);
		if (element.equalsIgnoreCase("phy:constructionYearValueSrc")) 
			fullDwelling.setConstructionYearValueSrc(tmpValue); 
		if (element.equalsIgnoreCase("phy:includesFinishedBasementIndicator"))
			fullDwelling.setIncludesFinishedBasementIndicator(tmpValue);
		if (element.equalsIgnoreCase("phy:includesFinishedBasementIndicatorValueSrc"))
			fullDwelling.setIncludesFinishedBasementIndicatorValueSrc(tmpValue);
		if (element.equalsIgnoreCase("phy:numberOfUnitsAsString"))
			fullDwelling.setNumberOfUnitsAsString(tmpValue);
		if (element.equalsIgnoreCase("phy:numberOfUnitsAsStringValueSrc"))
			fullDwelling.setNumberOfUnitsAsStringValueSrc(tmpValue);
		if (element.equalsIgnoreCase("phy:roofShape"))
			fullDwelling.setRoofShape(tmpValue);
		if (element.equalsIgnoreCase("phy:roofShapeValueSrc"))
			fullDwelling.setRoofShapeValueSrc(tmpValue);
		if (element.equalsIgnoreCase("phy:constructionQuality"))
			fullDwelling.setConstructionQuality(tmpValue);
		if (element.equalsIgnoreCase("phy:constructionQualityValueSrc"))
			fullDwelling.setConstructionQualityValueSrc(tmpValue);
		
		if (element.equalsIgnoreCase("phy:foundationElementPart"))
			foundationElementPartList.add(foundationElementPart);
		if (element.equalsIgnoreCase("phy:foundationType"))
			foundationElementPart.setFoundationType(tmpValue);
		if (element.equalsIgnoreCase("phy:foundationTypePercentage"))
			foundationElementPart.setFoundationTypePercentage(tmpValue);
		
		if (element.equalsIgnoreCase("phy:bathroom"))
			bathroomList.add(bathroom);
		if (element.equalsIgnoreCase("phy:bathroomSize"))
			bathroom.setBathroomSize(tmpValue);
		if (element.equalsIgnoreCase("phy:bathroomSizeValueSrc"))
			bathroom.setBathroomSizeValueSrc(tmpValue);
		
		if (element.equalsIgnoreCase("phy:roofElementPart"))
			roofElementPartList.add(roofElementPart);
		if (element.equalsIgnoreCase("phy:roofMaterialType"))
			roofElementPart.setRoofElementType(tmpValue);
		if (element.equalsIgnoreCase("phy:roofMaterialPercentage"))
			roofElementPart.setRoofMaterialPercentage(tmpValue);
		
		if (element.equalsIgnoreCase("phy:garage"))
			garageList.add(garage);
		if (element.equalsIgnoreCase("phy:vehicleCapacity"))
			garage.setVehicleCapacity(tmpValue);
		if (element.equalsIgnoreCase("phy:vehicleCapacityValueSrc"))
			garage.setVehicleCapacityValueSrc(tmpValue);
	
		if (element.equalsIgnoreCase("phy:deck"))
			deckMaterialList.add(deckMaterial);
		if (element.equalsIgnoreCase("phy:deckMaterial"))
			deckMaterial.setDeckMaterial(tmpValue);
		if (element.equalsIgnoreCase("phy:deckMaterialValueSrc"))
			deckMaterial.setDeckMaterialValueSrc(tmpValue);
		
		if (element.equalsIgnoreCase("phy:exteriorWallElementPart"))
			exteriorWallElementPartList.add(exteriorWallElementPart);
		if (element.equalsIgnoreCase("phy:exteriorWallMaterialType"))
			exteriorWallElementPart.setExteriorWallMaterialType(tmpValue);
		if (element.equalsIgnoreCase("phy:exteriorWallMaterialPercentage"))
			exteriorWallElementPart.setExteriorWallMaterialPercentage(tmpValue);
	}
	
	private void printData() {
		String str = "";
		if (property != null) str += property.toString();
		if (fullDwelling != null) str += fullDwelling.toString();
		if (foundationElementPart != null && foundationElementPartList.size() != 0)
			str += foundationElementPart.toString(foundationElementPartList);
		if (bathroom != null && bathroomList.size() != 0)
			str += bathroom.groupBathroom(bathroomList);
		if (roofElementPart != null && roofElementPartList.size() != 0)
			str += roofElementPart.toString(roofElementPartList);
		if (garage != null && garageList.size() != 0)
			str += garage.toString(garageList); 
		if (deckMaterial != null && deckMaterialList.size() != 0)
			str += deckMaterial.toString(deckMaterialList);
		if (exteriorWallElementPart != null && exteriorWallElementPartList.size() != 0)
			str += exteriorWallElementPart.toString(exteriorWallElementPartList);
		
		System.out.println(str);
	}
	
	@Override
	public void characters(char[] ac, int i, int j) throws SAXException {
		tmpValue = new String(ac, i, j);
	}

	public static void main(String[] args) {
		new SaxParser(args[0]);
	}
	
	String fileName = null;
	String tmpValue = null;

	public SaxParser(String fileName) {
		this.fileName = fileName;
		parseDocument();
		printData();
	}

	private void parseDocument() {
		// parse
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(fileName, this);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

}
