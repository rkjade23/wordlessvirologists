package worldlessVirologist;

import java.util.Scanner;

public class Stun extends Agent{
	
	public Stun() {
		this.name="Stun";
	}
	
	/**
	 * After apply the virologist can't get any agent
	 * @param v virologist, who receive the spellshield agent
	 * 
	 */
	public void Apply(Virologist v) {
		
        
		System.out.println(v.getName() + " is Stunned!");
		v.Paralyze(false);
		
	}
	
	public void Unapply(Virologist v) {
		System.out.println(v.getName() + " is no longer Stunned!");
		v.Paralyze(true);
	}
	
	public void Learn(Virologist v) {
		v.addAgentKnown(this);
	}
}
