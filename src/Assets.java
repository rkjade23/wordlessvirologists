package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {


	// Képek a grafikához.
		public static BufferedImage virologist1, virologist2, virologist3, virologist4, meetImage, mapImage, shelterImage, storageImage, laboratoryImage, emptyImage, menuImage, bear, axe, agent, material, coat, glove, bag, mask; 
		// A szellemek különbözõ módjához tartozó képek kihvágásához szükséges tömbök.
		public static BufferedImage gh[], bg[], wg[];
		
		// Képek betöltése.
		public static void init() {
			
			try {
				virologist1 = ImageIO.read(new File("images/vir1.png"));
				virologist2 = ImageIO.read(new File("images/vir2.png"));
				virologist3 = ImageIO.read(new File("images/vir3.png"));
				virologist4 = ImageIO.read(new File("images/vir4.png"));
				mapImage = ImageIO.read(new File("images/hatter_jatek.png"));
				shelterImage = ImageIO.read(new File("images/ovohely.png"));
				storageImage = ImageIO.read(new File("images/raktar.png"));
				laboratoryImage = ImageIO.read(new File("images/labor.png"));
				//emptyImage = ImageIO.read(new File("images/sel.png"));
				menuImage = ImageIO.read(new File("images/menu.png"));
				meetImage = ImageIO.read(new File("images/ures.png"));
				bear = ImageIO.read(new File("images/medve.png"));
				axe = ImageIO.read(new File("images/balta.png"));
				agent = ImageIO.read(new File("images/agens.png"));
				material = ImageIO.read(new File("images/material.png"));
				coat = ImageIO.read(new File("images/kopeny.png"));
				glove = ImageIO.read(new File("images/kesztyu.png"));
				bag = ImageIO.read(new File("images/taska.png"));
				mask = ImageIO.read(new File("images/amaszk.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			
		}
}
