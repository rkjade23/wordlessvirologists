package GUI;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;

public class GameGUI extends JPanel implements MouseListener {
	private Assets ass = new Assets();
	private Display display;
	private BufferStrategy bs;
	private Graphics g;
	private int width = 1380;
	private int height = 690;
	private int mouseX, mouseY;
	
	 public JPanel pmap = new JPanel();
	    public JPanel plab = new JPanel();;
	    public JPanel pshelter = new JPanel();
	    public JPanel pstorage= new JPanel();
	    public JPanel pmeet = new JPanel();
	  static JPanel panelCont = new JPanel();
	    static CardLayout cl = new CardLayout();

	public GameGUI() {
		panelCont.setLayout(cl);
		//super();
		this.setSize(getPreferredSize());
		init();
		
		addMouseListener(this);
		
		cl.show(panelCont, "2");
    	this.add(panelCont);
    	this.setVisible(true);
	}

	public void init() {
		panelCont.add(plab,"3");
    	panelCont.add(pmap,"2");
    	panelCont.add(pshelter,"4");
    	panelCont.add(pstorage,"5");
    	panelCont.add(pmeet,"6");  	
		 
	}
	
	
	public void update() {
		/*key.update helyere valami*/
	}
    public void draw(){
    	bs = display.getCanvas().getBufferStrategy();
		if(bs==null) {
			display.getCanvas().createBufferStrategy(5);
			return;
		}
		g = bs.getDrawGraphics();
		
		
		g.clearRect(0, 0, width, height);
		
		
		/*if(State.getState()!=null) {
			State.getState().draw(g);
		}*/
		
		
		bs.show();
		g.dispose();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //State.getState().draw(g);
        
       // g.drawImage(State.getState().getImg(), 0, 0, this);
       // g.drawImage(Assets.agent, 10, 10, 50, 50, this);
    }
    
   /* @Override
    public void paint(Graphics g) {
    	g.drawImage(Assets.mapImage, 0, 0, getWidth(), getHeight(), null);
    }*/
    public int getX() {
    	return mouseX;
    }
    public int getY() {
    	return mouseY;
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
