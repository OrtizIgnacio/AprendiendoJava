package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		try {
			this.imagen = ImageIO.read(new File("src/graficos/bola.gif"));
			}
			catch(IOException e) {
				System.out.println("La imagen no se ha podido encontrar");
			}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//File miImagen = new File("src/graficos/coche.png");
		
		int alturaImagen = this.imagen.getHeight(this);
		int anchuraImagen = this.imagen.getWidth(this);
		
		g.drawImage(this.imagen, 0, 0, null);
		
		for(int i = 0; i < 300; i++) {
			
			for(int j = 0; j < 200; j++) {
				if(i+j>0) {
					
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}
			}
		}
		
	}
	
	private Image imagen;
}