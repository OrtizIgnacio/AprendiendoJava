package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor miMarco = new MarcoConColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Prueba con colores");
		setSize(400, 400);
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.BLACK);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(109, 172, 59));
		g2.fill(elipse);
	}
}