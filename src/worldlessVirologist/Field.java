package worldlessVirologist;

import java.util.ArrayList;

public abstract class Field {
    protected Virologist OnField;
    private ArrayList<Field> neighbours= new ArrayList<Field>();
    public int index;
    

    
	public void Accept(Virologist v) {
		v.setField(this);
	};

    public void Remove(Virologist v){
        System.out.println(v.getName()+" left the field!");
        OnField=null;
    }
    
    public int getNumofNeighs(){
       return neighbours.size();
    }
    
    public Field randomField(int n) {
    	return neighbours.get(n);
    }

    public boolean IsNeighbour(Field f){
        
        return neighbours.contains(f);

    }
    
    public void AddNeighbour(Field f ) {
    	neighbours.add(f);
    	
    	
    }
    

}
