package worldlessVirologist;

public class Cape extends Equipment {
	public void TakeEquip(Virologist v) {
		System.out.println("The Virologist takes a Cape");
		v.setEquipment(this);
		v.Defense(true);
	}

	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops a Cape");
		v.removeEquipment(this);
	}
}
