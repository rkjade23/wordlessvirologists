package worldlessVirologist;

public class Amino extends Material{
	public Amino() {
		this.name="Amino";
	}
	
	public void store(Virologist v) {
		v.addMaterial(this);
	}

}
