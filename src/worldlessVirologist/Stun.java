package worldlessVirologist;

public class Stun extends Agent{
	
	public void Apply(Virologist v) {
		System.out.println("The Virologist is Stunned!");
		v.setMobility(false);
	}
	
	public void Unapply(Virologist v) {
		System.out.println("The Virologist is no longer Stunned!");
		v.setMobility(true);
	}
}
