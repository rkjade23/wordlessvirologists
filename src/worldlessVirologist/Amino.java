package worldlessVirologist;

public class Amino extends Material{
	public Amino() {
		this.name="Amino";
	}
	
	/**
	 * @param v virologist, who pick up amino acid
	 * Material added to the virologist storage
	 */
	public void store(Virologist v) {
		v.addMaterial(this);
	}

}
