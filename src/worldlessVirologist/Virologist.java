package worldlessVirologist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Virologist {
	private String name;
	private boolean mobility;
	private boolean protect;
	private boolean bear;
	private boolean die;
	private List<Agent> agentsOwned;
	private List<Agent> agentsKnown;
	private List<Equipment> equipmentsOwned;
	private List<Material> materialsOwned;
	private Field field;
	private int gloveExpires;
 
	public String getName() {
		return name;
	}
	
	public void setBear() {
		bear=true;
	}
	
	public boolean getBear() {
		return bear;
	}
	
	public boolean getDie() {
		return die;
	}
	
	public int getGloves() {
		return gloveExpires;
	}
	
	public void setGloves() {
		this.gloveExpires++;
	}
	
	public Agent getKnownA(String agentname) {
		for(Agent a: this.agentsKnown) {
			if(a.name.equals(agentname)) return a;
		
		}
		return null;
	}

	public Virologist(String n) {
		this.name = n;
		this.mobility = true;
		this.bear = false;
		this.die = false;
		this.agentsOwned = new ArrayList<Agent>();
		this.agentsKnown = new ArrayList<Agent>();
		this.equipmentsOwned = new ArrayList<Equipment>();
		this.materialsOwned = new ArrayList<Material>();
		this.protect=false;
		this.field = null;
		gloveExpires=0;
	}
	
	public void setField(Field f) {
		this.field=f;
	}
	
	/**
	 * checks the number of known agent
	 * @return if 4 it returns true else it's false
	 */
	public boolean checkNumOfAgents() {
		if(this.agentsKnown.size()==4) return true;
		else return false;
	}
	
	/**
	 * checks if the virologist wears a glove
	 * @return true if it has glove and false if it hasn't
	 */
	public boolean checkGlove() {
		for(Equipment element : equipmentsOwned) {
			if(element.name.equals("Glove")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * checks if the virologist has an axe
	 * @return true if it has axe and false if it hasn't
	 */
	public boolean checkAxe() {
		for(Equipment element : equipmentsOwned) {
			if(element.name.equals("Axe")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * checks if the virologist wears a cape
	 * @return true if it has cape and false if it hasn't
	 */
	public boolean checkCape() {
		for(Equipment element : equipmentsOwned) {
			if(element.name=="Cape") {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * checks if the virologist wears a bag
	 * @return true if it has bag and false if it hasn't
	 */
	public boolean checkBag() {
		for(Equipment element : equipmentsOwned) {
			if(element.name=="Bag") {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * this agent is added to the list of known agents (agentsKnown)
	 * @param a Agent is learned by the virologist
	 * 
	 */
	public void addAgentKnown(Agent a) {
		this.agentsKnown.add(a);
		System.out.println(name+" successfully learned the "+a.name+" agent!");
	}
	
	/**
	 * this equipment is added to the list of owned equipments (eqipmentOwned)
	 * @param e Equipment is picked up by the virologist
	 * 
	 */
	public void setEquipment(Equipment e) {
		this.equipmentsOwned.add(e);
		System.out.println(name+" successfully equipped "+e.name+"!");
	}
	
	/**
	 * this item will removed from the owned equipment list
	 * @param e Equipment that the virologist wish to loose
	 * 
	 */
	public void removeEquipment(Equipment e) {
		System.out.println(name+" successfully unequipped "+e.name+"!");
		this.equipmentsOwned.remove(e);
		
	}
	
	/**
	 * this will added to the list of owned materials
	 * @param m Material picked up by the virologist
	 * 
	 */
	public void addMaterial(Material m) {
		this.materialsOwned.add(m);
		System.out.println(name+" picked up a "+m.name);
	}
	
	
	public Field getField(){
		return field;
	}

	/**
	 * before the virologist make a move the function checks the necessary conditions
	 * @param f1 the field, where the virologist want to move
	 * 
	 */
	public void Move(Field f1) {
		if(mobility) {
			if(field.IsNeighbour(f1)) {
				field.Remove(this);
				f1.Accept(this);
				
			}else System.out.println("The Field is too far away from "+name+"!");
	}else System.out.println(name+" is stunned!");
	}
	
	
	/**
	 * the player applies the a Agent on v Virologist
	 * before this action the funciton checks the equipments on the v Virologist
	 * @param v Virologist who the agent is applied on
	 * @param a Agent is in use
	 * 
	 */
	public void Use( Virologist v, Agent a) {
		if(agentsOwned.contains(a)  && v.getField()==this.field) {
			
			if(v.checkGlove()) {
				System.out.println("The agent was reversed!");
				a.Apply(this);
				System.out.println(a.name+"is applied on"+name);
				if(a.name.equals("Stun")) {
					System.out.println("Do you want to rob him? 1: yes/ 2: no");
					Scanner sc = new Scanner(System.in);
			        int x= sc.nextInt();
			        if(x==1){
			            v.StealItem(this,new Bag());
			        }
				}
			}else if(v.checkCape()) {
				Random rand = new Random();
				int n = rand.nextInt(100)+1;
				if(n>83) {
					a.Apply(v);
					System.out.println(a.name+"is applied on"+v.getName());
					if(a.name.equals("Stun")) {
						System.out.println("Do you want to rob him? 1: yes/ 2: no");
						Scanner sc = new Scanner(System.in);
				        int x= sc.nextInt();
				        if(x==1){
				            this.StealItem(v,new Bag());
				        }
					}
				}else System.out.println(name+" was protected by the cape!");
			}else {
				if(a.name.equals("Stun")) {
					a.Apply(v);
					System.out.println(a.name+"is applied on"+v.getName());
					System.out.println("Do you want to rob him? 1: yes/ 2: no");
					Scanner sc = new Scanner(System.in);
			        int x= sc.nextInt();
			        if(x==1){
			            this.StealItem(v,new Bag());
			        }
				}else {
					a.Apply(v);
					System.out.println(a.name+"is applied on"+v.getName());
				}
			}
		
	}else System.out.println("The agent is not made yet");
	
}
	
	/**
	 * 
	 * @param e Equipment that the virologist picks up
	 */
	public void PickUpItem(Equipment e) {
		e.TakeEquip(this);
	}
	
	/**
	 * activate the die state
	 */
	public void Die() {
		die=true;
	}
	
	/**
	 * the v virologist got killed
	 * if it got the bear virus and the current player has an axe 
	 * @param v Virologist who got the bear virus
	 * 
	 * 
	 */
	public void UseAxe(Virologist v) {
		if(v.getBear()) {
			if(checkAxe()) {
				v.Die();
			}else System.out.println(name+" has no axe available!");
		}else System.out.println(v.name+" is not affected by Bear agent!");
	}
	
	/**
	 * it's possible if all the criteria is valid
	 * @param a Agent the player want to make
	 * 
	 */
	public void Make(Agent a) {
		if(agentsKnown.contains(a)) {
			if (materialsOwned.size() >= 3) {
				agentsOwned.add(a);
				materialsOwned.clear();
				System.out.println("Succesfully made the Agent!");
			}else {
				System.out.println("Failed to make the Agent!");
			}
		}else {
			System.out.println("Genetic code of the agent is not known");
		}
	}
	
	/**
	 * set the moving abality of the virologist 
	 * @param b Boolend which desides if the virologist can move or not
	 */
	public void Paralyze(boolean b) {
		this.mobility=b;
		System.out.println("Mobility status changed!");
		
	}
	
	/**
	 * Random generated the moves to the player
	 */
	public void RandomMove() {
		int n=this.field.getNumofNeighs();
		Random rand = new Random();
		int x = rand.nextInt(n);
		this.Move(field.randomField(x));
		System.out.println(name+" is moving randomly!");
	}
	
	/**
	 * player forgets all the learned agents
	 */
	public void Forget() {
		this.agentsKnown.clear();
		System.out.println(name+" forgot all the Agents!");
	}
	
	/**
	 * the storage get extended
	 */
	public void Extend() {
		System.out.println(name+" has more storage for materials!");
	}
	
	/**
	 * @param b Boolean to show if the defense is successful or not
	 */
	public void Defense(boolean b) {
		this.protect=b;
		System.out.println(name+" 's protected status changed!");
	}
	
	public void Reverse() {
		System.out.println(name+" will reverse the next agent applied on him!");
	}
	
	/**
	 * the funciton check if there is enough space
	 * @param m Material that the player wants to pick up
	 * 
	 */
	public void PickUpMaterial(Material m) {
		System.out.println(name+" is picking up a material!");
		if(materialsOwned.size()<=3 || checkBag()) {
			m.store(this);
		}else {
			System.out.println(name+" 's inventory is full!");
		}
	}
	
	public void RemoveEffect(Agent a) {
		a.Unapply(this);
	}
	
	public void DropItem(Equipment e) {
		System.out.println(name+" is dropping an item!");
		e.DropEquip(this, field);
		
	}
	
	/**
	 * if the robber has enough space the v Virologist lost the e Equipment
	 * @param v Virologist who got robbed
	 * @param e Equipment taken
	 * 
	 */
	public void StealItem(Virologist v, Equipment e) {
		if(this.equipmentsOwned.size()<=3) {
			System.out.println(name+" is stealing an item!");
			v.DropItem(e);
			this.PickUpItem(e);
		}else {System.out.println(name+" has no space in inventory!");}
		
	}
	
}