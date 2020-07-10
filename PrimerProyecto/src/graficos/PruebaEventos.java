package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
}

class LaminaBotones extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(azul);
		botonAmarillo.addActionListener(amarillo);
		botonRojo.addActionListener(rojo);
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			this.colorDeFondo = c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
	}
}

