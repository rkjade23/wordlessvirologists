package worldlessVirologist;

public class Bag extends Equipment {
	public void TakeEquip(Virologist v) {
		System.out.println("The Virologist takes a Bag");
		v.setEquipment(this);
		v.Extend();
	}

	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops a Bag");
		v.removeEquipment(this);
	}
}
