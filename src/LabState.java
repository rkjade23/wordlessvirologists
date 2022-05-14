package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class LabState  extends State {

	public static BufferedImage img = Assets.laboratoryImage;
	
	
	public LabState() {
		//super(img);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.laboratoryImage, 0, 0, null);
		
	}

}
