package GUI;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	private Canvas canvas;
	private JFrame frame;
	private int width, height;
	
	public Display(int h, int w){
		Assets.init();

		height = h;
		width = w;
		canvas = new Canvas();
		/*frame = new JFrame("Worldless Virologist");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);*/
        canvas.setSize(new Dimension(width, height));
        canvas.setFocusable(true);
        canvas.imageUpdate(Assets.mapImage,0, 0, 0, 1380, 690);
        canvas.setVisible(true);
        
        //frame.add(canvas);
        //frame.pack();

	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	public JFrame getFrame() {
		return frame;
	}
		
	public int getWidth() {
			return width;
	}
		
		// Visszaadja az ablak magasságát.
		public int getHeight() {
			return height;
		}
	}
	


