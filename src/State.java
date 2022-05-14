package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

abstract class State {
	

	public abstract void update();
	public abstract void draw(Graphics g);


}
