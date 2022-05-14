package GUI;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGUI extends JFrame {
	private Display dis = new Display(1380, 690);
    
    private GameGUI map;
   JPMapState Map = new JPMapState();
    static JPanel pmenu = new JPanel();    

   /* public void paint(Graphics g) {
    	g.drawImage(Assets.mapImage, 0, 0, 1380, 690, null);
    }*/
    
    static JPanel panelCont = new JPanel();
    static CardLayout cl = new CardLayout();
		
    public MainGUI(){
    	super("Worldless virologist");
    	panelCont.setLayout(cl);
    	map = new GameGUI();
    	
    	panelCont.add(Map,"2");
    	this.add(panelCont);
    	
    	cl.show(panelCont, "2");
    	//this.add(dis.getCanvas());
    	this.setSize(new Dimension(1380, 720));
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	

    	
    	
    }

    public void ChangePanel(){

    }
    public void Run(){

    }

}
