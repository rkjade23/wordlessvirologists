package worldlessVirologist;

import java.util.List;
import java.util.Scanner;

public class Shelter extends Field{
    private Equipment equipment;

    public Shelter(Equipment e) {
    	equipment=e;
    }
    /**
     * move on a shelter type of field
     * the player can decide if they want to pick up the eqipment there
     * or if they have got the bear virus they cant pick up anything
     */
    @Override
    public void Accept(Virologist v){
    	if(v.getBear()) {
    		this.OnField=v;
        	v.setField(this);
        	return;
    	}
    	this.OnField=v;
    	v.setField(this);
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Moved to a Shelter.");
        System.out.println("Do you want to pick up equipment? 1: yes/ 2: no");
        x= sc.nextInt();
        if(x==1){
            v.PickUpItem(equipment);
        }
    }
}
