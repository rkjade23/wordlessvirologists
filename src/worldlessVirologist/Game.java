package worldlessVirologist;

import java.util.Scanner;

import GUI.MainGUI;

public class Game {
    private int rounds=1;
    private Map map;
    private boolean gameActive;
	private MainGUI mainG;

    public Game(){

        map = new Map();
        gameActive=false;
		

    }

   
    /**
     * starting the game,
     * load the map,
     * wait for the player to insert the commands
     */
    public void StartGame(){
        System.out.println("Starting game");
        gameActive = true;
        Virologist curr=null;
        map.LoadMap();
        mainG = new MainGUI();
        while(NextRound()) {
        	curr=map.viro.get(0);
        	
        	if(curr.checkGlove()) {
        		curr.setGloves();
        		if(curr.getGloves()==3) {
        			curr.DropItem(new Glove());
					System.out.println(curr.getName()+" has no glove available!");
        		}
        	}
        	
        	if(!curr.getDie()) {
	        	if(!curr.getBear()) {
	        		System.out.println(curr.getName()+"'s turn");
		        	Scanner sc= new Scanner(System.in);
		
		        	String input = sc.nextLine();
		        	
		        	String[] cmd=input.split(" ",3);
		        	
		        	if(cmd[0].equals("move")) {
		        		curr.Move(map.fields.get(Integer.valueOf(cmd[1])));
		        	}
		        	if(cmd[0].equals("use")) {
		        		curr.Use(getV(cmd[1]),curr.getKnownA(cmd[2]));
		        	}
		        	if(cmd[0].equals("make")) {
		        		curr.Make(curr.getKnownA(cmd[1]));
		        	}
		        	if(cmd[0].equals("kill")) {
		        		curr.UseAxe(getV(cmd[1]));
		        	}
	        	} else curr.RandomMove();
        	}else System.out.println(curr.getName()+" is dead!");
        	
        	
        	curr=map.viro.get(1);
        	
        	if(curr.checkGlove()) {
        		curr.setGloves();
        		if(curr.getGloves()==3) {
        			curr.DropItem(new Glove());
					System.out.println(curr.getName()+" has no glove available!");
        		}
        	}
        	
        	if(!curr.getDie()) {
	        	if(!curr.getBear()) {
	        		System.out.println(curr.getName()+"'s turn");
		        	Scanner sc= new Scanner(System.in);
		
		        	String input = sc.nextLine();
		        	
		        	String[] cmd=input.split(" ",3);
		        	if(cmd[0].equals("move")) {
		        		curr.Move(map.fields.get(Integer.valueOf(cmd[1])));
		        		
		        	}
		        	if(cmd[0].equals("use")) {
		        		curr.Use(getV(cmd[1]),curr.getKnownA(cmd[2]));
		        	}
		        	if(cmd[0].equals("make")) {
		        		curr.Make(curr.getKnownA(cmd[1]));
		        	}
		        	if(cmd[0].equals("kill")) {
		        		curr.UseAxe(getV(cmd[1]));
		        	}
	        	} else curr.RandomMove();
        	}else System.out.println(curr.getName()+" is dead!");
        }
    }

    public void EndGame(){
        System.out.println("Ending game");
        gameActive= false;

    }
    public Virologist getV(String name) {
    	for(Virologist a: map.viro) {
			if(a.getName().equals(name)) return a;
		
		}
		return null;
    }

    public boolean NextRound(){
    	
        for(int i=0;i<map.viro.size();i++) {
        	if(map.viro.get(i).checkNumOfAgents()) return false;
        	
        }
        
    	System.out.println("\nRound: "+rounds);
        rounds++;
        return true;
    }
//    
//    public Virologist getCurr() {
//    	return curr;
//    }
}
