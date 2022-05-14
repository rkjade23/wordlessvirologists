package worldlessVirologist;

import java.util.List;

public class Empty extends Field{

	/**
	 * moving the virologist on an empty field 
	 * in case there is a bear agent the virologist get infect
	 * 
	 * @param v virologist who moves
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
        System.out.println("Moved to an Empty Field.");
    }
}
