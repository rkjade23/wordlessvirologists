package worldlessVirologist;

public class Glove extends Equipment{
	
	public Glove() {
		this.name="Glove";
	}
	
	public void TakeEquip(Virologist v) {
		System.out.println("The Virologist takes a Glove");
		v.setEquipment(this);
		v.Reverse();
	}

	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops a Glove");
		v.removeEquipment(this);
	}
	
	
	
}

