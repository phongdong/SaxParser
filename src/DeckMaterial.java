import java.util.List;

public class DeckMaterial {
	private String deckMaterial = "";
	private String deckMaterialValueSrc = "";
	
	public String getDeckMaterial() {
		return deckMaterial;
	}
	public void setDeckMaterial(String deckMaterial) {
		this.deckMaterial = deckMaterial;
	}
	public String getDeckMaterialValueSrc() {
		return deckMaterialValueSrc;
	}
	public void setDeckMaterialValueSrc(String deckMaterialValueSrc) {
		this.deckMaterialValueSrc = deckMaterialValueSrc;
	}
	
	public String toString(List<DeckMaterial> deckMaterials) {
		if (deckMaterials.size() == 0) return "";
		else 
			return ", DECK_CD: " + deckMaterials.get(0).getDeckMaterial() + ", DECK_SRC: " + deckMaterials.get(0).getDeckMaterialValueSrc();
	}

}
