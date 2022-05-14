package worldlessVirologist;

public class Bag extends Equipment {
	
	public Bag() {
		this.name="Bag";
	}
	
	/**
	 *  the bag will extend the virologist storage capacity
	 * @param v virologist who find a bag
	 *
	 */
	public void TakeEquip(Virologist v) {
		
		v.setEquipment(this);
		v.Extend();
	}

	/**
	 * drop down this equipment a lost the extra capacity
	 */
	public void DropEquip(Virologist v, Field f) {
		
		v.removeEquipment(this);
	}
}
