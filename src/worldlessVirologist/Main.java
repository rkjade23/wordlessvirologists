package worldlessVirologist;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.Assets;
import GUI.MainGUI;
import GUI.GameGUI;

import java.awt.Graphics;

public class Main {
	/*private Garphics g;
	public void paint(Graphics g) {
		g.drawImage(Assets.mapImage, 0, 0, 1380, 690, null);
	}*/
	
	 
	public static void main(String[] args){
		//Assets.init();
       // JFrame jf = new JFrame("kaki");
       /* Main m = new Main();
        JPanel jp= new JPanel();
        jp.setSize(new Dimension(690, 1380));
        ImageIcon img = new ImageIcon(Assets.mapImage);
        //jp.imageUpdate(Assets.mapImage,1, 0, 0, 1380, 690 );
        jp.paint(img);
        JLabel jl = new JLabel(img);
       // jl.setVisible(true);
       // jp.add(jl);
        jp.setVisible(true);*/
        //jf.setSize(1380, 690);
        //jf.add(jl);
       // jf.setVisible(true);
       // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       // MapGUI map = new MapGUI();
        
        //MainGUI m = new MainGUI();

        //jf.add(map);
        
        Game game = new Game();
        game.StartGame();

    }
}

