package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MeetState  extends State {
	public static BufferedImage img = Assets.meetImage;

	public MeetState() {
		//super(img);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.meetImage, 0, 0, null);
		
	}

}
