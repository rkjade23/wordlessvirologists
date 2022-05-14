package worldlessVirologist;

public class Cape extends Equipment {
	
	public Cape() {
		this.name="Cape";
	}
	
	/**
	 *  the cape will defend the virologist
	 * @param v virologist who find the cape
	 *
	 */
	public void TakeEquip(Virologist v) {
		System.out.println("The Virologist takes a Cape");
		v.setEquipment(this);
		v.Defense(true);
	}

	/**
	 * drop this eqipment and loose the special effect
	 */
	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops a Cape");
		v.removeEquipment(this);
	}
}
