package worldlessVirologist;

public class SpellShield extends Agent {
	
	public SpellShield() {
		this.name="Spellshield";
	}
	
	/**
	 * After apply the virologist can't get any agent
	 * @param v virologist, who receive the spellshield agent
	 * 
	 */
	public void Apply(Virologist v) {
		System.out.println("SpellShield is applied on "+ v.getName()+ "!");
		v.Defense(true);
	}
	
	/**
	 * the virologist is defetalbe again
	 */
	public void Unapply(Virologist v) {
		System.out.println("SpellShield is unapplied on "+ v.getName()+ "!");
		v.Defense(false);
	}
	
	/**
	 * The spellshield agent will be added to the virologist's agents list
	 * @param v virologist, who learn a new agnet
	 * 
	 */
	public void Learn(Virologist v) {
		v.addAgentKnown(this);
		
	}
}
