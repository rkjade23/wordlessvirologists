package worldlessVirologist;

public class Amnesia extends Agent {
	
	public Amnesia() {
		this.name="Amnesia";
	}
	
	/**
	 * After apply, the virologist forgets all the agent
	 * @param v virologist, who receive the amnesia agent
	 * 
	 */
	public void Apply(Virologist v) {
		System.out.println("Amnesia is applied on "+ v.getName()+ "!");
		v.Forget();
	}
	
	public void Unapply(Virologist v) {
	}
	
	/**
	 * The amnesia agent will be added to the virologist's agents list
	 * @param v virologist, who learn a new agnet
	 * 
	 */
	public void Learn(Virologist v) {
		v.addAgentKnown(this);
	}
}
