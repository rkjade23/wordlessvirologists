package worldlessVirologist;

import java.util.List;
import java.util.Scanner;

public class Laboratory extends Field{
    private Agent agent;
    public Laboratory(Agent a) {
    	agent=a;
    }
    
    /**
     * move on a laborytory type of field
     * the player can decide if they want to learn genetic cod
     * if they havent got a cape they will get the bear agent in case the place is infected
     */
    @Override
    public void Accept(Virologist v){
    	if(v.getBear()) {
    		this.OnField=v;
        	v.setField(this);
        	return;
    	}
    	if(agent.name.equals("Bear")) {
    		agent.Apply(v);
    		return;
    	}
    	this.OnField=v;
    	v.setField(this);
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moved to a Laboratory.");
        System.out.println("Do you want to learn the genetic code? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            agent.Learn(v);
        }
    }
}