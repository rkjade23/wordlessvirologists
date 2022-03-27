package worldlessVirologist;

public class Amnesia extends Agent {
	public void Apply(Virologist v) {
		System.out.println("Amnesia is applied on the Virologist!");
		v.Forget();
	}
	
	public void Unapply(Virologist v) {
	}
}
