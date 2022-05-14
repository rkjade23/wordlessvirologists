package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ShelterState  extends State {
	public static BufferedImage img = Assets.shelterImage;

		// TODO Auto-generated constructor stub
	public ShelterState() {
		//super(img);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.shelterImage, 0, 0, null);
		
	}

}
