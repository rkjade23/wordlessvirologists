package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import worldlessVirologist.Map;


public class MapState /*extends State*/{
	//public static BufferedImage img = Assets.mapImage;
	Map map = new Map();
	
	public MapState() {
		super();
	}

	
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public void moveToN() {
		
	}

	public void draw(Graphics g) {
		g.drawImage(Assets.mapImage, 0, 0, null);
		g.drawImage(Assets.virologist1, 0, 0, 250,300, null);
		g.drawImage(Assets.laboratoryImage, 358, 14, 90, 90, null);
		g.drawImage(Assets.shelterImage, 473, 14, 90, 90, null);
		g.drawImage(Assets.shelterImage, 473, 130, 90, 90, null);
		
		g.drawImage(Assets.virologist2, 1130, 0, 250,300, null);
		if (map.getNumPlayer() == 3) {
		g.drawImage(Assets.virologist3, 0, 300,250,300, null);
		}
		if (map.getNumPlayer() == 4) {
			g.drawImage(Assets.virologist3, 0, 300,250,300, null);			
		g.drawImage(Assets.virologist4, 1130, 300, 250,300, null);
		
	}
	}

}
