package worldlessVirologist;

public class Dance extends Agent{
	public void Apply(Virologist v) {
		System.out.println("The Dance Agent is applied on the virologist!");
		v.RandomMove();
	}
	
	public void Unapply(Virologist v) {

	}

}
