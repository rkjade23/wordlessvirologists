package worldlessVirologist;

public class Dance extends Agent{
	
	public Dance() {
		this.name="Dance";
	}
	
	/**
	 * After apply, the virologist start moves randomly
	 * @param v virologist, who receive the dancee agent
	 * 
	 */
	public void Apply(Virologist v) {
		System.out.println("The Dance Agent is applied on "+ v.getName()+ "!");
		v.RandomMove();
	}
	
	public void Unapply(Virologist v) {

	}
	
	/**
	 * The dance agent will be added to the virologist's agents list
	 * @param v virologist, who learn a new agnet
	 * 
	 */
	public void Learn(Virologist v) {
		v.addAgentKnown(this);
	}

}
