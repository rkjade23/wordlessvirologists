package worldlessVirologist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Virologist {
	private String name;
	private boolean mobility;
	private boolean protect;
	private List<Agent> agentsOwned;
	private List<Agent> agentsKnown;
	private List<Equipment> equipmentsOwned;
	private List<Material> materialsOwned;
	private Field field;

	public Virologist(String n) {
		this.name = n;
		this.mobility = true;
		this.agentsOwned = new ArrayList<Agent>();
		this.agentsKnown = new ArrayList<Agent>();
		this.equipmentsOwned = new ArrayList<Equipment>();
		this.materialsOwned = new ArrayList<Material>();
		this.protect=false;
	}
	
	public void setMobility(boolean b) {
		this.mobility=b;
		System.out.println("Mobility status changed!");
	}
	
	public void addAgentKnown(Agent a) {
		this.agentsKnown.add(a);
		System.out.println("Successfully learned the agent!");
	}
	
	public void setEquipment(Equipment e) {
		this.equipmentsOwned.add(e);
		System.out.println("Successfully equipped!");
	}
	
	public void removeEquipment(Equipment e) {
		this.equipmentsOwned.remove(e);
		System.out.println("Successfully unequipped!");
	}
	
	public void addMaterial(Material m) {
		this.materialsOwned.add(m);
		System.out.println("The material was picked up!");
	}
	
	
	public Field getField(){
		return field;
	}

	//Move->lépés választása-> lépés -> mezõ kiírása ->elem felvétele?
	public void Move(Field f1) {
		if(f1.IsNeighbour(f1)) {
			f1.Remove(this);
			f1.Accept(this);
		}
	}
	
	public void Use( Virologist v, Agent a) {
		int x;
		Scanner sc = new Scanner(System.in);

		v.equipmentsOwned.contains("glove");
		v.equipmentsOwned.contains("cape");
		System.out.println("Use agent on 1: myself/2: other virologist");
		x= sc.nextInt();
		if(x==1) {
			a.Apply(this);
		}
		else {
			a.Apply(v);
		}
	}
	
	public void PickUpItem(Equipment e) {
		e.TakeEquip(this);
	}
	
	public void Make(Material m, Agent a) {
		if(agentsKnown.contains(a)) {
			if (materialsOwned.size() >= 3)
				agentsOwned.add(a);
				materialsOwned.clear();
		}
	}
	
	public void Paralyze() {
		System.out.println("A virológus lebénult.");
	}
	
	public void RandomMove() {
		System.out.println("The Virologist is dancing!");
	}
	
	public void Untouchable() {
		System.out.println("A virológus érinthetetlenné vált!");
	}
	
	public void Forget() {
		this.agentsKnown.clear();
		System.out.println("Virologist forgot all the Agents!");
	}
	
	public void Extend() {
		System.out.println("The Virologist has more storage for materials!");
	}
	
	public void Defense(boolean b) {
		this.protect=b;
		System.out.println("The Virologist's protected status changed!");
	}
	
	public void Reverse() {
		System.out.println("The Virologist will reverse the agent, that was applied on him!");
	}
	
	public void PickUpMaterial(Material m) {
		m.store(this);
		System.out.println("The Virologist is picking up a material!");
	}
	
	public void RemoveEffect(Agent a) {
		a.Unapply(this);
	}
	
	public void DropItem(Equipment e) {
		e.DropEquip(this, field);
		System.out.println("The Virologist is dropping an item!");
	}
	
	public void StealItem(Virologist v, Equipment e) {
		v.DropItem(e);
		System.out.println("The Virologist is stealing an item!");
		this.PickUpItem(e);

	}
}