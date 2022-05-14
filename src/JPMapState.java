package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import worldlessVirologist.Map;

public class JPMapState extends JPanel implements MouseListener{
	
	Map map = new Map();

	int mouseX = 358;
	int mouseY = 15;
	JButton button;
	
	public JPMapState() {
		super();
		button = new JButton();
		this.setSize(getPreferredSize());
		button.setBounds(65, 600, 200, 70);
		button.setOpaque(false);
		this.add(button);
		
		this.setLayout(null);
		
		addMouseListener(this);
		this.setVisible(true);
		
	}
	
	 @Override
	public void paint(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(Assets.mapImage,0, 0, 1380, 690, this);
	        //g.drawImage(Assets.laboratoryImage, 358+(map.viro.get(0).getField().index/60)*90, 15+(map.viro.get(0).getField().index%60)*90, 90, 90, null);
			//g.drawImage(Assets.shelterImage, 358+(map.viro.get(1).getField().index/60)*100, 14, 90, 90, null);
			//g.drawImage(Assets.shelterImage, 473, 130, 90, 90, null);
			
			g.drawImage(Assets.virologist1, 0, 0, 250,300, null);
			g.drawImage(Assets.virologist2, 1130, 0, 250,300, null);
			if (map.getNumPlayer() == 3) {
			g.drawImage(Assets.virologist3, 0, 300,250,300, null);
			}
			if (map.getNumPlayer() == 4) {
				g.drawImage(Assets.virologist3, 0, 300,250,300, null);			
			g.drawImage(Assets.virologist4, 1130, 300, 250,300, null);
			
			}
			g.drawImage(Assets.mask,(mouseX),(mouseY), 90, 90, null);
			
			
	 }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX()-45;
		mouseY = e.getY()-45;
		
		if (mouseX > 325 && mouseX < 960 && mouseY > -10 && mouseY < 920)
			repaint();
		
		
		
		
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
