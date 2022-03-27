package worldlessVirologist;

public class Nucleo extends Material{
	public Nucleo() {
		this.name="Nucleo";
	}
	
	public void store(Virologist v) {
		v.addMaterial(this);
	}
}
