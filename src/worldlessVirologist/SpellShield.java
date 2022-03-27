package worldlessVirologist;

public class SpellShield extends Agent {
	public void Apply(Virologist v) {
		System.out.println("SpellShield is applied on the Virologist!");
		v.Defense(true);
	}
	
	public void Unapply(Virologist v) {
		System.out.println("SpellShield is unapplied on the Virologist!");
		v.Defense(false);
	}
}
