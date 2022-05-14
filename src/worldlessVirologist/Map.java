
package worldlessVirologist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    public List<Field> fields;
    static ArrayList<String> lines;
    public ArrayList<Virologist> viro= new ArrayList<Virologist>();;
    static char[][] field;
	static int col, row;
	private int numPlayer = 3;

	
	
    public Map(){
    
    	Virologist v1= new Virologist("v1");
    	viro.add(v1);
    	Virologist v2= new Virologist("v2");
    	viro.add(v2);
    	if (numPlayer == 3) {
    	Virologist v3 = new Virologist("v3");
    	viro.add(v3);}
    	if (numPlayer == 4) {
        	Virologist v3 = new Virologist("v3");
        	viro.add(v3);
        	Virologist v4 = new Virologist("v4");
        	viro.add(v4);
        	}
    	LoadMap();
    	
    }
    
    public int getNumPlayer() {
    	return numPlayer;
    }
    
    public void setNumPlayer(int i) {
    	numPlayer = i;
    }

    /**
	 * Load map from a txt file where the different numbers shows different kind of Fields
	 * 
	 */
    public void LoadMap(){
    	System.out.println("Loading map");
    	
    	lines = new ArrayList<String>();
    	fields = new ArrayList<Field>();
    	
    	try {
    		Scanner s = new Scanner(new File("map.txt"));
    		int r = 0;
    		while(s.hasNextLine()) {
    			String line = s.nextLine();
    			lines.add(line);
    			r++;
    		}
    		s.close();
    		row = lines.size();
    		col = lines.get(0).length();
    	} catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	field = new char[row][col];
    	for(int i = 0; i<row; i++) {
    		 System.arraycopy(lines.get(i).toCharArray(), 0, field[i], 0, col);
    	}
    	
    	for(int i = 0; i<row; i++)
        	for(int j=0; j<col; j++) {
        		if(field[i][j] == '0') {
                	fields.add(new Empty());
                	System.out.println("Adding empty field");
                }
        		
        		/**
        		 * Adding items to the map
        		 */
        		this.AddEquip(field[i][j]);
                this.AddMaterial(field[i][j]);
                this.AddGenCode(field[i][j]);
        	}
    	
    	/**
    	 * adding virologist to the map
    	 */
        this.AddVirologist();
        this.SetNeighbour();
        /*for(int i = 0; i<fields.size(); i++){
        	System.out.println(i+":"+fields.get(i).getNumofNeighs());
        }*/
    	System.out.println("Map loading is finished.\n");
    	for(int i=0;i<fields.size()-1;i++) {
    		fields.get(i).index = i;
    		System.out.print(i);
    	}
    }
    
    /**
     * virologist added to the corner of the map
     */
    public void AddVirologist(){
    	fields.get(0).Accept(viro.get(0));
    	fields.get(35).Accept(viro.get(1));
        System.out.println("Added virologists.");
    }

    /**
     * the numbers define which field contains the glove, cape, bag, axe
     * @param f recetly read field
     */
    public void  AddEquip(char f) {
    	
    	Equipment e;
    	
        if(f == '1') {
        	e = new Glove();
        	fields.add(new Shelter(e));
        	System.out.println("Adding Glove in Shelter.");
        }
        if(f == '2') {
        	e = new Cape();
        	fields.add(new Shelter(e));
        	System.out.println("Adding Cape in Shelter.");
        }
        if(f == '3') {
        	e = new Bag();
        	fields.add(new Shelter(e));
        	System.out.println("Adding Bag in Shelter.");
        }
        if(f == 'x') {
        	e = new Axe();
        	fields.add(new Shelter(e));
        	System.out.println("Adding Axe in Shelter.");
        }
        
    }

    
    /**
    * the numbers define which field contains the nucleo and amino
    * @param f recetly read field
    */
    public void AddMaterial(char f){
        
        Material m;
        
        if(f == '4') {
        	m = new Nucleo();
        	fields.add(new Storage(m));
            System.out.println("Placing Nucleo on Storage");
        }
        if(f == '5') {
        	m = new Amino();
        	fields.add(new Storage(m));
            System.out.println("Placing Amino on Storage");
        }
        
    }
    
    /**
    * the numbers define which field contains the amnesia, dance, stun and bear agents
    * @param f recetly read field
    */
    public void AddGenCode(char f) {
    	
    	Agent a;
    	
        if(f == '6') {
        	a = new Amnesia();
        	fields.add(new Laboratory(a));
        	System.out.println("Adding Amenisa agent in Laboratory.");
        }
        if(f == '7') {
        	a = new Dance();
        	fields.add(new Laboratory(a));
        	System.out.println("Adding Dance agent in Laboratory.");
        }
        if(f == '8') {
        	a = new SpellShield();
        	fields.add(new Laboratory(a));
        	System.out.println("Adding SpellShield agent in Laboratory.");
        }
        if(f == '9') {
        	a = new Stun();
        	fields.add(new Laboratory(a));
        	System.out.println("Adding Stun agent in Laboratory.");
        }
        if(f == 'B') {
        	a = new Bear();
        	fields.add(new Laboratory(a));
        	System.out.println("Adding Bear agent in Laboratory.");
        }
    }
    
    /**
     * setting the filed's neigbours
     */
    public void SetNeighbour() {
    	col=col-row+1;
    	for(int i = 0; i<fields.size(); i++){
    		
    		if(i%col!=0)
        	fields.get(i).AddNeighbour(fields.get(i-1));
    		
    		if(i%col!=col-1)
    		fields.get(i).AddNeighbour(fields.get(i+1));
    		
    		if(i>=row)
            fields.get(i).AddNeighbour(fields.get(i-row));
    		
    		if(i<row*(col-1))
        	fields.get(i).AddNeighbour(fields.get(i+row));
    			
        }
    	System.out.println("Neighbours added!");
    }
}