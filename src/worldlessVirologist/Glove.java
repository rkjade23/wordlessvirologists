package worldlessVirologist;

public class Glove extends Equipment{
	
	public Glove() {
		this.name="Glove";
	}
	
	/**
	 *  the glove will help the virologist reverse the agenst
	 * @param v virologist who find a glove
	 *
	 */
	public void TakeEquip(Virologist v) {
		System.out.println("The Virologist takes a Glove");
		v.setEquipment(this);
		v.Reverse();
	}

	/**
	 * drop this eqipment and loose the special effect
	 */
	public void DropEquip(Virologist v, Field f) {
		System.out.println("The Virologist drops a Glove");
		v.removeEquipment(this);
	}
}

