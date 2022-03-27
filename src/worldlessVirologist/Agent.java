package worldlessVirologist;

public abstract class Agent {
	private int amino;
	private int nucleo;
	
	public void Apply(Virologist v) {
		
	}
	
	public void Unapply(Virologist v) {
		
	}
	
	public void Learn(Virologist v) {
		v.addAgentKnown(this);
	}
}
